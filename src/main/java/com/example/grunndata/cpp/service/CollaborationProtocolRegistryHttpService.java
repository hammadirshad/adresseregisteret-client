package com.example.grunndata.cpp.service;

import com.example.config.AddressRegistryProperties;
import com.example.grunndata.AbstractGrundataRegistryRequest;
import com.example.schema.cpa.CollaborationProtocolAgreement;
import com.example.schema.cpa.CollaborationProtocolProfile;
import com.example.schema.cppa.*;
import com.example.schema.envelope.Envelope;
import com.example.utils.XMLUtils;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestTemplate;

import javax.xml.bind.JAXBElement;
import java.util.Base64;

@Slf4j
@RequiredArgsConstructor
public class CollaborationProtocolRegistryHttpService
        extends AbstractCollaborationProtocolRegistryRequest
        implements AbstractGrundataRegistryRequest {

    private final RestTemplate restTemplate;
    private final AddressRegistryProperties registrySettings;

    @Override
    public CollaborationProtocolProfile getCppForCommunicationParty(Integer counterpartyHerId) {
        GetCppXmlForCommunicationParty request = new GetCppXmlForCommunicationParty();
        request.setHerId(counterpartyHerId);
        try {
            ResponseEntity<String> response = getResponseEntity(request);

            if (response.hasBody()) {
                String body = response.getBody();
                Envelope responseEnvelope =
                        XMLUtils.getEntity(body, Envelope.class, GetCppXmlForCommunicationPartyResponse.class);

                String xmlString =
                        responseEnvelope.getBody().getAny().stream()
                                .filter(GetCppXmlForCommunicationPartyResponse.class::isInstance)
                                .map(GetCppXmlForCommunicationPartyResponse.class::cast)
                                .map(
                                        GetCppXmlForCommunicationPartyResponse::getGetCppXmlForCommunicationPartyResult)
                                .map(JAXBElement::getValue)
                                .findAny()
                                .orElse(null);
                return XMLUtils.getEntity(xmlString, CollaborationProtocolProfile.class);
            }
        } catch (HttpServerErrorException e) {
            String message = e.getMessage();
            final String faultstring = getSoapFault(e.getResponseBodyAsString());
            if (faultstring != null) {
                String httpMessage = e.getRawStatusCode() + " " + e.getStatusText() + " ";
                if (faultstring.contains("Entitet ikke funnet")) {
                    message =
                            httpMessage
                                    + faultstring.replaceAll("Entitet", "Entitet " + counterpartyHerId.toString());
                } else {
                    message = httpMessage + faultstring;
                }
            }
            log.error(message);
        }
        return null;
    }

    @Override
    public CollaborationProtocolAgreement getCpaForCommunicationParty(
            Integer herId, Integer counterpartyHerId) {
        GetCpaForCommunicationPartiesXml request = new GetCpaForCommunicationPartiesXml();
        request.setCommunicationPartAHerId(herId);
        request.setCommunicationPartBHerId(counterpartyHerId);

        try {
            ResponseEntity<String> response = getResponseEntity(request);
            if (response.hasBody()) {
                String body = response.getBody();
                Envelope responseEnvelope =
                        XMLUtils.getEntity(
                                body, Envelope.class, GetCpaForCommunicationPartiesXmlResponse.class);

                String xmlString =
                        responseEnvelope.getBody().getAny().stream()
                                .filter(GetCpaForCommunicationPartiesXmlResponse.class::isInstance)
                                .map(GetCpaForCommunicationPartiesXmlResponse.class::cast)
                                .map(
                                        GetCpaForCommunicationPartiesXmlResponse
                                                ::getGetCpaForCommunicationPartiesXmlResult)
                                .map(JAXBElement::getValue)
                                .map(CpaXmlDetails::getCollaborationProtocolAgreementXml)
                                .map(JAXBElement::getValue)
                                .findAny()
                                .orElse(null);

                return XMLUtils.getEntity(xmlString, CollaborationProtocolAgreement.class);
            }
        } catch (HttpServerErrorException e) {
            String message = e.getMessage();
            final String faultstring = getSoapFault(e.getResponseBodyAsString());
            if (faultstring != null) {
                String httpMessage = e.getRawStatusCode() + " " + e.getStatusText() + " ";
                if (faultstring.contains("does not have a CPP")) {
                    message =
                            httpMessage
                                    + faultstring
                                    .replace("PartyA", "PartyA " + herId.toString())
                                    .replace("PartyB", "PartyB " + counterpartyHerId);
                } else {
                    message = httpMessage + faultstring;
                }
            }
            log.error(message);
        }
        return null;
    }

    @Override
    public CollaborationProtocolAgreement getCpaForCommunicationPartyByCpaId(String cpaId) {
        GetCpaXml request = new GetCpaXml();
        request.setCpaId(cpaId);
        try {
            ResponseEntity<String> response = getResponseEntity(request);
            if (response.hasBody()) {
                String body = response.getBody();
                Envelope responseEnvelope =
                        XMLUtils.getEntity(body, Envelope.class, GetCpaXmlResponse.class);
                String xmlString =
                        responseEnvelope.getBody().getAny().stream()
                                .filter(GetCpaXmlResponse.class::isInstance)
                                .map(GetCpaXmlResponse.class::cast)
                                .map(GetCpaXmlResponse::getGetCpaXmlResult)
                                .map(JAXBElement::getValue)
                                .map(CpaXmlDetails::getCollaborationProtocolAgreementXml)
                                .map(JAXBElement::getValue)
                                .findAny()
                                .orElse(null);
                return XMLUtils.getEntity(xmlString, CollaborationProtocolAgreement.class);
            }
        } catch (HttpServerErrorException e) {
            String message = e.getMessage();
            final String faultstring = getSoapFault(e.getResponseBodyAsString());
            if (faultstring != null) {
                String httpMessage = e.getRawStatusCode() + " " + e.getStatusText() + " ";
                if (faultstring.contains("Entitet ikke funnet")) {
                    message = httpMessage + faultstring.replaceAll("Entitet", "Entitet " + cpaId);
                } else {
                    message = httpMessage + faultstring;
                }
            }
            log.error(message);
        }
        return null;
    }

    private ResponseEntity<String> getResponseEntity(Object request) {
        String soapEnvelope = getRequestEnvelope(request);
        HttpEntity<String> requestEntity =
                new HttpEntity<>(
                        soapEnvelope, getHttpHeaders(request.getClass(), getBasicAuth(), BASE_SOAP_ACTION));
        return restTemplate.exchange(
                registrySettings.getCppEndpoint(), HttpMethod.POST, requestEntity, String.class);
    }

    private String getBasicAuth() {
        String authString = registrySettings.getUsername() + ":" + registrySettings.getPassword();
        byte[] authEncBytes = Base64.getEncoder().encode(authString.getBytes());
        return new String(authEncBytes);
    }
}
