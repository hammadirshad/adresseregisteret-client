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
 *         &lt;element name="PingResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"pingResult"})
@XmlRootElement(name = "PingResponse")
public class PingResponse {

  @XmlElementRef(
          name = "PingResult",
          namespace = "http://register.nhn.no/CommunicationParty",
          type = JAXBElement.class,
          required = false)
  protected JAXBElement<String> pingResult;

  /**
   * Gets the value of the pingResult property.
   *
   * @return possible object is {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getPingResult() {
    return pingResult;
  }

  /**
   * Sets the value of the pingResult property.
   *
   * @param value allowed object is {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setPingResult(JAXBElement<String> value) {
    this.pingResult = value;
  }
}
