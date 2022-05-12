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
 *         &lt;element name="AddCustomAttributeResult" type="{http://register.nhn.no/Common}Code" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"addCustomAttributeResult"})
@XmlRootElement(name = "AddCustomAttributeResponse")
public class AddCustomAttributeResponse {

  @XmlElementRef(
          name = "AddCustomAttributeResult",
          namespace = "http://register.nhn.no/CommunicationParty",
          type = JAXBElement.class,
          required = false)
  protected JAXBElement<Code> addCustomAttributeResult;

  /**
   * Gets the value of the addCustomAttributeResult property.
   *
   * @return possible object is {@link JAXBElement }{@code <}{@link Code }{@code >}
   */
  public JAXBElement<Code> getAddCustomAttributeResult() {
    return addCustomAttributeResult;
  }

  /**
   * Sets the value of the addCustomAttributeResult property.
   *
   * @param value allowed object is {@link JAXBElement }{@code <}{@link Code }{@code >}
   */
  public void setAddCustomAttributeResult(JAXBElement<Code> value) {
    this.addCustomAttributeResult = value;
  }
}
