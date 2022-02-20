package com.example.grunndata;

import com.example.schema.ar.GenericFault;
import com.example.schema.envelope.Body;
import com.example.schema.envelope.Envelope;
import com.example.schema.envelope.Fault;
import com.example.utils.XMLUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;

import javax.xml.bind.JAXBElement;
import java.util.regex.Pattern;

public interface AbstractGrundataRegistryRequest {
    Logger log = LoggerFactory.getLogger(AbstractGrundataRegistryRequest.class);

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