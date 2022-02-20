package com.example.grunndata;

import lombok.extern.slf4j.Slf4j;
import org.apache.http.Header;
import org.apache.http.client.protocol.RequestDefaultHeaders;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicHeader;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;
import org.springframework.ws.transport.http.HttpComponentsMessageSender;

import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

@Slf4j
public class GrundataWebServiceClient extends WebServiceGatewaySupport {

  public Object sendRequest(
          String uri, String username, String password, String soapAction, Object request) {
    WebServiceTemplate webServiceTemplate = getWebServiceTemplate();
    webServiceTemplate.setMessageSender(basicSecurityCallback(username, password));
    return webServiceTemplate.marshalSendAndReceive(
            uri, request, new SoapActionCallback(soapAction));
  }

  public HttpComponentsMessageSender basicSecurityCallback(String username, String password) {
    List<Header> headers = new ArrayList<>();
    BasicHeader authHeader =
            new BasicHeader(
                    "Authorization",
                    "Basic " + Base64.getEncoder().encodeToString((username + ":" + password).getBytes()));
    headers.add(authHeader);
    RequestDefaultHeaders reqHeader = new RequestDefaultHeaders(headers);

    CloseableHttpClient httpClient =
            HttpClients.custom()
                    .addInterceptorFirst(new HttpComponentsMessageSender.RemoveSoapHeadersInterceptor())
                    .addInterceptorLast(reqHeader)
                    .build();
    return new HttpComponentsMessageSender(httpClient);
  }

  /*private WebServiceMessageCallback getWebServiceMessageCallback(String username, String password) {
    return (message) -> {
      try {

        final String WSSE_NS =
            "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd";
        final String PASSWORD_TEXT_TYPE =
            "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-username-token-profile-1.0#PasswordText";
        final String WSSE_SECURITY_LNAME = "Security";
        final String WSSE_USERNAMETOKEN_LNAME = "UsernameToken";
        final String WSSE_USERNAME_LNAME = "Username";
        final String WSSE_PASSWORD_LNAME = "Password";
        final String WSSE_NS_PREFIX = "wsse";
        final String PASSWORD_Type = "Type";

        SOAPMessage soapMessage = ((SaajSoapMessage) message).getSaajMessage();
        SOAPHeader header = soapMessage.getSOAPHeader();
        SOAPHeaderElement security =
            header.addHeaderElement(new QName(WSSE_NS, WSSE_SECURITY_LNAME, WSSE_NS_PREFIX));
        SOAPElement usernameToken =
            security.addChildElement(WSSE_USERNAMETOKEN_LNAME, WSSE_NS_PREFIX);

        SOAPElement usernameElement =
            usernameToken.addChildElement(WSSE_USERNAME_LNAME, WSSE_NS_PREFIX);
        usernameElement.setTextContent(username);

        SOAPFactory soapFactory = SOAPFactory.newInstance();
        Name passwordType = soapFactory.createName(PASSWORD_Type);

        SOAPElement passwordElement =
            usernameToken.addChildElement(WSSE_PASSWORD_LNAME, WSSE_NS_PREFIX);
        passwordElement.addAttribute(passwordType, PASSWORD_TEXT_TYPE);
        passwordElement.setTextContent(password);

        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        soapMessage.writeTo(stream);
        System.out.println(new String(stream.toByteArray(), StandardCharsets.UTF_8));
      } catch (Exception e) {
        log.error(e.getMessage(), e);
      }
    };
  }*/
}
