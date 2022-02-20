package com.example.grunndata.ar.service;


import com.example.model.CertificateModel;
import com.example.model.CommunicationPartyDetailModel;

public abstract class AbstractAddressRegistry {

    public abstract CertificateModel getCertificateForEncryption(Integer herId);

    public abstract CertificateModel getCertificateForValidatingSignature(Integer herId);

    public abstract CommunicationPartyDetailModel getCommunicationPartyDetails(Integer herId);
}
