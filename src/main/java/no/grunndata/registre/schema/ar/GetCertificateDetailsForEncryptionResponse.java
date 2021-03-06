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
 *         &lt;element name="GetCertificateDetailsForEncryptionResult" type="{http://register.nhn.no/CertificateDetails}CertificateDetails" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"getCertificateDetailsForEncryptionResult"})
@XmlRootElement(name = "GetCertificateDetailsForEncryptionResponse")
public class GetCertificateDetailsForEncryptionResponse {

  @XmlElementRef(
          name = "GetCertificateDetailsForEncryptionResult",
          namespace = "http://register.nhn.no/CommunicationParty",
          type = JAXBElement.class,
          required = false)
  protected JAXBElement<CertificateDetails> getCertificateDetailsForEncryptionResult;

  /**
   * Gets the value of the getCertificateDetailsForEncryptionResult property.
   *
   * @return possible object is {@link JAXBElement }{@code <}{@link CertificateDetails }{@code >}
   */
  public JAXBElement<CertificateDetails> getGetCertificateDetailsForEncryptionResult() {
    return getCertificateDetailsForEncryptionResult;
  }

  /**
   * Sets the value of the getCertificateDetailsForEncryptionResult property.
   *
   * @param value allowed object is {@link JAXBElement }{@code <}{@link CertificateDetails }{@code
   *              >}
   */
  public void setGetCertificateDetailsForEncryptionResult(JAXBElement<CertificateDetails> value) {
    this.getCertificateDetailsForEncryptionResult = value;
  }
}
