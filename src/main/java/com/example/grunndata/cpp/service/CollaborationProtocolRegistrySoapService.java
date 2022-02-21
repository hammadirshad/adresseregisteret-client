package com.example.grunndata.cpp.service;

import com.example.config.AddressRegistryProperties;
import com.example.grunndata.GrunndataWebServiceClient;
import com.example.schema.cpa.CollaborationProtocolAgreement;
import com.example.schema.cpa.CollaborationProtocolProfile;
import com.example.schema.cppa.*;
import com.example.utils.XMLUtils;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ws.soap.client.SoapFaultClientException;

@Slf4j
@RequiredArgsConstructor
public class CollaborationProtocolRegistrySoapService
        extends AbstractCollaborationProtocolRegistryRequest {

    private final GrunndataWebServiceClient grunndataWebServiceClient;
    private final AddressRegistryProperties registrySettings;

    /**
     * FindProtocolForCounterparty Gets the CPP profile for a specific communication party
     *
     * @param counterpartyHerId Integer
     * @return xml String CollaborationProtocolProfile
     */
    @SneakyThrows
    public CollaborationProtocolProfile getCppForCommunicationParty(Integer counterpartyHerId) {
        GetCppXmlForCommunicationParty request = new GetCppXmlForCommunicationParty();
        request.setHerId(counterpartyHerId);
        try {
            GetCppXmlForCommunicationPartyResponse response =
                    (GetCppXmlForCommunicationPartyResponse)
                            grunndataWebServiceClient.sendRequest(
                                    registrySettings.getCppEndpoint(),
                                    registrySettings.getUsername(),
                                    registrySettings.getPassword(),
                                    BASE_SOAP_ACTION + GetCppXmlForCommunicationParty.class.getSimpleName(),
                                    request);
            String xmlString = response.getGetCppXmlForCommunicationPartyResult().getValue();
            return XMLUtils.getEntity(xmlString, CollaborationProtocolProfile.class);
        } catch (SoapFaultClientException e) {

            if (e.getMessage() != null && e.getMessage().equals("Entitet ikke funnet")) {
                log.error(e.getMessage().replace("Entitet", "Entitet " + counterpartyHerId.toString()));
            } else {
                log.error(e.getMessage());
            }
        }
        return null;
    }

    /**
     * FindAgreementForCounterparty Finds the counterparty between us and some other communication
     * party
     *
     * @param herId             Integer
     * @param counterpartyHerId Integer
     * @return xml String CollaborationProtocolAgreement
     */
    @SneakyThrows
    public CollaborationProtocolAgreement getCpaForCommunicationParty(
            Integer herId, Integer counterpartyHerId) {
        GetCpaForCommunicationPartiesXml request = new GetCpaForCommunicationPartiesXml();
        request.setCommunicationPartAHerId(herId);
        request.setCommunicationPartBHerId(counterpartyHerId);
        try {
            GetCpaForCommunicationPartiesXmlResponse response =
                    (GetCpaForCommunicationPartiesXmlResponse)
                            grunndataWebServiceClient.sendRequest(
                                    registrySettings.getCppEndpoint(),
                                    registrySettings.getUsername(),
                                    registrySettings.getPassword(),
                                    BASE_SOAP_ACTION + GetCpaForCommunicationPartiesXml.class.getSimpleName(),
                                    request);
            CpaXmlDetails cpaDetails = response.getGetCpaForCommunicationPartiesXmlResult().getValue();
            String xmlString = cpaDetails.getCollaborationProtocolAgreementXml().getValue();
            return XMLUtils.getEntity(xmlString, CollaborationProtocolAgreement.class);
        } catch (SoapFaultClientException e) {
            if (e.getMessage() != null && e.getMessage().contains("does not have a CPP")) {
                log.error(
                        e.getMessage()
                                .replace("PartyA", "PartyA " + herId.toString())
                                .replace("PartyB", "PartyB " + counterpartyHerId));
            } else {
                log.error(e.getMessage());
            }
        }
        return null;
    }

    /**
     * FindAgreementById Finds a CPA based on an id, and returns the CPP profile for the other
     * communication party
     *
     * @param cpaId String
     * @return xml String CollaborationProtocolAgreement
     */
    @SneakyThrows
    public CollaborationProtocolAgreement getCpaForCommunicationPartyByCpaId(String cpaId) {
        GetCpaXml request = new GetCpaXml();
        request.setCpaId(cpaId);
        try {
            GetCpaXmlResponse response =
                    (GetCpaXmlResponse)
                            grunndataWebServiceClient.sendRequest(
                                    registrySettings.getCppEndpoint(),
                                    registrySettings.getUsername(),
                                    registrySettings.getPassword(),
                                    BASE_SOAP_ACTION + GetCpaXml.class.getSimpleName(),
                                    request);
            CpaXmlDetails cpaDetails = response.getGetCpaXmlResult().getValue();
            String xmlString = cpaDetails.getCollaborationProtocolAgreementXml().getValue();
            return XMLUtils.getEntity(xmlString, CollaborationProtocolAgreement.class);
        } catch (SoapFaultClientException e) {
            if (e.getMessage() != null && e.getMessage().equals("Entitet ikke funnet")) {
                log.error(e.getMessage().replace("Entitet", "Entitet " + cpaId));
            } else {
                log.error(e.getMessage());
            }
        }
        return null;
    }
}
