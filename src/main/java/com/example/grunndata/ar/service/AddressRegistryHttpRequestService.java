package com.example.grunndata.ar.service;

import com.example.config.AddressRegistryProperties;
import com.example.grunndata.AbstractGrundataRegistryRequest;
import com.example.schema.ar.*;
import com.example.schema.envelope.Envelope;
import com.example.utils.XMLUtils;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
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
public class AddressRegistryHttpRequestService extends AbstractAddressRegistryRequest
        implements AbstractGrundataRegistryRequest {

  private final RestTemplate restTemplate;
  private final AddressRegistryProperties addressRegistryProperties;

  @SneakyThrows
  @Override
  public CertificateDetails getCertificateDetailsForEncryption(Integer herId) {
    GetCertificateDetailsForEncryption request = new GetCertificateDetailsForEncryption();
    request.setHerId(herId);
    try {
      ResponseEntity<String> response = getResponseEntity(request);
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
      ResponseEntity<String> response = getResponseEntity(request);
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
      ResponseEntity<String> response = getResponseEntity(request);
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

  private ResponseEntity<String> getResponseEntity(Object request) {
    String soapEnvelope = getRequestEnvelope(request);
    HttpEntity<String> requestEntity =
            new HttpEntity<>(
                    soapEnvelope, getHttpHeaders(request.getClass(), getBasicAuth(), BASE_SOAP_ACTION));
    return restTemplate.exchange(
            addressRegistryProperties.getArEndpoint(), HttpMethod.POST, requestEntity, String.class);
  }

  private String getBasicAuth() {
    String authString =
            addressRegistryProperties.getUsername() + ":" + addressRegistryProperties.getPassword();
    byte[] authEncBytes = Base64.getEncoder().encode(authString.getBytes());
    return new String(authEncBytes);
  }
}
