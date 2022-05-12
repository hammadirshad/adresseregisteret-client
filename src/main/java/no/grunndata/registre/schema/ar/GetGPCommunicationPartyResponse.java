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
 *         &lt;element name="GetGPCommunicationPartyResult" type="{http://register.nhn.no/CommunicationParty}CommunicationParty" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"getGPCommunicationPartyResult"})
@XmlRootElement(name = "GetGPCommunicationPartyResponse")
public class GetGPCommunicationPartyResponse {

  @XmlElementRef(
          name = "GetGPCommunicationPartyResult",
          namespace = "http://register.nhn.no/CommunicationParty",
          type = JAXBElement.class,
          required = false)
  protected JAXBElement<CommunicationParty> getGPCommunicationPartyResult;

  /**
   * Gets the value of the getGPCommunicationPartyResult property.
   *
   * @return possible object is {@link JAXBElement }{@code <}{@link CommunicationParty }{@code >}
   */
  public JAXBElement<CommunicationParty> getGetGPCommunicationPartyResult() {
    return getGPCommunicationPartyResult;
  }

  /**
   * Sets the value of the getGPCommunicationPartyResult property.
   *
   * @param value allowed object is {@link JAXBElement }{@code <}{@link CommunicationParty }{@code
   *              >}
   */
  public void setGetGPCommunicationPartyResult(JAXBElement<CommunicationParty> value) {
    this.getGPCommunicationPartyResult = value;
  }
}
