package com.example.config;

import com.example.grunndata.GrundataWebServiceClient;
import com.example.grunndata.cpp.mapper.CollaborationProtocolProfileMapper;
import com.example.grunndata.cpp.service.*;
import com.example.schema.cpa.CollaborationProtocolProfile;
import com.example.schema.cppa.GetCppXmlForCommunicationParty;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.web.client.RestTemplate;

@Configuration
@RequiredArgsConstructor
@Slf4j
public class CPPAGrundataConfig {

    public Jaxb2Marshaller cppaGrundataMarshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setPackagesToScan(
                CollaborationProtocolProfile.class.getPackage().getName(),
                GetCppXmlForCommunicationParty.class.getPackage().getName());
        return marshaller;
    }

    public GrundataWebServiceClient cppaGrundataWebServiceClient() {
        GrundataWebServiceClient client = new GrundataWebServiceClient();
        client.setDefaultUri("https://ws-web.test.nhn.no/v1/CPPA/Basic");
        client.setMarshaller(cppaGrundataMarshaller());
        client.setUnmarshaller(cppaGrundataMarshaller());
        return client;
    }

    // @Bean
    public AbstractCollaborationProtocolRegistryRequest cppRegistrySoapService(
            CollaborationProtocolRegistryProperties registrySettings) {
        return new CollaborationProtocolRegistrySoapService(
                cppaGrundataWebServiceClient(), registrySettings);
    }

    @Bean
    public AbstractCollaborationProtocolRegistryRequest cppRegistryHttpService(
            RestTemplate restTemplate, CollaborationProtocolRegistryProperties registrySettings) {
        return new CollaborationProtocolRegistryHttpService(restTemplate, registrySettings);
    }

    @Bean
    @ConditionalOnMissingBean(AbstractCollaborationProtocolRegistry.class)
    public AbstractCollaborationProtocolRegistry collaborationProtocolRegistry(
            AbstractCollaborationProtocolRegistryRequest collaborationProtocolRegistryActionService,
            CollaborationProtocolProfileMapper profileService) {
        return new CollaborationProtocolRegistryService(
                collaborationProtocolRegistryActionService, profileService);
    }
}
