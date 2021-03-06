package no.grunndata.registre.schema.ar;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * Java class for HPRInformation complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="HPRInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Authorizations" type="{http://register.nhn.no/HPR}ArrayOfAuthorization" minOccurs="0"/>
 *         &lt;element name="HPRNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HPRNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="LastChanged" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="SpecialCompetences" type="{http://register.nhn.no/HPR}ArrayOfSpecialCompetence" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "HPRInformation",
        namespace = "http://register.nhn.no/HPR",
        propOrder = {"authorizations", "hprNo", "hprNumber", "lastChanged", "specialCompetences"})
public class HPRInformation {

  @XmlElementRef(
          name = "Authorizations",
          namespace = "http://register.nhn.no/HPR",
          type = JAXBElement.class,
          required = false)
  protected JAXBElement<ArrayOfAuthorization> authorizations;

  @XmlElementRef(
          name = "HPRNo",
          namespace = "http://register.nhn.no/HPR",
          type = JAXBElement.class,
          required = false)
  protected JAXBElement<String> hprNo;

  @XmlElement(name = "HPRNumber")
  protected Integer hprNumber;

  @XmlElement(name = "LastChanged")
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar lastChanged;

  @XmlElementRef(
          name = "SpecialCompetences",
          namespace = "http://register.nhn.no/HPR",
          type = JAXBElement.class,
          required = false)
  protected JAXBElement<ArrayOfSpecialCompetence> specialCompetences;

  /**
   * Gets the value of the authorizations property.
   *
   * @return possible object is {@link JAXBElement }{@code <}{@link ArrayOfAuthorization }{@code >}
   */
  public JAXBElement<ArrayOfAuthorization> getAuthorizations() {
    return authorizations;
  }

  /**
   * Sets the value of the authorizations property.
   *
   * @param value allowed object is {@link JAXBElement }{@code <}{@link ArrayOfAuthorization }{@code
   *              >}
   */
  public void setAuthorizations(JAXBElement<ArrayOfAuthorization> value) {
    this.authorizations = value;
  }

  /**
   * Gets the value of the hprNo property.
   *
   * @return possible object is {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getHPRNo() {
    return hprNo;
  }

  /**
   * Sets the value of the hprNo property.
   *
   * @param value allowed object is {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setHPRNo(JAXBElement<String> value) {
    this.hprNo = value;
  }

  /**
   * Gets the value of the hprNumber property.
   *
   * @return possible object is {@link Integer }
   */
  public Integer getHPRNumber() {
    return hprNumber;
  }

  /**
   * Sets the value of the hprNumber property.
   *
   * @param value allowed object is {@link Integer }
   */
  public void setHPRNumber(Integer value) {
    this.hprNumber = value;
  }

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
   * Gets the value of the specialCompetences property.
   *
   * @return possible object is {@link JAXBElement }{@code <}{@link ArrayOfSpecialCompetence }{@code
   * >}
   */
  public JAXBElement<ArrayOfSpecialCompetence> getSpecialCompetences() {
    return specialCompetences;
  }

  /**
   * Sets the value of the specialCompetences property.
   *
   * @param value allowed object is {@link JAXBElement }{@code <}{@link ArrayOfSpecialCompetence
   *              }{@code >}
   */
  public void setSpecialCompetences(JAXBElement<ArrayOfSpecialCompetence> value) {
    this.specialCompetences = value;
  }
}
