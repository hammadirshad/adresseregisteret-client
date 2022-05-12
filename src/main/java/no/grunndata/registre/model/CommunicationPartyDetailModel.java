package no.grunndata.registre.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class CommunicationPartyDetailModel implements Serializable {

    /**
     * The HER-ID of the communication party. This is identifies this party in the Address Registry
     */
    private Integer herId;

    /**
     * EDI (Standardisert elektronisk melding)
     */
    private String edi;

    /**
     * LocationDescription Sted/funksjon
     */
    private String sted;

    /**
     * Name of the communication party.
     */
    private String name;

    /**
     * Name of the queue where the party expects synchronous messages to be received
     */
    private String synchronousQueueName;
    /**
     * Name of the queue where the party expects synchronous reply messages to be received
     */
    private String synchronousReplyQueueName;
    /**
     * Name of the queue where the party expectes asynchronous message to be received
     */
    private String asynchronousQueueName;
    /**
     * Name of the queue where the party expects error messages to be received
     */
    private String errorQueueName;
    /**
     * The HER-ID of the communication party's parent
     */
    private Integer parentHerId;
    /**
     * Name of the communication party's parent
     */
    private String parentName;

    /**
     * The Organization Number of the communication party's parent
     */
    private Integer parentOrganizationNumber;

    public CommunicationPartyDetailModel(
            Integer herId, String name, Integer parentHerId, String parentName) {
        this.herId = herId;
        this.name = name;
        this.parentHerId = parentHerId;
        this.parentName = parentName;
    }
}