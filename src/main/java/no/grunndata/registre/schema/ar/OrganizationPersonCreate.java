package no.grunndata.registre.schema.ar;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;

/**
 * Java class for OrganizationPersonCreate complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="OrganizationPersonCreate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ElectronicAddresses" type="{http://register.nhn.no/Common}ArrayOfElectronicAddress" minOccurs="0"/>
 *         &lt;element name="HprNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ParentHerId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PhysicalAddresses" type="{http://register.nhn.no/Common}ArrayOfPhysicalAddress" minOccurs="0"/>
 *         &lt;element name="Professions" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="Properties" type="{http://register.nhn.no/Common}ArrayOfCode" minOccurs="0"/>
 *         &lt;element name="Specialities" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Valid" type="{http://register.nhn.no/Common}Period" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "OrganizationPersonCreate",
        propOrder = {
                "electronicAddresses",
                "hprNumber",
                "parentHerId",
                "physicalAddresses",
                "professions",
                "properties",
                "specialities",
                "title",
                "valid"
        })
public class OrganizationPersonCreate {

  @XmlElementRef(
          name = "ElectronicAddresses",
          namespace = "http://register.nhn.no/CommunicationParty",
          type = JAXBElement.class,
          required = false)
  protected JAXBElement<ArrayOfElectronicAddress> electronicAddresses;

  @XmlElementRef(
          name = "HprNumber",
          namespace = "http://register.nhn.no/CommunicationParty",
          type = JAXBElement.class,
          required = false)
  protected JAXBElement<String> hprNumber;

  @XmlElement(name = "ParentHerId")
  protected Integer parentHerId;

  @XmlElementRef(
          name = "PhysicalAddresses",
          namespace = "http://register.nhn.no/CommunicationParty",
          type = JAXBElement.class,
          required = false)
  protected JAXBElement<ArrayOfPhysicalAddress> physicalAddresses;

  @XmlElementRef(
          name = "Professions",
          namespace = "http://register.nhn.no/CommunicationParty",
          type = JAXBElement.class,
          required = false)
  protected JAXBElement<ArrayOfstring> professions;

  @XmlElementRef(
          name = "Properties",
          namespace = "http://register.nhn.no/CommunicationParty",
          type = JAXBElement.class,
          required = false)
  protected JAXBElement<ArrayOfCode> properties;

  @XmlElementRef(
          name = "Specialities",
          namespace = "http://register.nhn.no/CommunicationParty",
          type = JAXBElement.class,
          required = false)
  protected JAXBElement<ArrayOfstring> specialities;

  @XmlElementRef(
          name = "Title",
          namespace = "http://register.nhn.no/CommunicationParty",
          type = JAXBElement.class,
          required = false)
  protected JAXBElement<String> title;

  @XmlElementRef(
          name = "Valid",
          namespace = "http://register.nhn.no/CommunicationParty",
          type = JAXBElement.class,
          required = false)
  protected JAXBElement<Period> valid;

  /**
   * Gets the value of the electronicAddresses property.
   *
   * @return possible object is {@link JAXBElement }{@code <}{@link ArrayOfElectronicAddress }{@code
   * >}
   */
  public JAXBElement<ArrayOfElectronicAddress> getElectronicAddresses() {
    return electronicAddresses;
  }

  /**
   * Sets the value of the electronicAddresses property.
   *
   * @param value allowed object is {@link JAXBElement }{@code <}{@link ArrayOfElectronicAddress
   *              }{@code >}
   */
  public void setElectronicAddresses(JAXBElement<ArrayOfElectronicAddress> value) {
    this.electronicAddresses = value;
  }

  /**
   * Gets the value of the hprNumber property.
   *
   * @return possible object is {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getHprNumber() {
    return hprNumber;
  }

  /**
   * Sets the value of the hprNumber property.
   *
   * @param value allowed object is {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setHprNumber(JAXBElement<String> value) {
    this.hprNumber = value;
  }

  /**
   * Gets the value of the parentHerId property.
   *
   * @return possible object is {@link Integer }
   */
  public Integer getParentHerId() {
    return parentHerId;
  }

  /**
   * Sets the value of the parentHerId property.
   *
   * @param value allowed object is {@link Integer }
   */
  public void setParentHerId(Integer value) {
    this.parentHerId = value;
  }

  /**
   * Gets the value of the physicalAddresses property.
   *
   * @return possible object is {@link JAXBElement }{@code <}{@link ArrayOfPhysicalAddress }{@code
   * >}
   */
  public JAXBElement<ArrayOfPhysicalAddress> getPhysicalAddresses() {
    return physicalAddresses;
  }

  /**
   * Sets the value of the physicalAddresses property.
   *
   * @param value allowed object is {@link JAXBElement }{@code <}{@link ArrayOfPhysicalAddress
   *              }{@code >}
   */
  public void setPhysicalAddresses(JAXBElement<ArrayOfPhysicalAddress> value) {
    this.physicalAddresses = value;
  }

  /**
   * Gets the value of the professions property.
   *
   * @return possible object is {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
   */
  public JAXBElement<ArrayOfstring> getProfessions() {
    return professions;
  }

  /**
   * Sets the value of the professions property.
   *
   * @param value allowed object is {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
   */
  public void setProfessions(JAXBElement<ArrayOfstring> value) {
    this.professions = value;
  }

  /**
   * Gets the value of the properties property.
   *
   * @return possible object is {@link JAXBElement }{@code <}{@link ArrayOfCode }{@code >}
   */
  public JAXBElement<ArrayOfCode> getProperties() {
    return properties;
  }

  /**
   * Sets the value of the properties property.
   *
   * @param value allowed object is {@link JAXBElement }{@code <}{@link ArrayOfCode }{@code >}
   */
  public void setProperties(JAXBElement<ArrayOfCode> value) {
    this.properties = value;
  }

  /**
   * Gets the value of the specialities property.
   *
   * @return possible object is {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
   */
  public JAXBElement<ArrayOfstring> getSpecialities() {
    return specialities;
  }

  /**
   * Sets the value of the specialities property.
   *
   * @param value allowed object is {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
   */
  public void setSpecialities(JAXBElement<ArrayOfstring> value) {
    this.specialities = value;
  }

  /**
   * Gets the value of the title property.
   *
   * @return possible object is {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getTitle() {
    return title;
  }

  /**
   * Sets the value of the title property.
   *
   * @param value allowed object is {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setTitle(JAXBElement<String> value) {
    this.title = value;
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
