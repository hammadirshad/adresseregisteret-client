//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference
// Implementation, v2.2.4-2
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2013.08.09 at 10:45:26 AM EST
//

package com.example.schema.cpa;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * Java class for accessAuthentication.type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <p>
 *
 * <pre>
 * &lt;simpleType name="accessAuthentication.type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="basic"/>
 *     &lt;enumeration value="digest"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "accessAuthentication.type")
@XmlEnum
public enum AccessAuthenticationType {
    @XmlEnumValue("basic")
    BASIC("basic"),
    @XmlEnumValue("digest")
    DIGEST("digest");
    private final String value;

    AccessAuthenticationType(String v) {
        value = v;
    }

    public static AccessAuthenticationType fromValue(String v) {
        for (AccessAuthenticationType c : AccessAuthenticationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

    public String value() {
        return value;
    }
}
