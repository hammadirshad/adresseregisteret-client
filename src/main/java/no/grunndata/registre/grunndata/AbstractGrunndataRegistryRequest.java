package no.grunndata.registre.grunndata;

import no.grunndata.registre.config.AddressRegistryProperties;
import no.grunndata.registre.schema.ar.GenericFault;
import no.grunndata.registre.schema.envelope.Body;
import no.grunndata.registre.schema.envelope.Envelope;
import no.grunndata.registre.schema.envelope.Fault;
import no.grunndata.registre.utils.XMLUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import javax.xml.bind.JAXBElement;
import java.util.Base64;
import java.util.regex.Pattern;

public interface AbstractGrunndataRegistryRequest {
    Logger log = LoggerFactory.getLogger(AbstractGrunndataRegistryRequest.class);

    default ResponseEntity<String> getResponseEntity(Object request, RestTemplate restTemplate, AddressRegistryProperties addressRegistryProperties, String soaAction) {
        String soapEnvelope = getRequestEnvelope(request);
        HttpEntity<String> requestEntity =
                new HttpEntity<>(
                        soapEnvelope, getHttpHeaders(request.getClass(), getBasicAuth(addressRegistryProperties), soaAction));
        return restTemplate.exchange(
                addressRegistryProperties.getArEndpoint(), HttpMethod.POST, requestEntity, String.class);
    }

    default String getRequestEnvelope(Object request) {
        Envelope envelope = new Envelope();
        Body envelopeBody = new Body();
        envelopeBody.getAny().add(request);
        envelope.setBody(envelopeBody);
        return XMLUtils.getXml(envelope, Envelope.class, request.getClass());
    }

    default HttpHeaders getHttpHeaders(Class<?> aClass, String basicAuth, String soaAction) {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Authorization", "Basic " + basicAuth);
        httpHeaders.add("SOAPAction", soaAction + aClass.getSimpleName());
        httpHeaders.add(HttpHeaders.CONTENT_TYPE, "text/xml");
        return httpHeaders;
    }

    default String getBasicAuth(AddressRegistryProperties addressRegistryProperties) {
        String authString =
                addressRegistryProperties.getUsername() + ":" + addressRegistryProperties.getPassword();
        byte[] authEncBytes = Base64.getEncoder().encode(authString.getBytes());
        return new String(authEncBytes);
    }

    default String getSoapFault(String response) {
        try {
            Pattern pattern = Pattern.compile("<[\\w:]{0,}Envelope");
            if (pattern.matcher(response).find()) {
                Envelope envelope = XMLUtils.getEntity(response, Envelope.class, GenericFault.class);
                Object any = envelope.getBody().getAny().stream().findAny().orElse(null);
                if (any instanceof Fault fault) {
                    return fault.getFaultstring();
                } else if (any instanceof JAXBElement jaxbElement && jaxbElement.getValue() instanceof Fault fault) {
                    return fault.getFaultstring();
                }
            }
        } catch (Exception e) {
            log.error(e.getMessage());
        }
        return null;
    }
}