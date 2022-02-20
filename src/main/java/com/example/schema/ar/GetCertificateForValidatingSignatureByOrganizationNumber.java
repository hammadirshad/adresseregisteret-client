package com.example.schema.ar;

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
 *         &lt;element name="organizationNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"organizationNumber"})
@XmlRootElement(name = "GetCertificateForValidatingSignatureByOrganizationNumber")
public class GetCertificateForValidatingSignatureByOrganizationNumber {

    protected Integer organizationNumber;

    /**
     * Gets the value of the organizationNumber property.
     *
     * @return possible object is {@link Integer }
     */
    public Integer getOrganizationNumber() {
        return organizationNumber;
    }

    /**
     * Sets the value of the organizationNumber property.
     *
     * @param value allowed object is {@link Integer }
     */
    public void setOrganizationNumber(Integer value) {
        this.organizationNumber = value;
    }
}
