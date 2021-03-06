package no.grunndata.registre.grunndata.cpp.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import no.grunndata.registre.grunndata.cpp.mapper.CollaborationProtocolProfileMapper;
import no.grunndata.registre.model.CollaborationProtocolMessageModel;
import no.grunndata.registre.model.CollaborationProtocolProfileModel;
import no.grunndata.registre.model.CollaborationProtocolRoleModel;
import no.grunndata.registre.schema.cpa.*;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Slf4j
public class CollaborationProtocolRegistryService {

    private final AbstractCollaborationProtocolRegistryRequest
            collaborationProtocolRegistrySoapService;
    private final CollaborationProtocolProfileMapper protocolProfileMapper;

    /**
     * Gets the CPP profile for a specific communication party
     *
     * @param counterpartyHerId Integer
     * @return CollaborationProtocolProfileModel
     */
    public Optional<CollaborationProtocolProfileModel> getProtocolForCounterParty(
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
    public Optional<CollaborationProtocolProfileModel> getAgreementForCommunicationParty(
            Integer herId, Integer counterpartyHerId) {

        CollaborationProtocolAgreement protocolAgreement =
                collaborationProtocolRegistrySoapService.getCpaForCommunicationParty(
                        herId, counterpartyHerId);
        if (protocolAgreement != null) {
            String cpaId = protocolAgreement.getCpaid();
            List<Packaging> packagings = protocolAgreement.getPackaging();
            List<SimplePart> simplePart = protocolAgreement.getSimplePart();

            return getCounterPartyInfo(herId, protocolAgreement)
                    .map(partyInfo -> protocolProfileMapper.createCollaborationProtocolProfileModel(
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
    public Optional<CollaborationProtocolProfileModel> getAgreementById(String cpaId, Integer herId) {

        CollaborationProtocolAgreement protocolAgreement =
                collaborationProtocolRegistrySoapService.getCpaForCommunicationPartyByCpaId(cpaId);
        if (protocolAgreement != null) {
            List<Packaging> packagings = protocolAgreement.getPackaging();
            List<SimplePart> simplePart = protocolAgreement.getSimplePart();

            return getCounterPartyInfo(herId, protocolAgreement).map(partyInfo -> {
                Integer counterpartyHerId =
                        partyInfo.getPartyId().stream()
                                .map(PartyId::getValue)
                                .map(Integer::parseInt)
                                .findAny()
                                .orElse(null);

                return protocolProfileMapper.createCollaborationProtocolProfileModel(
                        counterpartyHerId, cpaId, partyInfo, packagings, simplePart);
            });


        }
        return Optional.empty();
    }

    private Optional<PartyInfo> getCounterPartyInfo(
            Integer herId, CollaborationProtocolAgreement protocolAgreement) {
        // <tns:PartyId tns:type="HER">HERID</tns:PartyId>
        return protocolAgreement.getPartyInfo().stream()
                .filter(
                        partyInfo ->
                                partyInfo.getPartyId().stream()
                                        .filter(partyId -> partyId.getType().equals("HER"))
                                        .map(PartyId::getValue)
                                        .anyMatch(partyId -> !partyId.equals(herId.toString())))
                .findAny();
    }

    /**
     * Finds the collaboration information for a specific message /// Find using the
     * ProcessSpecification name as this matches the message name in both new and old Cpp formats ///
     * For response messages such as AppRec the ProcessSpecification name is not setup and the
     * receivemessages need to be checked
     *
     * @param messageName i.e. DIALOG_INNBYGER_EKONTAKT, DIALOG_INNBYGGER_KOORDINATOR, etc
     * @return CollaborationProtocolMessageModel
     */
    public CollaborationProtocolMessageModel getMessageForSendMessage(
            CollaborationProtocolProfileModel profile, String messageName) {
        if (messageName == null || messageName.isEmpty()) {
            throw new IllegalArgumentException("Message Name is empty");
        }

        Optional<CollaborationProtocolRoleModel> collaborationProtocolRoleModelOptional =
                profile.getRoles().stream()
                        .filter(role -> role.getProcessSpecification().getName().equalsIgnoreCase(messageName))
                        .findFirst();

        if (collaborationProtocolRoleModelOptional.isPresent()) {
            return collaborationProtocolRoleModelOptional.get().getSendMessages().stream()
                    .findFirst()
                    .orElse(null);
        } else {
            return profile.getRoles().stream()
                    .map(CollaborationProtocolRoleModel::getSendMessages)
                    .flatMap(Collection::stream)
                    .filter(m -> m.getName().equalsIgnoreCase(messageName))
                    .findFirst()
                    .orElse(null);
        }
    }

    /**
     * Finds the collaboration information for a specific message Find using the ProcessSpecification
     * name as this matches the message name in both new and old Cpp formats For response messages
     * such as AppRec the ProcessSpecification name is not setup and the receivemessages need to be
     *
     * @param messageName i.e. DIALOG_INNBYGER_EKONTAKT, DIALOG_INNBYGGER_KOORDINATOR, etc.
     * @return CollaborationProtocolMessageModel;
     */
    public CollaborationProtocolMessageModel findMessageForReceiver(
            CollaborationProtocolProfileModel profile, String messageName) {
        if (messageName == null || messageName.isEmpty()) {
            throw new IllegalArgumentException("Message Name is empty");
        }

        Optional<CollaborationProtocolRoleModel> collaborationProtocolRoleModelOptional =
                profile.getRoles().stream()
                        .filter(role -> role.getProcessSpecification().getName().equalsIgnoreCase(messageName))
                        .findFirst();

        if (collaborationProtocolRoleModelOptional.isPresent()) {
            return collaborationProtocolRoleModelOptional.get().getReceiveMessages().stream()
                    .findFirst()
                    .orElse(null);
        } else {
            return profile.getRoles().stream()
                    .map(CollaborationProtocolRoleModel::getReceiveMessages)
                    .flatMap(Collection::stream)
                    .filter(m -> m.getName().equalsIgnoreCase(messageName))
                    .findFirst()
                    .orElse(null);
        }
    }
}
