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
 *         &lt;element name="GetServiceDetailsResult" type="{http://register.nhn.no/CommunicationParty}Service" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"getServiceDetailsResult"})
@XmlRootElement(name = "GetServiceDetailsResponse")
public class GetServiceDetailsResponse {

  @XmlElementRef(
          name = "GetServiceDetailsResult",
          namespace = "http://register.nhn.no/CommunicationParty",
          type = JAXBElement.class,
          required = false)
  protected JAXBElement<Service> getServiceDetailsResult;

  /**
   * Gets the value of the getServiceDetailsResult property.
   *
   * @return possible object is {@link JAXBElement }{@code <}{@link Service }{@code >}
   */
  public JAXBElement<Service> getGetServiceDetailsResult() {
    return getServiceDetailsResult;
  }

  /**
   * Sets the value of the getServiceDetailsResult property.
   *
   * @param value allowed object is {@link JAXBElement }{@code <}{@link Service }{@code >}
   */
  public void setGetServiceDetailsResult(JAXBElement<Service> value) {
    this.getServiceDetailsResult = value;
  }
}
