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
 *         &lt;element name="GetOrganizationPersonDetailsResult" type="{http://register.nhn.no/CommunicationParty}OrganizationPerson" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"getOrganizationPersonDetailsResult"})
@XmlRootElement(name = "GetOrganizationPersonDetailsResponse")
public class GetOrganizationPersonDetailsResponse {

  @XmlElementRef(
          name = "GetOrganizationPersonDetailsResult",
          namespace = "http://register.nhn.no/CommunicationParty",
          type = JAXBElement.class,
          required = false)
  protected JAXBElement<OrganizationPerson> getOrganizationPersonDetailsResult;

  /**
   * Gets the value of the getOrganizationPersonDetailsResult property.
   *
   * @return possible object is {@link JAXBElement }{@code <}{@link OrganizationPerson }{@code >}
   */
  public JAXBElement<OrganizationPerson> getGetOrganizationPersonDetailsResult() {
    return getOrganizationPersonDetailsResult;
  }

  /**
   * Sets the value of the getOrganizationPersonDetailsResult property.
   *
   * @param value allowed object is {@link JAXBElement }{@code <}{@link OrganizationPerson }{@code
   *              >}
   */
  public void setGetOrganizationPersonDetailsResult(JAXBElement<OrganizationPerson> value) {
    this.getOrganizationPersonDetailsResult = value;
  }
}
