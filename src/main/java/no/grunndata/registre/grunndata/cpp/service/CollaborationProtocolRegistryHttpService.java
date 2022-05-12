package no.grunndata.registre.grunndata.cpp.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import no.grunndata.registre.config.AddressRegistryProperties;
import no.grunndata.registre.grunndata.AbstractGrunndataRegistryRequest;
import no.grunndata.registre.schema.cpa.CollaborationProtocolAgreement;
import no.grunndata.registre.schema.cpa.CollaborationProtocolProfile;
import no.grunndata.registre.schema.cppa.*;
import no.grunndata.registre.schema.envelope.Envelope;
import no.grunndata.registre.utils.XMLUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestTemplate;

import javax.xml.bind.JAXBElement;

@Slf4j
@RequiredArgsConstructor
public class CollaborationProtocolRegistryHttpService
        extends AbstractCollaborationProtocolRegistryRequest
        implements AbstractGrunndataRegistryRequest {

    private final RestTemplate restTemplate;
    private final AddressRegistryProperties addressRegistryProperties;

    @Override
    public CollaborationProtocolProfile getCppForCommunicationParty(Integer counterpartyHerId) {
        GetCppXmlForCommunicationParty request = new GetCppXmlForCommunicationParty();
        request.setHerId(counterpartyHerId);
        try {
            ResponseEntity<String> response = getResponseEntity(request, restTemplate, addressRegistryProperties, BASE_SOAP_ACTION);
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
            ResponseEntity<String> response = getResponseEntity(request, restTemplate, addressRegistryProperties, BASE_SOAP_ACTION);
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
            ResponseEntity<String> response = getResponseEntity(request, restTemplate, addressRegistryProperties, BASE_SOAP_ACTION);
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
}
