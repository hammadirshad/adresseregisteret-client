package com.example.config;

import com.example.grunndata.GrundataWebServiceClient;
import com.example.grunndata.ar.mapper.CertificateMapper;
import com.example.grunndata.ar.service.*;
import com.example.schema.ar.GetCommunicationPartyDetails;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ARGrunndataConfig {

    public Jaxb2Marshaller arGrunndataMarshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setPackagesToScan(GetCommunicationPartyDetails.class.getPackage().getName());
        return marshaller;
    }

    public GrundataWebServiceClient arGrundataWebServiceClient() {
        GrundataWebServiceClient client = new GrundataWebServiceClient();
        client.setDefaultUri("https://ws-web.test.nhn.no/v1/AR/Basic");
        client.setMarshaller(arGrunndataMarshaller());
        client.setUnmarshaller(arGrunndataMarshaller());
        return client;
    }

    //  @Bean
    public AbstractAddressRegistryRequest addressRegistrySoapService(
            AddressRegistryProperties addressRegistryProperties) {
        return new AddressRegistrySoapRequestService(
                arGrundataWebServiceClient(), addressRegistryProperties);
    }

    @Bean
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
