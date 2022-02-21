package com.example.config;

import com.example.grunndata.GrunndataWebServiceClient;
import com.example.grunndata.cpp.mapper.CollaborationProtocolProfileMapper;
import com.example.grunndata.cpp.service.AbstractCollaborationProtocolRegistryRequest;
import com.example.grunndata.cpp.service.CollaborationProtocolRegistryHttpService;
import com.example.grunndata.cpp.service.CollaborationProtocolRegistryService;
import com.example.grunndata.cpp.service.CollaborationProtocolRegistrySoapService;
import com.example.schema.cpa.CollaborationProtocolProfile;
import com.example.schema.cppa.GetCppXmlForCommunicationParty;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.web.client.RestTemplate;

@Configuration
@RequiredArgsConstructor
@Slf4j
public class CPPAGrundataConfig {

    public Jaxb2Marshaller cppaGrunndataMarshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setPackagesToScan(
                CollaborationProtocolProfile.class.getPackage().getName(),
                GetCppXmlForCommunicationParty.class.getPackage().getName());
        return marshaller;
    }

    public GrunndataWebServiceClient cppaGrundataWebServiceClient() {
        GrunndataWebServiceClient client = new GrunndataWebServiceClient();
        client.setDefaultUri("https://ws-web.test.nhn.no/v1/CPPA/Basic");
        client.setMarshaller(cppaGrunndataMarshaller());
        client.setUnmarshaller(cppaGrunndataMarshaller());
        return client;
    }

    @Bean
    @ConditionalOnProperty(
            prefix = "address.registry",
            name = "request-mode",
            havingValue = "soap"
    )
    public AbstractCollaborationProtocolRegistryRequest cppRegistrySoapService(
            AddressRegistryProperties registrySettings) {
        return new CollaborationProtocolRegistrySoapService(
                cppaGrundataWebServiceClient(), registrySettings);
    }

    @Bean
    @ConditionalOnProperty(
            prefix = "address.registry",
            name = "request-mode",
            havingValue = "http",
            matchIfMissing = true)
    public AbstractCollaborationProtocolRegistryRequest cppRegistryHttpService(
            RestTemplate restTemplate, AddressRegistryProperties registrySettings) {
        return new CollaborationProtocolRegistryHttpService(restTemplate, registrySettings);
    }

    @Bean
    public CollaborationProtocolRegistryService collaborationProtocolRegistry(
            AbstractCollaborationProtocolRegistryRequest collaborationProtocolRegistryActionService,
            CollaborationProtocolProfileMapper profileService) {
        return new CollaborationProtocolRegistryService(
                collaborationProtocolRegistryActionService, profileService);
    }
}
