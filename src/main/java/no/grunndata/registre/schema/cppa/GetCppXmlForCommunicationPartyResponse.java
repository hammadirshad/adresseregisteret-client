package no.grunndata.registre.schema.cppa;

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
 *         &lt;element name="GetCppXmlForCommunicationPartyResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"getCppXmlForCommunicationPartyResult"})
@XmlRootElement(name = "GetCppXmlForCommunicationPartyResponse")
public class GetCppXmlForCommunicationPartyResponse {

  @XmlElementRef(
          name = "GetCppXmlForCommunicationPartyResult",
          namespace = "http://schemas.nhn.no/reg/CollaborationProtocolProfile",
          type = JAXBElement.class,
          required = false)
  protected JAXBElement<String> getCppXmlForCommunicationPartyResult;

  /**
   * Gets the value of the getCppXmlForCommunicationPartyResult property.
   *
   * @return possible object is {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getGetCppXmlForCommunicationPartyResult() {
    return getCppXmlForCommunicationPartyResult;
  }

  /**
   * Sets the value of the getCppXmlForCommunicationPartyResult property.
   *
   * @param value allowed object is {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setGetCppXmlForCommunicationPartyResult(JAXBElement<String> value) {
    this.getCppXmlForCommunicationPartyResult = value;
  }
}
