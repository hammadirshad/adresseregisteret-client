package com.example.model;

import java.io.Serializable;

public enum CertificateErrors implements Serializable {
    NONE(0),
    /*Start date is invalid*/
    BEFORE_START_DATE(1),
    /* End date is invalid*/
    AFTER_END_DATE(2),
    /*Certificate has incorrect usage*/
    INCORRECT_USAGE(4),
    /*Certificate was revoked*/
    REVOKED(8),
    /* Unable to determine revocation status. Service may be unavailable*/
    REVOKED_UNKNOWN(16),
    /*The certificate is missing*/
    MISSING(32);

    private final int value;

    CertificateErrors(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
