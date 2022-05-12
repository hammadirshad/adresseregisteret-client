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
 *         &lt;element name="SearchCertificatesForValidatingSignatureResult" type="{http://register.nhn.no/CertificateDetails}ArrayOfCertificateDetails" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"searchCertificatesForValidatingSignatureResult"})
@XmlRootElement(name = "SearchCertificatesForValidatingSignatureResponse")
public class SearchCertificatesForValidatingSignatureResponse {

  @XmlElementRef(
          name = "SearchCertificatesForValidatingSignatureResult",
          namespace = "http://register.nhn.no/CommunicationParty",
          type = JAXBElement.class,
          required = false)
  protected JAXBElement<ArrayOfCertificateDetails> searchCertificatesForValidatingSignatureResult;

  /**
   * Gets the value of the searchCertificatesForValidatingSignatureResult property.
   *
   * @return possible object is {@link JAXBElement }{@code <}{@link ArrayOfCertificateDetails
   * }{@code >}
   */
  public JAXBElement<ArrayOfCertificateDetails>
  getSearchCertificatesForValidatingSignatureResult() {
    return searchCertificatesForValidatingSignatureResult;
  }

  /**
   * Sets the value of the searchCertificatesForValidatingSignatureResult property.
   *
   * @param value allowed object is {@link JAXBElement }{@code <}{@link ArrayOfCertificateDetails
   *              }{@code >}
   */
  public void setSearchCertificatesForValidatingSignatureResult(
          JAXBElement<ArrayOfCertificateDetails> value) {
    this.searchCertificatesForValidatingSignatureResult = value;
  }
}
