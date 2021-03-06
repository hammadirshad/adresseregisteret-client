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
 *         &lt;element name="GetCommunicationPartyDetailsResult" type="{http://register.nhn.no/CommunicationParty}CommunicationParty" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"getCommunicationPartyDetailsResult"})
@XmlRootElement(name = "GetCommunicationPartyDetailsResponse")
public class GetCommunicationPartyDetailsResponse {

  @XmlElementRef(
          name = "GetCommunicationPartyDetailsResult",
          namespace = "http://register.nhn.no/CommunicationParty",
          type = JAXBElement.class,
          required = false)
  protected JAXBElement<CommunicationParty> getCommunicationPartyDetailsResult;

  /**
   * Gets the value of the getCommunicationPartyDetailsResult property.
   *
   * @return possible object is {@link JAXBElement }{@code <}{@link CommunicationParty }{@code >}
   */
  public JAXBElement<CommunicationParty> getGetCommunicationPartyDetailsResult() {
    return getCommunicationPartyDetailsResult;
  }

  /**
   * Sets the value of the getCommunicationPartyDetailsResult property.
   *
   * @param value allowed object is {@link JAXBElement }{@code <}{@link CommunicationParty }{@code
   *              >}
   */
  public void setGetCommunicationPartyDetailsResult(JAXBElement<CommunicationParty> value) {
    this.getCommunicationPartyDetailsResult = value;
  }
}
