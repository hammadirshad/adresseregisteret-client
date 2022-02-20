package com.example.model;


import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * A role can be thought of as the party providing a specific service. The CollaborationRole links
 * the role to the ProcessSpecification and messages allowed hese are defined in 2 formats; the
 * first example is an older format and the second a newer format that better defines the messages
 * and roles
 */
@Data
public class CollaborationProtocolRoleModel implements Serializable {

    /*
     * Name of role
     * */
    private String roleName;

    /*
     * Name of role
     * */
    private String name;

    /*String representation of version*/
    private String version;

    /**
     * List of messages this role can send. If messages are bi-directional, the same information will
     * be present in both the SendMessages and ReceiveMessages
     */
    private List<CollaborationProtocolMessageModel> sendMessages;

    /**
     * List of messages this role can receive. If messages are bi-directional, the same information
     * will be present in both the SendMessages and ReceiveMessages
     */
    private List<CollaborationProtocolMessageModel> receiveMessages;

    /**
     * Contains information on the name and version of message
     */
    private ProcessSpecificationModel processSpecification;
}
