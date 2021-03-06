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
 *         &lt;element name="t" type="{http://register.nhn.no/CommunicationParty}ServiceCreate" minOccurs="0"/>
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
@XmlRootElement(name = "CreateService")
public class CreateService {

  @XmlElementRef(
          name = "t",
          namespace = "http://register.nhn.no/CommunicationParty",
          type = JAXBElement.class,
          required = false)
  protected JAXBElement<ServiceCreate> t;

  /**
   * Gets the value of the t property.
   *
   * @return possible object is {@link JAXBElement }{@code <}{@link ServiceCreate }{@code >}
   */
  public JAXBElement<ServiceCreate> getT() {
    return t;
  }

  /**
   * Sets the value of the t property.
   *
   * @param value allowed object is {@link JAXBElement }{@code <}{@link ServiceCreate }{@code >}
   */
  public void setT(JAXBElement<ServiceCreate> value) {
    this.t = value;
  }
}
