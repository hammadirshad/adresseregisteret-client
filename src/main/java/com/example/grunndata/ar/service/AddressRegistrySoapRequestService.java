package com.example.grunndata.ar.service;

import com.example.config.AddressRegistryProperties;
import com.example.grunndata.GrundataWebServiceClient;
import com.example.schema.ar.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ws.soap.client.SoapFaultClientException;

@Slf4j
@RequiredArgsConstructor
public class AddressRegistrySoapRequestService extends AbstractAddressRegistryRequest {

    private final GrundataWebServiceClient grundataWebServiceClient;
    private final AddressRegistryProperties addressRegistrySettings;

    public CertificateDetails getCertificateDetailsForEncryption(Integer herId) {
        GetCertificateDetailsForEncryption request = new GetCertificateDetailsForEncryption();
        request.setHerId(herId);
        try {
            GetCertificateDetailsForEncryptionResponse response =
                    (GetCertificateDetailsForEncryptionResponse)
                            grundataWebServiceClient.sendRequest(
                                    addressRegistrySettings.getEndpoint(),
                                    addressRegistrySettings.getUsername(),
                                    addressRegistrySettings.getPassword(),
                                    BASE_SOAP_ACTION + GetCertificateDetailsForEncryption.class.getSimpleName(),
                                    request);
            return response.getGetCertificateDetailsForEncryptionResult().getValue();
        } catch (SoapFaultClientException e) {
            String message = getFormattedMessage(herId, e);
            log.error(message);
        }
        return null;
    }

    public CertificateDetails getCertificateDetailsForValidatingSignature(Integer herId) {
        GetCertificateDetailsForValidatingSignature request =
                new GetCertificateDetailsForValidatingSignature();
        request.setHerId(herId);
        try {
            GetCertificateDetailsForValidatingSignatureResponse response =
                    (GetCertificateDetailsForValidatingSignatureResponse)
                            grundataWebServiceClient.sendRequest(
                                    addressRegistrySettings.getEndpoint(),
                                    addressRegistrySettings.getUsername(),
                                    addressRegistrySettings.getPassword(),
                                    BASE_SOAP_ACTION
                                            + GetCertificateDetailsForValidatingSignature.class.getSimpleName(),
                                    request);
            return response.getGetCertificateDetailsForValidatingSignatureResult().getValue();
        } catch (SoapFaultClientException e) {
            String message = getFormattedMessage(herId, e);
            log.error(message);
        }
        return null;
    }

    public CommunicationParty getCommunicationPartyDetails(Integer herId)
            throws SoapFaultClientException {
        GetCommunicationPartyDetails request = new GetCommunicationPartyDetails();
        request.setHerId(herId);
        try {
            GetCommunicationPartyDetailsResponse response =
                    (GetCommunicationPartyDetailsResponse)
                            grundataWebServiceClient.sendRequest(
                                    addressRegistrySettings.getEndpoint(),
                                    addressRegistrySettings.getUsername(),
                                    addressRegistrySettings.getPassword(),
                                    BASE_SOAP_ACTION + GetCommunicationPartyDetails.class.getSimpleName(),
                                    request);
            return response.getGetCommunicationPartyDetailsResult().getValue();
        } catch (SoapFaultClientException e) {
            String message = getFormattedMessage(herId, e);
            log.error(message);
        }
        return null;
    }

    private String getFormattedMessage(Integer herId, SoapFaultClientException e) {
        String message = e.getMessage();
        if (e.getMessage() != null && e.getMessage().equals("Kommunikasjonspart med oppgitt HER-id")) {
            message = e.getMessage().replace("HER-id", "HER-id " + herId);
        }
        return message;
    }
}
