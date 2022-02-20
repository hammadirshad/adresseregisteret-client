package com.example.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CollaborationProtocolMessageModel implements Serializable {

    /**
     * Name of message. i.e. DIALOG_INNBYGGER_KOORDINATOR
     */
    private String name;

    /**
     * The delivery channel that should be used. This will be the full queue name
     */
    private String deliveryChannel;

    /**
     * The type of protocol to be used
     */
    private DeliveryProtocol deliveryProtocol;

    /**
     * A list over parts the make up the message. If a message can contain information from many
     * different xsd's, there should be one entry per xsd. Earlier versions of some roles may not
     * contain all xsd information, so one has to assume a default version if nothing is provided.
     */
    private List<CollaborationProtocolMessagePartModel> parts;
}
