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
 *         &lt;element name="GetCertificateForValidatingSignatureLdapResult" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"getCertificateForValidatingSignatureLdapResult"})
@XmlRootElement(name = "GetCertificateForValidatingSignatureLdapResponse")
public class GetCertificateForValidatingSignatureLdapResponse {

  @XmlElementRef(
          name = "GetCertificateForValidatingSignatureLdapResult",
          namespace = "http://register.nhn.no/CommunicationParty",
          type = JAXBElement.class,
          required = false)
  protected JAXBElement<byte[]> getCertificateForValidatingSignatureLdapResult;

  /**
   * Gets the value of the getCertificateForValidatingSignatureLdapResult property.
   *
   * @return possible object is {@link JAXBElement }{@code <}{@link byte[]}{@code >}
   */
  public JAXBElement<byte[]> getGetCertificateForValidatingSignatureLdapResult() {
    return getCertificateForValidatingSignatureLdapResult;
  }

  /**
   * Sets the value of the getCertificateForValidatingSignatureLdapResult property.
   *
   * @param value allowed object is {@link JAXBElement }{@code <}{@link byte[]}{@code >}
   */
  public void setGetCertificateForValidatingSignatureLdapResult(JAXBElement<byte[]> value) {
    this.getCertificateForValidatingSignatureLdapResult = value;
  }
}
