package com.example.grunndata.ar.service;

import com.example.schema.ar.CertificateDetails;
import com.example.schema.ar.CommunicationParty;

public abstract class AbstractAddressRegistryRequest {
    protected final String BASE_SOAP_ACTION =
            "http://register.nhn.no/CommunicationParty/ICommunicationPartyService/";

    public abstract CertificateDetails getCertificateDetailsForEncryption(Integer herId);

    public abstract CertificateDetails getCertificateDetailsForValidatingSignature(Integer herId);

    public abstract CommunicationParty getCommunicationPartyDetails(Integer herId);
}
