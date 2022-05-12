package no.grunndata.registre.schema.ar;

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
 *         &lt;element name="org" type="{http://register.nhn.no/CommunicationParty}OrganizationUpdate" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"org"})
@XmlRootElement(name = "UpdateOrganizationDetails")
public class UpdateOrganizationDetails {

  @XmlElementRef(
          name = "org",
          namespace = "http://register.nhn.no/CommunicationParty",
          type = JAXBElement.class,
          required = false)
  protected JAXBElement<OrganizationUpdate> org;

  /**
   * Gets the value of the org property.
   *
   * @return possible object is {@link JAXBElement }{@code <}{@link OrganizationUpdate }{@code >}
   */
  public JAXBElement<OrganizationUpdate> getOrg() {
    return org;
  }

  /**
   * Sets the value of the org property.
   *
   * @param value allowed object is {@link JAXBElement }{@code <}{@link OrganizationUpdate }{@code
   *              >}
   */
  public void setOrg(JAXBElement<OrganizationUpdate> value) {
    this.org = value;
  }
}
