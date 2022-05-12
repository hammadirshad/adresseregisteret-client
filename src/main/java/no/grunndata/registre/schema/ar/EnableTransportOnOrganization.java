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
 *         &lt;element name="herId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="transportType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"herId", "transportType"})
@XmlRootElement(name = "EnableTransportOnOrganization")
public class EnableTransportOnOrganization {

  protected Integer herId;

  @XmlElementRef(
          name = "transportType",
          namespace = "http://register.nhn.no/CommunicationParty",
          type = JAXBElement.class,
          required = false)
  protected JAXBElement<String> transportType;

  /**
   * Gets the value of the herId property.
   *
   * @return possible object is {@link Integer }
   */
  public Integer getHerId() {
    return herId;
  }

  /**
   * Sets the value of the herId property.
   *
   * @param value allowed object is {@link Integer }
   */
  public void setHerId(Integer value) {
    this.herId = value;
  }

  /**
   * Gets the value of the transportType property.
   *
   * @return possible object is {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getTransportType() {
    return transportType;
  }

  /**
   * Sets the value of the transportType property.
   *
   * @param value allowed object is {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setTransportType(JAXBElement<String> value) {
    this.transportType = value;
  }
}
