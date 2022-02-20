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
 *         &lt;element name="GetOrganizationsHavingCodeResult" type="{http://register.nhn.no/CommunicationParty}ArrayOfOrganization" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"getOrganizationsHavingCodeResult"})
@XmlRootElement(name = "GetOrganizationsHavingCodeResponse")
public class GetOrganizationsHavingCodeResponse {

  @XmlElementRef(
          name = "GetOrganizationsHavingCodeResult",
          namespace = "http://register.nhn.no/CommunicationParty",
          type = JAXBElement.class,
          required = false)
  protected JAXBElement<ArrayOfOrganization> getOrganizationsHavingCodeResult;

  /**
   * Gets the value of the getOrganizationsHavingCodeResult property.
   *
   * @return possible object is {@link JAXBElement }{@code <}{@link ArrayOfOrganization }{@code >}
   */
  public JAXBElement<ArrayOfOrganization> getGetOrganizationsHavingCodeResult() {
    return getOrganizationsHavingCodeResult;
  }

  /**
   * Sets the value of the getOrganizationsHavingCodeResult property.
   *
   * @param value allowed object is {@link JAXBElement }{@code <}{@link ArrayOfOrganization }{@code
   *              >}
   */
  public void setGetOrganizationsHavingCodeResult(JAXBElement<ArrayOfOrganization> value) {
    this.getOrganizationsHavingCodeResult = value;
  }
}
