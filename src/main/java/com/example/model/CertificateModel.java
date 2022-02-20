package com.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CertificateModel implements Serializable {

    private String ldapUrl;
    private byte[] certificateData;
    private X509Certificate certificate;
    private PrivateKey privateKey;
    private CertificateErrors certificateError;

    public CertificateModel(X509Certificate certificate) {
        this.certificate = certificate;
    }

    public CertificateModel(PrivateKey privateKey) {
        this.privateKey = privateKey;
    }

    public CertificateModel(String ldapUrl, byte[] certificateData) {
        this.ldapUrl = ldapUrl;
        this.certificateData = certificateData;
    }
}