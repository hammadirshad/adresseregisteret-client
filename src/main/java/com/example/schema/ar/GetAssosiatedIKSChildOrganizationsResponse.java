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
 *         &lt;element name="GetAssosiatedIKSChildOrganizationsResult" type="{http://register.nhn.no/CommunicationParty}ArrayOfOrganization" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"getAssosiatedIKSChildOrganizationsResult"})
@XmlRootElement(name = "GetAssosiatedIKSChildOrganizationsResponse")
public class GetAssosiatedIKSChildOrganizationsResponse {

  @XmlElementRef(
          name = "GetAssosiatedIKSChildOrganizationsResult",
          namespace = "http://register.nhn.no/CommunicationParty",
          type = JAXBElement.class,
          required = false)
  protected JAXBElement<ArrayOfOrganization> getAssosiatedIKSChildOrganizationsResult;

  /**
   * Gets the value of the getAssosiatedIKSChildOrganizationsResult property.
   *
   * @return possible object is {@link JAXBElement }{@code <}{@link ArrayOfOrganization }{@code >}
   */
  public JAXBElement<ArrayOfOrganization> getGetAssosiatedIKSChildOrganizationsResult() {
    return getAssosiatedIKSChildOrganizationsResult;
  }

  /**
   * Sets the value of the getAssosiatedIKSChildOrganizationsResult property.
   *
   * @param value allowed object is {@link JAXBElement }{@code <}{@link ArrayOfOrganization }{@code
   *              >}
   */
  public void setGetAssosiatedIKSChildOrganizationsResult(JAXBElement<ArrayOfOrganization> value) {
    this.getAssosiatedIKSChildOrganizationsResult = value;
  }
}
