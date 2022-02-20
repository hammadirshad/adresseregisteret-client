package com.example.schema.cppa;

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
 *         &lt;element name="GetCpaXmlResult" type="{http://schemas.nhn.no/reg/CollaborationProtocolProfile}CpaXmlDetails" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"getCpaXmlResult"})
@XmlRootElement(name = "GetCpaXmlResponse")
public class GetCpaXmlResponse {

  @XmlElementRef(
          name = "GetCpaXmlResult",
          namespace = "http://schemas.nhn.no/reg/CollaborationProtocolProfile",
          type = JAXBElement.class,
          required = false)
  protected JAXBElement<CpaXmlDetails> getCpaXmlResult;

  /**
   * Gets the value of the getCpaXmlResult property.
   *
   * @return possible object is {@link JAXBElement }{@code <}{@link CpaXmlDetails }{@code >}
   */
  public JAXBElement<CpaXmlDetails> getGetCpaXmlResult() {
    return getCpaXmlResult;
  }

  /**
   * Sets the value of the getCpaXmlResult property.
   *
   * @param value allowed object is {@link JAXBElement }{@code <}{@link CpaXmlDetails }{@code >}
   */
  public void setGetCpaXmlResult(JAXBElement<CpaXmlDetails> value) {
    this.getCpaXmlResult = value;
  }
}
