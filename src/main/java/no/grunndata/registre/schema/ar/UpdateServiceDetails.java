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
 *         &lt;element name="t" type="{http://register.nhn.no/CommunicationParty}ServiceUpdate" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"t"})
@XmlRootElement(name = "UpdateServiceDetails")
public class UpdateServiceDetails {

  @XmlElementRef(
          name = "t",
          namespace = "http://register.nhn.no/CommunicationParty",
          type = JAXBElement.class,
          required = false)
  protected JAXBElement<ServiceUpdate> t;

  /**
   * Gets the value of the t property.
   *
   * @return possible object is {@link JAXBElement }{@code <}{@link ServiceUpdate }{@code >}
   */
  public JAXBElement<ServiceUpdate> getT() {
    return t;
  }

  /**
   * Sets the value of the t property.
   *
   * @param value allowed object is {@link JAXBElement }{@code <}{@link ServiceUpdate }{@code >}
   */
  public void setT(JAXBElement<ServiceUpdate> value) {
    this.t = value;
  }
}
