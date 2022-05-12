package no.grunndata.registre.grunndata.ar.service;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import no.grunndata.registre.config.AddressRegistryProperties;
import no.grunndata.registre.grunndata.AbstractGrunndataRegistryRequest;
import no.grunndata.registre.schema.ar.*;
import no.grunndata.registre.schema.envelope.Envelope;
import no.grunndata.registre.utils.XMLUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestTemplate;

import javax.xml.bind.JAXBElement;

@Slf4j
@RequiredArgsConstructor
public class AddressRegistryHttpRequestService extends AbstractAddressRegistryRequest
        implements AbstractGrunndataRegistryRequest {

    private final RestTemplate restTemplate;
    private final AddressRegistryProperties addressRegistryProperties;

    @SneakyThrows
    @Override
    public CertificateDetails getCertificateDetailsForEncryption(Integer herId) {
        GetCertificateDetailsForEncryption request = new GetCertificateDetailsForEncryption();
        request.setHerId(herId);
        try {
            ResponseEntity<String> response = getResponseEntity(request, restTemplate, addressRegistryProperties, BASE_SOAP_ACTION);
            if (response.hasBody()) {
                String body = response.getBody();
                Envelope responseEnvelope =
                        XMLUtils.getEntity(
                                body, Envelope.class, GetCertificateDetailsForValidatingSignatureResponse.class);
                return responseEnvelope.getBody().getAny().stream()
                        .filter(GetCertificateDetailsForEncryptionResponse.class::isInstance)
                        .map(GetCertificateDetailsForEncryptionResponse.class::cast)
                        .map(
                                GetCertificateDetailsForEncryptionResponse
                                        ::getGetCertificateDetailsForEncryptionResult)
                        .map(JAXBElement::getValue)
                        .findAny()
                        .orElse(null);
            }
        } catch (HttpServerErrorException e) {
            log.error(getFormattedMessage(herId, e));
        }
        return null;
    }

    @SneakyThrows
    @Override
    public CertificateDetails getCertificateDetailsForValidatingSignature(Integer herId) {
        GetCertificateDetailsForValidatingSignature request =
                new GetCertificateDetailsForValidatingSignature();
        request.setHerId(herId);
        try {
            ResponseEntity<String> response = getResponseEntity(request, restTemplate, addressRegistryProperties, BASE_SOAP_ACTION);
            if (response.hasBody()) {
                String body = response.getBody();
                Envelope responseEnvelope =
                        XMLUtils.getEntity(
                                body, Envelope.class, GetCertificateDetailsForValidatingSignatureResponse.class);
                return responseEnvelope.getBody().getAny().stream()
                        .filter(GetCertificateDetailsForValidatingSignatureResponse.class::isInstance)
                        .map(GetCertificateDetailsForValidatingSignatureResponse.class::cast)
                        .map(
                                GetCertificateDetailsForValidatingSignatureResponse
                                        ::getGetCertificateDetailsForValidatingSignatureResult)
                        .map(JAXBElement::getValue)
                        .findAny()
                        .orElse(null);
            }
        } catch (HttpServerErrorException e) {
            log.error(getFormattedMessage(herId, e));
        }
        return null;
    }

    @SneakyThrows
    @Override
    public CommunicationParty getCommunicationPartyDetails(Integer herId) {
        GetCommunicationPartyDetails request = new GetCommunicationPartyDetails();
        request.setHerId(herId);
        try {
            ResponseEntity<String> response = getResponseEntity(request, restTemplate, addressRegistryProperties, BASE_SOAP_ACTION);
            if (response.hasBody()) {
                String body = response.getBody();
                Envelope responseEnvelope =
                        XMLUtils.getEntity(body, Envelope.class, GetCommunicationPartyDetailsResponse.class);
                return responseEnvelope.getBody().getAny().stream()
                        .filter(GetCommunicationPartyDetailsResponse.class::isInstance)
                        .map(GetCommunicationPartyDetailsResponse.class::cast)
                        .map(GetCommunicationPartyDetailsResponse::getGetCommunicationPartyDetailsResult)
                        .map(JAXBElement::getValue)
                        .findAny()
                        .orElse(null);
            }
        } catch (HttpServerErrorException e) {
            log.error(getFormattedMessage(herId, e));
        }

        return null;
    }

    private String getFormattedMessage(Integer herId, HttpServerErrorException e) {
        String message = e.getMessage();
        final String faultstring = getSoapFault(e.getResponseBodyAsString());
        if (faultstring != null) {
            String httpMessage = e.getRawStatusCode() + " " + e.getStatusText() + " ";
            if (faultstring.contains("Kommunikasjonspart med oppgitt HER-id")) {
                message = httpMessage + faultstring.replace("HER-id", "HER-id " + herId);
            } else {
                message = httpMessage + faultstring;
            }
        }
        return message;
    }

}
