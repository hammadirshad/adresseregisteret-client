package com.example.schema.ar;

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
 *         &lt;element name="code" type="{http://register.nhn.no/Common}Code" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"code"})
@XmlRootElement(name = "GetOrganizationsHavingCode")
public class GetOrganizationsHavingCode {

  @XmlElementRef(
          name = "code",
          namespace = "http://register.nhn.no/CommunicationParty",
          type = JAXBElement.class,
          required = false)
  protected JAXBElement<Code> code;

  /**
   * Gets the value of the code property.
   *
   * @return possible object is {@link JAXBElement }{@code <}{@link Code }{@code >}
   */
  public JAXBElement<Code> getCode() {
    return code;
  }

  /**
   * Sets the value of the code property.
   *
   * @param value allowed object is {@link JAXBElement }{@code <}{@link Code }{@code >}
   */
  public void setCode(JAXBElement<Code> value) {
    this.code = value;
  }
}
