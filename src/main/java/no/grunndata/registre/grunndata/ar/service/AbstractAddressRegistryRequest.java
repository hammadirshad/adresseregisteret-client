package no.grunndata.registre.grunndata.ar.service;

import no.grunndata.registre.schema.ar.CertificateDetails;
import no.grunndata.registre.schema.ar.CommunicationParty;

public abstract class AbstractAddressRegistryRequest {
    protected final String BASE_SOAP_ACTION =
            "http://register.nhn.no/CommunicationParty/ICommunicationPartyService/";

    public abstract CertificateDetails getCertificateDetailsForEncryption(Integer herId);

    public abstract CertificateDetails getCertificateDetailsForValidatingSignature(Integer herId);

    public abstract CommunicationParty getCommunicationPartyDetails(Integer herId);
}
