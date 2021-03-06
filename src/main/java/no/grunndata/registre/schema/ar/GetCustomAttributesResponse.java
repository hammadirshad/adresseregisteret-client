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
 *         &lt;element name="GetCustomAttributesResult" type="{http://schemas.datacontract.org/2004/07/System.Collections.Generic}ArrayOfKeyValuePairOfintArrayOfCodeUO9uWExd" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"getCustomAttributesResult"})
@XmlRootElement(name = "GetCustomAttributesResponse")
public class GetCustomAttributesResponse {

  @XmlElementRef(
          name = "GetCustomAttributesResult",
          namespace = "http://register.nhn.no/CommunicationParty",
          type = JAXBElement.class,
          required = false)
  protected JAXBElement<ArrayOfKeyValuePairOfintArrayOfCodeUO9UWExd> getCustomAttributesResult;

  /**
   * Gets the value of the getCustomAttributesResult property.
   *
   * @return possible object is {@link JAXBElement }{@code <}{@link ArrayOfKeyValuePairOfintArrayOfCodeUO9UWExd
   * }{@code >}
   */
  public JAXBElement<ArrayOfKeyValuePairOfintArrayOfCodeUO9UWExd> getGetCustomAttributesResult() {
    return getCustomAttributesResult;
  }

  /**
   * Sets the value of the getCustomAttributesResult property.
   *
   * @param value allowed object is {@link JAXBElement }{@code <}{@link ArrayOfKeyValuePairOfintArrayOfCodeUO9UWExd
   *              }{@code >}
   */
  public void setGetCustomAttributesResult(
          JAXBElement<ArrayOfKeyValuePairOfintArrayOfCodeUO9UWExd> value) {
    this.getCustomAttributesResult = value;
  }
}
