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
 *         &lt;element name="org" type="{http://register.nhn.no/CommunicationParty}OrganizationCreate" minOccurs="0"/>
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
@XmlRootElement(name = "CreateOrganization")
public class CreateOrganization {

  @XmlElementRef(
          name = "org",
          namespace = "http://register.nhn.no/CommunicationParty",
          type = JAXBElement.class,
          required = false)
  protected JAXBElement<OrganizationCreate> org;

  /**
   * Gets the value of the org property.
   *
   * @return possible object is {@link JAXBElement }{@code <}{@link OrganizationCreate }{@code >}
   */
  public JAXBElement<OrganizationCreate> getOrg() {
    return org;
  }

  /**
   * Sets the value of the org property.
   *
   * @param value allowed object is {@link JAXBElement }{@code <}{@link OrganizationCreate }{@code
   *              >}
   */
  public void setOrg(JAXBElement<OrganizationCreate> value) {
    this.org = value;
  }
}
