package com.example.grunndata.cpp.service;

import com.example.model.CollaborationProtocolMessageModel;
import com.example.model.CollaborationProtocolProfileModel;
import com.example.model.CollaborationProtocolRoleModel;

import java.util.Collection;
import java.util.Optional;

public abstract class AbstractCollaborationProtocolRegistry {

    /**
     * @param counterPartyHerId receiver HER id
     *                          <p>Finds the collaboration protocol for a communication party
     * @return CollaborationProtocolProfileModel
     */
    public abstract Optional<CollaborationProtocolProfileModel> findProtocolForCounterParty(
            Integer counterPartyHerId);

    /**
     * @param counterPartyHerId receiver HER id
     * @param herId             Sender HER id
     *                          <p>Finds the counter party between us and some other communication party
     * @return CollaborationProtocolProfileModel
     */
    public abstract Optional<CollaborationProtocolProfileModel> findAgreementForCommunicationParty(
            Integer herId, Integer counterPartyHerId);

    /**
     * @param cpaId agreement id
     * @param herId HER id
     *              <p>Finds a collaboration agreement based on an id
     * @return CollaborationProtocolProfileModel
     */
    public abstract Optional<CollaborationProtocolProfileModel> findAgreementById(
            String cpaId, Integer herId);

    /**
     * Finds the collaboration information for a specific message /// Find using the
     * ProcessSpecification name as this matches the message name in both new and old Cpp formats ///
     * For response messages such as AppRec the ProcessSpecification name is not setup and the
     * receivemessages need to be checked
     *
     * @param messageName i.e. DIALOG_INNBYGER_EKONTAKT, DIALOG_INNBYGGER_KOORDINATOR, etc
     * @return CollaborationProtocolMessageModel
     */
    public CollaborationProtocolMessageModel findMessageForSendMessage(
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
