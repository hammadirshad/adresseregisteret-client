package com.example.model;

import java.io.Serializable;

public enum CertificateErrors implements Serializable {
    None(0),
    /*Start date is invalid*/
    StartDate(1),
    /* End date is invalid*/
    EndDate(2),
    /*Certificate has incorrect usage*/
    Usage(4),
    /*Certificate was revoked*/
    Revoked(8),
    /* Unable to determine revocation status. Service may be unavailable*/
    RevokedUnknown(16),
    /*The certificate is missing*/
    Missing(32);

    private final int value;

    CertificateErrors(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
