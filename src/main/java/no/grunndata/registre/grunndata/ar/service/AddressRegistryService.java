package no.grunndata.registre.grunndata.ar.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import no.grunndata.registre.grunndata.ar.mapper.CertificateMapper;
import no.grunndata.registre.model.CertificateErrors;
import no.grunndata.registre.model.CertificateModel;
import no.grunndata.registre.model.CommunicationPartyDetailModel;
import no.grunndata.registre.schema.ar.CertificateDetails;
import no.grunndata.registre.schema.ar.CommunicationParty;
import no.grunndata.registre.schema.ar.ElectronicAddress;
import no.grunndata.registre.schema.ar.Service;

@RequiredArgsConstructor
@Slf4j
public class AddressRegistryService {

    private final AbstractAddressRegistryRequest addressRegistryActionService;
    private final CertificateValidator certificateValidator;
    private final CertificateMapper certificateMapper;

    public CertificateModel getCertificateForEncryption(Integer herId) {
        CertificateDetails certificateDetails = addressRegistryActionService.getCertificateDetailsForEncryption(herId);
        if (certificateDetails != null) {
            CertificateModel certificateModel = certificateMapper.mapToCertificateModel(certificateDetails);
            CertificateErrors certificateError =
                    certificateValidator.validateEncryptionCertificate(certificateModel);
            certificateModel.setCertificateError(certificateError);
            return certificateModel;
        }
        return null;
    }

    public CertificateModel getCertificateForValidatingSignature(Integer herId) {
        CertificateDetails certificateDetails = addressRegistryActionService.getCertificateDetailsForValidatingSignature(herId);
        if (certificateDetails != null) {
            CertificateModel certificateModel = certificateMapper.mapToCertificateModel(certificateDetails);
            CertificateErrors certificateError =
                    certificateValidator.validateSigningCertificate(certificateModel);
            certificateModel.setCertificateError(certificateError);
            return certificateModel;
        }
        return null;
    }

    public CommunicationPartyDetailModel getCommunicationPartyDetails(Integer herId) {
        CommunicationParty communicationParty = addressRegistryActionService.getCommunicationPartyDetails(herId);
        if (communicationParty != null) {
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
        }
        return new CommunicationPartyDetailModel(herId, "N/A", null, "N/A");
    }


}
