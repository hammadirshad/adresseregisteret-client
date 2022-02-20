package com.example.model;

public enum DeliveryProtocol {
    UNKNOWN(0),
    /*Start date is invalid*/
    AMQP(1);

    private int value;

    DeliveryProtocol(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
