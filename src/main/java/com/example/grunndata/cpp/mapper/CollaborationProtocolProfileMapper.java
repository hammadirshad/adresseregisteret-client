package com.example.grunndata.cpp.mapper;

import com.example.model.*;
import com.example.schema.cpa.*;
import com.example.schema.xmldsig.KeyInfoType;
import com.example.schema.xmldsig.X509DataType;
import com.example.utils.CertificateUtils;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class CollaborationProtocolProfileMapper {

    /**
     * @param counterpartyHerId Integer
     * @param cpaId             String
     * @param partyInfo         PartyInfo
     * @param packagings        List<Packaging>
     * @param simpleParts       List<SimplePart> simpleParts
     * @return CollaborationProtocolRoleModel
     */
    public CollaborationProtocolProfileModel createCollaborationProtocolProfileModel(
            Integer counterpartyHerId,
            String cpaId,
            PartyInfo partyInfo,
            List<Packaging> packagings,
            List<SimplePart> simpleParts) {

        CollaborationProtocolProfileModel profileModel = new CollaborationProtocolProfileModel();
        profileModel.setHerId(counterpartyHerId);
        profileModel.setCpaId(cpaId);
        profileModel.setName(partyInfo.getPartyName());

        Certificate encCertificate =
                partyInfo.getCertificate().stream()
                        .filter(certificate -> certificate.getCertId().equals("enc"))
                        .findAny()
                        .orElse(null);

        if (encCertificate != null) {
            CertificateModel encryptionCertificate = unPackCertificate(encCertificate);
            profileModel.setEncryptionCertificate(encryptionCertificate);
        }

        Certificate signCertificate =
                partyInfo.getCertificate().stream()
                        .filter(certificate -> certificate.getCertId().equals("sign"))
                        .findAny()
                        .orElse(null);

        if (signCertificate != null) {
            CertificateModel signatureCertificate = unPackCertificate(signCertificate);
            profileModel.setSignatureCertificate(signatureCertificate);
        }

        List<CollaborationProtocolRoleModel> collaborationProtocolRoles = new ArrayList<>();
        for (CollaborationRole collaborationRole : partyInfo.getCollaborationRole()) {
            collaborationProtocolRoles.add(
                    createCollaborationProtocolRole(collaborationRole, partyInfo, packagings, simpleParts));
        }

        profileModel.setRoles(collaborationProtocolRoles);

        return profileModel;
    }

    /**
     * @param collaborationRole CollaborationRole
     * @param partyInfo         PartyInfo
     * @param packagings        List<Packaging>
     * @param simpleParts       List<SimplePart> simpleParts
     * @return CollaborationProtocolRoleModel
     */
    private CollaborationProtocolRoleModel createCollaborationProtocolRole(
            CollaborationRole collaborationRole,
            PartyInfo partyInfo,
            List<Packaging> packagings,
            List<SimplePart> simpleParts) {

        //  <tns:CollaborationRole >
        //      <tns:ProcessSpecification tns:name="Dialog_Innbygger_Digitalbruker" tns:version="1.1"
        // xlink:type="simple"
        // xlink:href="http://www.helsedirektoratet.no/processes/Dialog_Innbygger_Ekonsultasjon.xml"
        // tns:uuid="FB6A0156-7EEA-4AE3-AED3-C3A15D916A1C" />
        //      <tns:Role tns:name="DIALOG_INNBYGGER_DIGITALBRUKERreceiver" xlink:type="simple"
        // xlink:href="http://www.helsedirektoratet.no/processes#DIALOG_INNBYGGER_DIGITALBRUKERreceiver"
        // />
        //      <tns:ApplicationCertificateRef tns:certId="enc" />
        //      <tns:ServiceBinding>
        //          <tns:Service tns:type="string">S-DIALOG_INNBYGGER_DIGITALBRUKER</tns:Service>
        //          <tns:CanSend />
        //          <tns:CanSend />
        //          <tns:CanReceive />
        //          <tns:CanReceive />
        //      </tns:ServiceBinding>
        //  </tns:CollaborationRole>

        CollaborationProtocolRoleModel collaborationProtocolRole = new CollaborationProtocolRoleModel();
        collaborationProtocolRole.setRoleName(collaborationRole.getRole().getName());
        collaborationProtocolRole.setName(collaborationProtocolRole.getRoleName());

        ProcessSpecificationModel processSpecification = new ProcessSpecificationModel();
        ProcessSpecification processSpecificationValue = collaborationRole.getProcessSpecification();
        processSpecification.setName(processSpecificationValue.getName());
        processSpecification.setVersion(processSpecificationValue.getVersion());

        collaborationProtocolRole.setProcessSpecification(processSpecification);
        collaborationProtocolRole.setVersion(processSpecification.getVersion());

        List<CollaborationProtocolMessageModel> sendMessages = new ArrayList<>();
        for (CanSend canSend : collaborationRole.getServiceBinding().getCanSend()) {
            sendMessages.add(
                    createMessage(canSend.getThisPartyActionBinding(), partyInfo, packagings, simpleParts));
        }
        collaborationProtocolRole.setSendMessages(sendMessages);

        List<CollaborationProtocolMessageModel> receiveMessages = new ArrayList<>();
        for (CanReceive canReceive : collaborationRole.getServiceBinding().getCanReceive()) {
            receiveMessages.add(
                    createMessage(
                            canReceive.getThisPartyActionBinding(), partyInfo, packagings, simpleParts));
        }
        collaborationProtocolRole.setReceiveMessages(receiveMessages);

        return collaborationProtocolRole;
    }

    /**
     * @param thisPartyActionBinding ActionBindingType
     * @param partyInfo              PartyInfo
     * @param packagings             List<Packaging>
     * @param simpleParts            List<SimplePart>
     * @return CollaborationProtocolMessageModel
     */
    @SneakyThrows
    private CollaborationProtocolMessageModel createMessage(
            ActionBindingType thisPartyActionBinding,
            PartyInfo partyInfo,
            List<Packaging> packagings,
            List<SimplePart> simpleParts) {

        // <tns:ThisPartyActionBinding
        // tns:id="Dialog_Innbygger_Ekonsultasjon-v1p1-DIALOG_INNBYGGER_EKONSULTASJONreceiver-Receive-APPREC-v1p1" tns:action="APPREC" tns:packageId="package_apprec_v1p1" xlink:type="simple">
        //    <tns:BusinessTransactionCharacteristics tns:isNonRepudiationRequired="true"
        // tns:isNonRepudiationReceiptRequired="true" tns:isConfidential="none"
        // tns:isAuthenticated="none" tns:isTamperProof="none" tns:isAuthorizationRequired="false"
        // tns:isIntelligibleCheckRequired="false" tns:timeToPerform="P180M" />
        //    <tns:ChannelId>AMQPAsync_81b6cff2-7f96-4bae-b314-d70f7b0e1d62</tns:ChannelId>
        // </tns:ThisPartyActionBinding>

        if (thisPartyActionBinding == null) {
            throw new Exception("thisPartyActionBinding is null");
        }

        if (partyInfo == null) {
            throw new Exception("partyInfo is null");
        }

        //	<tns:ThisPartyActionBinding
        // tns:id="Dialog_Innbygger_Ekonsultasjon-v1p1-DIALOG_INNBYGGER_EKONSULTASJONreceiver-Receive-APPREC-v1p1" tns:action="APPREC" tns:packageId="package_apprec_v1p1" xlink:type="simple">
        //		<tns:BusinessTransactionCharacteristics tns:isNonRepudiationRequired="true"
        // tns:isNonRepudiationReceiptRequired="true" tns:isConfidential="none"
        // tns:isAuthenticated="none" tns:isTamperProof="none" tns:isAuthorizationRequired="false"
        // tns:isIntelligibleCheckRequired="false" tns:timeToPerform="P180M" />
        //		<tns:ChannelId>AMQPAsync_81b6cff2-7f96-4bae-b314-d70f7b0e1d62</tns:ChannelId>
        //	</tns:ThisPartyActionBinding>
        String channelId =
                thisPartyActionBinding.getChannelId().stream()
                        .map(JAXBElement::getValue)
                        .findAny()
                        .map(
                                channelIdTemp -> {
                                    if (channelIdTemp instanceof DeliveryChannel) {
                                        return ((DeliveryChannel) channelIdTemp).getChannelId();
                                    }
                                    return channelIdTemp.toString();
                                })
                        .orElse(null);

        if (channelId == null) {
            throw new Exception("ChannelId is is null");
        }

        // <tns:DeliveryChannel tns:channelId="AMQPAsync_81b6cff2-7f96-4bae-b314-d70f7b0e1d62"
        // tns:transportId="transport_0_1" tns:docExchangeId="docexchange_async_amqp">
        //		<tns:MessagingCharacteristics />
        // </tns:DeliveryChannel>

        //   <tns:Transport tns:transportId="transport_0_1">
        //   </tns:Transport>

        String transportId =
                partyInfo.getDeliveryChannel().stream()
                        .filter(deliveryChannel -> deliveryChannel.getChannelId().equals(channelId))
                        .map(DeliveryChannel::getTransportId)
                        .findAny()
                        .map(
                                transportIdTemp -> {
                                    if (transportIdTemp instanceof Transport) {
                                        return ((Transport) transportIdTemp).getTransportId();
                                    }
                                    return transportIdTemp.toString();
                                })
                        .orElse(null);

        if (transportId == null) {
            throw new Exception("TransportId is empty");
        }

        // <tns:Transport tns:transportId="transport_0_1">
        //	<tns:TransportSender>
        //		<tns:TransportProtocol tns:version="1.0">AMQP</tns:TransportProtocol>
        //	</tns:TransportSender>
        //	<tns:TransportReceiver>
        //		<tns:TransportProtocol tns:version="1.0">AMQP</tns:TransportProtocol>
        //		<tns:Endpoint tns:uri="sb.test.nhn.no/DigitalDialog/93238_async" />
        //	</tns:TransportReceiver>
        // </tns:Transport>

        TransportReceiver transportReceiver =
                partyInfo.getTransport().stream()
                        .filter(transportTemp -> transportTemp.getTransportId().equals(transportId))
                        .findAny()
                        .map(Transport::getTransportReceiver)
                        .orElse(null);

        CollaborationProtocolMessageModel collaborationProtocolMessageModel =
                new CollaborationProtocolMessageModel();
        collaborationProtocolMessageModel.setName(thisPartyActionBinding.getAction());
        if (transportReceiver != null) {
            String deliveryChannel =
                    transportReceiver.getEndpoint().stream().findAny().map(Endpoint::getUri).orElse(null);
            collaborationProtocolMessageModel.setDeliveryChannel(deliveryChannel);

            String transportProtocol = transportReceiver.getTransportProtocol().getValue();
            if (transportProtocol.equals(DeliveryProtocol.AMQP.name())) {
                collaborationProtocolMessageModel.setDeliveryProtocol(DeliveryProtocol.AMQP);
            } else {
                collaborationProtocolMessageModel.setDeliveryProtocol(DeliveryProtocol.UNKNOWN);
            }

            String packageId = null;
            if (thisPartyActionBinding.getPackageId() instanceof Packaging) {
                packageId = ((Packaging) thisPartyActionBinding.getPackageId()).getId();
            }

            collaborationProtocolMessageModel.setParts(
                    findMessageParts(packageId, packagings, simpleParts));
        }

        return collaborationProtocolMessageModel;
    }

    /**
     * @param packageId   String
     * @param packagings  List<Packaging>
     * @param simpleParts List<SimplePart> simplePart
     * @return List<CollaborationProtocolMessagePartModel>
     */
    public List<CollaborationProtocolMessagePartModel> findMessageParts(
            String packageId, List<Packaging> packagings, List<SimplePart> simpleParts) {
        // <tns:Packaging tns:id="package_dialogmld_v1p1">
        //	<tns:ProcessingCapabilities tns:parse="true" tns:generate="true" />
        //	<tns:CompositeList>
        //		<tns:Encapsulation tns:id="enc_dialogmld_v1p1" tns:mimetype="application/pkcs7-mime"
        // tns:mimeparameters="smime-type=&quot;enveloped-data&quot;">
        //			<tns:Constituent tns:idref="message_dialogmld_v1p1" />
        //		</tns:Encapsulation>
        //		<tns:Composite tns:id="request_msg_dialogmld_v1p1" tns:mimetype="multipart/related"
        // tns:mimeparameters="type=text/xml">
        //			<tns:Constituent tns:idref="enc_dialogmld_v1p1" />
        //		</tns:Composite>
        //	</tns:CompositeList>
        // </tns:Packaging>

        Packaging.CompositeList compositeList =
                packagings.stream()
                        .filter(packaging -> packaging.getId().equals(packageId))
                        .findAny()
                        .map(Packaging::getCompositeList)
                        .stream()
                        .findAny()
                        .flatMap(compositeLists -> compositeLists.stream().findAny())
                        .orElse(null);
        if (compositeList == null) {
            return new ArrayList<>();
        }

        List<Constituent> constituents = new ArrayList<>();
        for (Object encapsulationOrComposite : compositeList.getEncapsulationOrComposite()) {
            if (encapsulationOrComposite instanceof Packaging.CompositeList.Encapsulation) {
                Constituent constituent =
                        ((Packaging.CompositeList.Encapsulation) encapsulationOrComposite).getConstituent();
                constituents.add(constituent);
            }
        }

        List<CollaborationProtocolMessagePartModel> messageParts = new ArrayList<>();
        for (Constituent constituent : constituents) {
            String simplePartId = ((SimplePart) constituent.getIdref()).getId();
            int min =
                    constituent.getMinOccurs() != null ? constituent.getMinOccurs().getLowestSetBit() : 0;
            int max =
                    constituent.getMaxOccurs() != null ? constituent.getMaxOccurs().getLowestSetBit() : 1;

            //		<tns:SimplePart tns:id="message_dialogmld_v1p1" tns:mimetype="application/xml">
            //			<tns:NamespaceSupported tns:location="MsgHead-v1_2.xsd"
            // tns:version="1.2">http://www.kith.no/xmlstds/msghead/2006-05-24</tns:NamespaceSupported>
            //			<tns:NamespaceSupported tns:location="dialogmelding-1.1.xsd"
            // tns:version="1.1">http://www.kith.no/xmlstds/dialog/2013-01-23</tns:NamespaceSupported>
            //		</tns:SimplePart>

            simpleParts.stream()
                    .filter(simplePart -> simplePart.getId().equals(simplePartId))
                    .forEach(
                            simplePart -> {
                                simplePart
                                        .getNamespaceSupported()
                                        .forEach(
                                                namespaceSupported -> {
                                                    CollaborationProtocolMessagePartModel messagePartModel =
                                                            new CollaborationProtocolMessagePartModel();

                                                    messagePartModel.setXmlNamespace(namespaceSupported.getValue());
                                                    messagePartModel.setXmlSchema(namespaceSupported.getLocation());

                                                    messagePartModel.setMinOccurrence(min);
                                                    messagePartModel.setMaxOccurrence(max);
                                                    messageParts.add(messagePartModel);
                                                });
                            });
        }

        return messageParts;
    }

    @SneakyThrows
    public CertificateModel unPackCertificate(Certificate certificate) {
        //  <tns:Certificate tns:certId="enc">
        //      <ds:KeyInfo>
        //          <ds:X509Data>
        //              <ds:X509Certificate>
        //              </ds:X509Certificate>
        //          </ds:X509Data>
        //      </ds:KeyInfo>
        //  </tns:Certificate>

        KeyInfoType keyInfo = certificate.getKeyInfo();

        X509DataType x509Data =
                keyInfo.getContent().stream()
                        .filter(content -> content instanceof JAXBElement<?>)
                        .map(content -> (JAXBElement<?>) content)
                        .filter(content -> content.getValue() instanceof X509DataType)
                        .map(content -> (X509DataType) content.getValue())
                        .findAny()
                        .orElse(null);

        if (x509Data != null) {
            byte[] base64X509Certificate =
                    x509Data.getX509IssuerSerialOrX509SKIOrX509SubjectName().stream()
                            .filter(content -> content instanceof JAXBElement)
                            .map(content -> (JAXBElement<?>) content)
                            .filter(content -> content.getValue() instanceof byte[])
                            .map(content -> (byte[]) content.getValue())
                            .findAny()
                            .orElse(null);

            if (base64X509Certificate != null) {
                X509Certificate x509Certificate =
                        CertificateUtils.getX509Certificate(base64X509Certificate);

                CertificateModel certificateModel = new CertificateModel(null, base64X509Certificate);
                certificateModel.setCertificate(x509Certificate);
                return certificateModel;
            }
        }

        return null;
    }
}
