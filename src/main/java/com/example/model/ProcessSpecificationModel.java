package com.example.model;

import lombok.Data;

import java.io.Serializable;

/**
 * A ProcessSpecification can be thought of in practial terms as a message type.
 */
@Data
public class ProcessSpecificationModel implements Serializable {

    private String name;

    private String version;
}
