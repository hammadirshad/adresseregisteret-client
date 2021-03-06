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
 *         &lt;element name="sn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ou" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"sn", "cn", "ou"})
@XmlRootElement(name = "SearchCertificatesForEncryption")
public class SearchCertificatesForEncryption {

  @XmlElementRef(
          name = "sn",
          namespace = "http://register.nhn.no/CommunicationParty",
          type = JAXBElement.class,
          required = false)
  protected JAXBElement<String> sn;

  @XmlElementRef(
          name = "cn",
          namespace = "http://register.nhn.no/CommunicationParty",
          type = JAXBElement.class,
          required = false)
  protected JAXBElement<String> cn;

  @XmlElementRef(
          name = "ou",
          namespace = "http://register.nhn.no/CommunicationParty",
          type = JAXBElement.class,
          required = false)
  protected JAXBElement<String> ou;

  /**
   * Gets the value of the sn property.
   *
   * @return possible object is {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getSn() {
    return sn;
  }

  /**
   * Sets the value of the sn property.
   *
   * @param value allowed object is {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setSn(JAXBElement<String> value) {
    this.sn = value;
  }

  /**
   * Gets the value of the cn property.
   *
   * @return possible object is {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getCn() {
    return cn;
  }

  /**
   * Sets the value of the cn property.
   *
   * @param value allowed object is {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setCn(JAXBElement<String> value) {
    this.cn = value;
  }

  /**
   * Gets the value of the ou property.
   *
   * @return possible object is {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getOu() {
    return ou;
  }

  /**
   * Sets the value of the ou property.
   *
   * @param value allowed object is {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setOu(JAXBElement<String> value) {
    this.ou = value;
  }
}
