package com.example;

import com.example.grunndata.ar.service.AddressRegistryService;
import com.example.grunndata.cpp.service.CollaborationProtocolRegistryService;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@Profile("default")
@RequiredArgsConstructor
public class StartupApplicationRunner implements ApplicationRunner {
    private final AddressRegistryService addressRegistryService;
    private final CollaborationProtocolRegistryService collaborationProtocolRegistry;

    @SneakyThrows
    @Override
    public void run(ApplicationArguments args) {
        Integer herID = null;
        Integer counterpartyHerId = null;
        String cpaId = null;

        addressRegistryService.getCommunicationPartyDetails(herID);
        addressRegistryService.getCertificateForEncryption(herID);
        addressRegistryService.getCertificateForValidatingSignature(herID);

        collaborationProtocolRegistry.getProtocolForCounterParty(herID);
        collaborationProtocolRegistry.getAgreementForCommunicationParty(herID, counterpartyHerId);
        collaborationProtocolRegistry.getAgreementById(cpaId, herID);

    }
}

