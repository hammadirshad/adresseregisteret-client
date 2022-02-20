package com.example.schema.ar;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;

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
 *         &lt;element name="herIds" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"herIds"})
@XmlRootElement(name = "GetCustomAttributes")
public class GetCustomAttributes {

  @XmlElementRef(
          name = "herIds",
          namespace = "http://register.nhn.no/CommunicationParty",
          type = JAXBElement.class,
          required = false)
  protected JAXBElement<ArrayOfint> herIds;

  /**
   * Gets the value of the herIds property.
   *
   * @return possible object is {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
   */
  public JAXBElement<ArrayOfint> getHerIds() {
    return herIds;
  }

  /**
   * Sets the value of the herIds property.
   *
   * @param value allowed object is {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
   */
  public void setHerIds(JAXBElement<ArrayOfint> value) {
    this.herIds = value;
  }
}
