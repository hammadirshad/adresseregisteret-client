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
 *         &lt;element name="GetOrganizationsOwnedByResult" type="{http://register.nhn.no/CommunicationParty}ArrayOfOrganization" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"getOrganizationsOwnedByResult"})
@XmlRootElement(name = "GetOrganizationsOwnedByResponse")
public class GetOrganizationsOwnedByResponse {

  @XmlElementRef(
          name = "GetOrganizationsOwnedByResult",
          namespace = "http://register.nhn.no/CommunicationParty",
          type = JAXBElement.class,
          required = false)
  protected JAXBElement<ArrayOfOrganization> getOrganizationsOwnedByResult;

  /**
   * Gets the value of the getOrganizationsOwnedByResult property.
   *
   * @return possible object is {@link JAXBElement }{@code <}{@link ArrayOfOrganization }{@code >}
   */
  public JAXBElement<ArrayOfOrganization> getGetOrganizationsOwnedByResult() {
    return getOrganizationsOwnedByResult;
  }

  /**
   * Sets the value of the getOrganizationsOwnedByResult property.
   *
   * @param value allowed object is {@link JAXBElement }{@code <}{@link ArrayOfOrganization }{@code
   *              >}
   */
  public void setGetOrganizationsOwnedByResult(JAXBElement<ArrayOfOrganization> value) {
    this.getOrganizationsOwnedByResult = value;
  }
}
