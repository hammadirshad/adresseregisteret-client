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
 *         &lt;element name="GetCertificateForEncryptionLdapResult" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"getCertificateForEncryptionLdapResult"})
@XmlRootElement(name = "GetCertificateForEncryptionLdapResponse")
public class GetCertificateForEncryptionLdapResponse {

  @XmlElementRef(
          name = "GetCertificateForEncryptionLdapResult",
          namespace = "http://register.nhn.no/CommunicationParty",
          type = JAXBElement.class,
          required = false)
  protected JAXBElement<byte[]> getCertificateForEncryptionLdapResult;

  /**
   * Gets the value of the getCertificateForEncryptionLdapResult property.
   *
   * @return possible object is {@link JAXBElement }{@code <}{@link byte[]}{@code >}
   */
  public JAXBElement<byte[]> getGetCertificateForEncryptionLdapResult() {
    return getCertificateForEncryptionLdapResult;
  }

  /**
   * Sets the value of the getCertificateForEncryptionLdapResult property.
   *
   * @param value allowed object is {@link JAXBElement }{@code <}{@link byte[]}{@code >}
   */
  public void setGetCertificateForEncryptionLdapResult(JAXBElement<byte[]> value) {
    this.getCertificateForEncryptionLdapResult = value;
  }
}
