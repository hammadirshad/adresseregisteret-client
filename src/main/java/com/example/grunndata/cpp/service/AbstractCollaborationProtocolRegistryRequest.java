package com.example.grunndata.cpp.service;

import com.example.schema.cpa.CollaborationProtocolAgreement;
import com.example.schema.cpa.CollaborationProtocolProfile;

public abstract class AbstractCollaborationProtocolRegistryRequest {
    protected final String BASE_SOAP_ACTION =
            "http://schemas.nhn.no/reg/CollaborationProtocolProfile/ICPPAService/";

    public abstract CollaborationProtocolProfile getCppForCommunicationParty(
            Integer counterpartyHerId);

    public abstract CollaborationProtocolAgreement getCpaForCommunicationParty(
            Integer herId, Integer counterpartyHerId);

    public abstract CollaborationProtocolAgreement getCpaForCommunicationPartyByCpaId(String cpaId);
}
