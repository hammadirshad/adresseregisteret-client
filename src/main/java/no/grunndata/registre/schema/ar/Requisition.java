package no.grunndata.registre.schema.ar;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * Java class for Requisition complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Requisition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LastChanged" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Type" type="{http://register.nhn.no/Common}Code" minOccurs="0"/>
 *         &lt;element name="Valid" type="{http://register.nhn.no/Common}Period" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "Requisition",
        namespace = "http://register.nhn.no/HPR",
        propOrder = {"lastChanged", "type", "valid"})
public class Requisition {

  @XmlElement(name = "LastChanged")
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar lastChanged;

  @XmlElementRef(
          name = "Type",
          namespace = "http://register.nhn.no/HPR",
          type = JAXBElement.class,
          required = false)
  protected JAXBElement<Code> type;

  @XmlElementRef(
          name = "Valid",
          namespace = "http://register.nhn.no/HPR",
          type = JAXBElement.class,
          required = false)
  protected JAXBElement<Period> valid;

  /**
   * Gets the value of the lastChanged property.
   *
   * @return possible object is {@link XMLGregorianCalendar }
   */
  public XMLGregorianCalendar getLastChanged() {
    return lastChanged;
  }

  /**
   * Sets the value of the lastChanged property.
   *
   * @param value allowed object is {@link XMLGregorianCalendar }
   */
  public void setLastChanged(XMLGregorianCalendar value) {
    this.lastChanged = value;
  }

  /**
   * Gets the value of the type property.
   *
   * @return possible object is {@link JAXBElement }{@code <}{@link Code }{@code >}
   */
  public JAXBElement<Code> getType() {
    return type;
  }

  /**
   * Sets the value of the type property.
   *
   * @param value allowed object is {@link JAXBElement }{@code <}{@link Code }{@code >}
   */
  public void setType(JAXBElement<Code> value) {
    this.type = value;
  }

  /**
   * Gets the value of the valid property.
   *
   * @return possible object is {@link JAXBElement }{@code <}{@link Period }{@code >}
   */
  public JAXBElement<Period> getValid() {
    return valid;
  }

  /**
   * Sets the value of the valid property.
   *
   * @param value allowed object is {@link JAXBElement }{@code <}{@link Period }{@code >}
   */
  public void setValid(JAXBElement<Period> value) {
    this.valid = value;
  }
}
