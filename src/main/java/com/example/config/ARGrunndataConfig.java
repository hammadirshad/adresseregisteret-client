package com.example.config;

import com.example.grunndata.GrunndataWebServiceClient;
import com.example.grunndata.ar.mapper.CertificateMapper;
import com.example.grunndata.ar.service.*;
import com.example.schema.ar.GetCommunicationPartyDetails;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ARGrunndataConfig {

    public Jaxb2Marshaller arGrunnndataMarshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setPackagesToScan(GetCommunicationPartyDetails.class.getPackage().getName());
        return marshaller;
    }

    public GrunndataWebServiceClient arGrunndataWebServiceClient() {
        GrunndataWebServiceClient client = new GrunndataWebServiceClient();
        client.setDefaultUri("https://ws-web.test.nhn.no/v1/AR/Basic");
        client.setMarshaller(arGrunnndataMarshaller());
        client.setUnmarshaller(arGrunnndataMarshaller());
        return client;
    }

    @Bean
    @ConditionalOnProperty(
            prefix = "address.registry",
            name = "request-mode",
            havingValue = "soap"
    )
    public AbstractAddressRegistryRequest addressRegistrySoapService(
            AddressRegistryProperties addressRegistryProperties) {
        return new AddressRegistrySoapRequestService(
                arGrunndataWebServiceClient(), addressRegistryProperties);
    }

    @Bean
    @ConditionalOnProperty(
            prefix = "address.registry",
            name = "request-mode",
            havingValue = "http",
            matchIfMissing = true)
    public AbstractAddressRegistryRequest addressRegistryHttpService(
            RestTemplate restTemplate, AddressRegistryProperties addressRegistryProperties) {
        return new AddressRegistryHttpRequestService(restTemplate, addressRegistryProperties);
    }

    @Bean
    public AddressRegistryService addressRegistryService(
            AbstractAddressRegistryRequest addressRegistryActionService,
            CertificateValidator certificateValidator,
            CertificateMapper certificateMapper) {
        return new AddressRegistryService(
                addressRegistryActionService, certificateValidator, certificateMapper);
    }


}
