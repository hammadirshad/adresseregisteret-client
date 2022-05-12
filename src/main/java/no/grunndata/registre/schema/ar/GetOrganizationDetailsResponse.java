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
 *         &lt;element name="GetOrganizationDetailsResult" type="{http://register.nhn.no/CommunicationParty}Organization" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"getOrganizationDetailsResult"})
@XmlRootElement(name = "GetOrganizationDetailsResponse")
public class GetOrganizationDetailsResponse {

  @XmlElementRef(
          name = "GetOrganizationDetailsResult",
          namespace = "http://register.nhn.no/CommunicationParty",
          type = JAXBElement.class,
          required = false)
  protected JAXBElement<Organization> getOrganizationDetailsResult;

  /**
   * Gets the value of the getOrganizationDetailsResult property.
   *
   * @return possible object is {@link JAXBElement }{@code <}{@link Organization }{@code >}
   */
  public JAXBElement<Organization> getGetOrganizationDetailsResult() {
    return getOrganizationDetailsResult;
  }

  /**
   * Sets the value of the getOrganizationDetailsResult property.
   *
   * @param value allowed object is {@link JAXBElement }{@code <}{@link Organization }{@code >}
   */
  public void setGetOrganizationDetailsResult(JAXBElement<Organization> value) {
    this.getOrganizationDetailsResult = value;
  }
}
