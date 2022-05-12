package no.grunndata.registre.grunndata;

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
public class GrunndataWebServiceClient extends WebServiceGatewaySupport {

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
}
