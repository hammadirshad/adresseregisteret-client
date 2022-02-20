package com.example.grunndata.cpp.service;

import com.example.grunndata.cpp.mapper.CollaborationProtocolProfileMapper;
import com.example.model.CollaborationProtocolProfileModel;
import com.example.schema.cpa.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Slf4j
public class CollaborationProtocolRegistryService extends AbstractCollaborationProtocolRegistry {

    private final AbstractCollaborationProtocolRegistryRequest
            collaborationProtocolRegistrySoapService;
    private final CollaborationProtocolProfileMapper protocolProfileMapper;

    /**
     * Gets the CPP profile for a specific communication party
     *
     * @param counterpartyHerId Integer
     * @return CollaborationProtocolProfileModel
     */
    public Optional<CollaborationProtocolProfileModel> findProtocolForCounterParty(
            Integer counterpartyHerId) {
        CollaborationProtocolProfile collaborationProtocolProfile =
                collaborationProtocolRegistrySoapService.getCppForCommunicationParty(counterpartyHerId);
        if (collaborationProtocolProfile != null) {
            String cpaId = collaborationProtocolProfile.getCppid();
            PartyInfo partyInfo = collaborationProtocolProfile.getPartyInfo().get(0);
            List<Packaging> packagings = collaborationProtocolProfile.getPackaging();
            List<SimplePart> simplePart = collaborationProtocolProfile.getSimplePart();
            return Optional.of(
                    protocolProfileMapper.createCollaborationProtocolProfileModel(
                            counterpartyHerId, cpaId, partyInfo, packagings, simplePart));
        }
        return Optional.empty();
    }

    /**
     * Finds the counterparty between us and some other communication party
     *
     * @param counterpartyHerId Integer
     * @return CollaborationProtocolProfileModel
     */
    public Optional<CollaborationProtocolProfileModel> findAgreementForCommunicationParty(
            Integer herId, Integer counterpartyHerId) {

        CollaborationProtocolAgreement protocolAgreement =
                collaborationProtocolRegistrySoapService.getCpaForCommunicationParty(
                        herId, counterpartyHerId);
        if (protocolAgreement != null) {
            String cpaId = protocolAgreement.getCpaid();
            List<Packaging> packagings = protocolAgreement.getPackaging();
            List<SimplePart> simplePart = protocolAgreement.getSimplePart();

            PartyInfo partyInfo = getPartyInfo(herId, protocolAgreement);

            return Optional.of(
                    protocolProfileMapper.createCollaborationProtocolProfileModel(
                            counterpartyHerId, cpaId, partyInfo, packagings, simplePart));
        }
        return Optional.empty();
    }

    /**
     * Finds a CPA based on an id, and returns the CPP profile for the other communication party
     *
     * @param cpaId String
     * @return CollaborationProtocolProfileModel
     */
    public Optional<CollaborationProtocolProfileModel> findAgreementById(
            String cpaId, Integer herId) {

        CollaborationProtocolAgreement protocolAgreement =
                collaborationProtocolRegistrySoapService.getCpaForCommunicationPartyByCpaId(cpaId);
        List<Packaging> packagings = protocolAgreement.getPackaging();
        List<SimplePart> simplePart = protocolAgreement.getSimplePart();

        PartyInfo partyInfo = getPartyInfo(herId, protocolAgreement);

        if (partyInfo != null) {
            Integer counterpartyHerId =
                    partyInfo.getPartyId().stream()
                            .map(PartyId::getValue)
                            .map(Integer::parseInt)
                            .findAny()
                            .orElse(null);

            return Optional.of(
                    protocolProfileMapper.createCollaborationProtocolProfileModel(
                            counterpartyHerId, cpaId, partyInfo, packagings, simplePart));
        }
        return Optional.empty();
    }

    private PartyInfo getPartyInfo(Integer herId, CollaborationProtocolAgreement protocolAgreement) {
        // <tns:PartyId tns:type="HER">HERID</tns:PartyId>
        return protocolAgreement.getPartyInfo().stream()
                .filter(
                        partyInfoTemp ->
                                partyInfoTemp.getPartyId().stream()
                                        .filter(partyId -> partyId.getType().equals("HER"))
                                        .map(PartyId::getValue)
                                        .anyMatch(partyId -> !partyId.equals(herId.toString())))
                .findAny()
                .orElse(null);
    }
}
