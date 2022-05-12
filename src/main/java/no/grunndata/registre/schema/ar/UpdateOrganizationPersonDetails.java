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
 *         &lt;element name="p" type="{http://register.nhn.no/CommunicationParty}OrganizationPersonUpdate" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"p"})
@XmlRootElement(name = "UpdateOrganizationPersonDetails")
public class UpdateOrganizationPersonDetails {

  @XmlElementRef(
          name = "p",
          namespace = "http://register.nhn.no/CommunicationParty",
          type = JAXBElement.class,
          required = false)
  protected JAXBElement<OrganizationPersonUpdate> p;

  /**
   * Gets the value of the p property.
   *
   * @return possible object is {@link JAXBElement }{@code <}{@link OrganizationPersonUpdate }{@code
   * >}
   */
  public JAXBElement<OrganizationPersonUpdate> getP() {
    return p;
  }

  /**
   * Sets the value of the p property.
   *
   * @param value allowed object is {@link JAXBElement }{@code <}{@link OrganizationPersonUpdate
   *              }{@code >}
   */
  public void setP(JAXBElement<OrganizationPersonUpdate> value) {
    this.p = value;
  }
}
