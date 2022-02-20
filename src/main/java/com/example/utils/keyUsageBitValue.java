package com.example.utils;

public enum keyUsageBitValue {
    digitalSignature(0),
    nonRepudiation(1),
    keyEncipherment(2),
    dataEncipherment(3),
    keyAgreement(4),
    keyCertSign(5),
    cRLSign(6),
    encipherOnly(7),
    decipherOnly(8);

    private final int bitValue;

    keyUsageBitValue(int bitValue) {
        this.bitValue = bitValue;
    }

    public int getBitValue() {
        return bitValue;
    }
}

