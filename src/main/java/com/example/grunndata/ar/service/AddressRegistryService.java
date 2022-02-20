package com.example.grunndata.ar.service;

import com.example.grunndata.ar.mapper.CertificateMapper;
import com.example.model.CertificateErrors;
import com.example.model.CertificateModel;
import com.example.model.CommunicationPartyDetailModel;
import com.example.schema.ar.CertificateDetails;
import com.example.schema.ar.CommunicationParty;
import com.example.schema.ar.ElectronicAddress;
import com.example.schema.ar.Service;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ws.soap.client.SoapFaultClientException;

@RequiredArgsConstructor
@Slf4j
public class AddressRegistryService {

    private final AbstractAddressRegistryRequest addressRegistryActionService;
    private final CertificateValidator certificateValidator;
    private final CertificateMapper certificateMapper;

    public CertificateModel getCertificateForEncryption(Integer herId) {
        CertificateDetails certificateDetails = addressRegistryActionService.getCertificateDetailsForEncryption(herId);
        CertificateModel certificateModel = certificateMapper.certificateModel(certificateDetails);
        CertificateErrors certificateError =
                certificateValidator.validateEncryptionCertificate(certificateModel);
        certificateModel.setCertificateError(certificateError);
        return certificateModel;
    }

    public CertificateModel getCertificateForValidatingSignature(Integer herId) {
        CertificateDetails certificateDetails = addressRegistryActionService.getCertificateDetailsForValidatingSignature(herId);
        CertificateModel certificateModel = certificateMapper.certificateModel(certificateDetails);
        CertificateErrors certificateError =
                certificateValidator.validateSigningCertificate(certificateModel);
        certificateModel.setCertificateError(certificateError);
        return certificateModel;
    }

    @SneakyThrows
    public CommunicationPartyDetailModel getCommunicationPartyDetails(Integer herId) {
        try {
            CommunicationParty communicationParty = addressRegistryActionService.getCommunicationPartyDetails(herId);
            CommunicationPartyDetailModel details = new CommunicationPartyDetailModel();
            details.setHerId(communicationParty.getHerId());

            if (communicationParty.getName() != null) {
                details.setName(communicationParty.getName().getValue());
            }

            details.setParentHerId(communicationParty.getParentHerId());
            if (communicationParty.getParentName() != null) {
                details.setParentName(communicationParty.getParentName().getValue());
            }
            details.setParentOrganizationNumber(communicationParty.getParentOrganizationNumber());

            if (communicationParty.getElectronicAddresses() != null) {
                for (ElectronicAddress address :
                        communicationParty.getElectronicAddresses().getValue().getElectronicAddress()) {
                    switch (address.getType().getValue().getCodeValue().getValue()) {
                        case "E_SB_ASYNC" -> details.setAsynchronousQueueName(address.getAddress().getValue());
                        case "E_SB_SYNC" -> details.setSynchronousQueueName(address.getAddress().getValue());
                        case "E_SB_ERROR" -> details.setErrorQueueName(address.getAddress().getValue());
                        case "E_SB_SYNCREPLY" -> details.setSynchronousReplyQueueName(address.getAddress().getValue());
                        case "E_EDI" -> details.setEdi(address.getAddress().getValue());
                    }
                }
            }

            if (communicationParty instanceof Service service && service.getLocationDescription() != null) {
                details.setSted(service.getLocationDescription().getValue());
            }

            return details;
        } catch (SoapFaultClientException e) {
            if (e.getMessage() != null
                    && e.getMessage().contains("Kommunikasjonspart med oppgitt HER-id eksisterer ikke.")) {
                log.error("Kommunikasjonspart med oppgitt HER-id " + herId + " eksisterer ikke.", e);
                return new CommunicationPartyDetailModel(herId, "N/A", herId, "N/A");
            }
            throw e;
        }
    }


}
