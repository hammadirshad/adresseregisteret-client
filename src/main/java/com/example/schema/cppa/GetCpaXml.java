package com.example.schema.cppa;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cpaId" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"cpaId"})
@XmlRootElement(name = "GetCpaXml")
public class GetCpaXml {

    protected String cpaId;

    /**
     * Gets the value of the cpaId property.
     *
     * @return possible object is {@link String }
     */
    public String getCpaId() {
        return cpaId;
    }

    /**
     * Sets the value of the cpaId property.
     *
     * @param value allowed object is {@link String }
     */
    public void setCpaId(String value) {
        this.cpaId = value;
    }
}
