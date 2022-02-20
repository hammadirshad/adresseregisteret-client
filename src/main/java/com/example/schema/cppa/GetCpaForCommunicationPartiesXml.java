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
 *         &lt;element name="communicationPartAHerId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="communicationPartBHerId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"communicationPartAHerId", "communicationPartBHerId"})
@XmlRootElement(name = "GetCpaForCommunicationPartiesXml")
public class GetCpaForCommunicationPartiesXml {

    protected Integer communicationPartAHerId;
    protected Integer communicationPartBHerId;

    /**
     * Gets the value of the communicationPartAHerId property.
     *
     * @return possible object is {@link Integer }
     */
    public Integer getCommunicationPartAHerId() {
        return communicationPartAHerId;
    }

    /**
     * Sets the value of the communicationPartAHerId property.
     *
     * @param value allowed object is {@link Integer }
     */
    public void setCommunicationPartAHerId(Integer value) {
        this.communicationPartAHerId = value;
    }

    /**
     * Gets the value of the communicationPartBHerId property.
     *
     * @return possible object is {@link Integer }
     */
    public Integer getCommunicationPartBHerId() {
        return communicationPartBHerId;
    }

    /**
     * Sets the value of the communicationPartBHerId property.
     *
     * @param value allowed object is {@link Integer }
     */
    public void setCommunicationPartBHerId(Integer value) {
        this.communicationPartBHerId = value;
    }
}
