package no.grunndata.registre.schema.ar;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;

/**
 * Java class for ServiceUpdate complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ServiceUpdate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ElectronicAddresses" type="{http://register.nhn.no/Common}ArrayOfElectronicAddress" minOccurs="0"/>
 *         &lt;element name="HerId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="LocationDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PhysicalAddresses" type="{http://register.nhn.no/Common}ArrayOfPhysicalAddress" minOccurs="0"/>
 *         &lt;element name="Properties" type="{http://register.nhn.no/Common}ArrayOfCode" minOccurs="0"/>
 *         &lt;element name="Valid" type="{http://register.nhn.no/Common}Period" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "ServiceUpdate",
        propOrder = {
                "description",
                "electronicAddresses",
                "herId",
                "locationDescription",
                "physicalAddresses",
                "properties",
                "valid"
        })
public class ServiceUpdate {

  @XmlElementRef(
          name = "Description",
          namespace = "http://register.nhn.no/CommunicationParty",
          type = JAXBElement.class,
          required = false)
  protected JAXBElement<String> description;

  @XmlElementRef(
          name = "ElectronicAddresses",
          namespace = "http://register.nhn.no/CommunicationParty",
          type = JAXBElement.class,
          required = false)
  protected JAXBElement<ArrayOfElectronicAddress> electronicAddresses;

  @XmlElement(name = "HerId")
  protected Integer herId;

  @XmlElementRef(
          name = "LocationDescription",
          namespace = "http://register.nhn.no/CommunicationParty",
          type = JAXBElement.class,
          required = false)
  protected JAXBElement<String> locationDescription;

  @XmlElementRef(
          name = "PhysicalAddresses",
          namespace = "http://register.nhn.no/CommunicationParty",
          type = JAXBElement.class,
          required = false)
  protected JAXBElement<ArrayOfPhysicalAddress> physicalAddresses;

  @XmlElementRef(
          name = "Properties",
          namespace = "http://register.nhn.no/CommunicationParty",
          type = JAXBElement.class,
          required = false)
  protected JAXBElement<ArrayOfCode> properties;

  @XmlElementRef(
          name = "Valid",
          namespace = "http://register.nhn.no/CommunicationParty",
          type = JAXBElement.class,
          required = false)
  protected JAXBElement<Period> valid;

  /**
   * Gets the value of the description property.
   *
   * @return possible object is {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getDescription() {
    return description;
  }

  /**
   * Sets the value of the description property.
   *
   * @param value allowed object is {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setDescription(JAXBElement<String> value) {
    this.description = value;
  }

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
   * Gets the value of the herId property.
   *
   * @return possible object is {@link Integer }
   */
  public Integer getHerId() {
    return herId;
  }

  /**
   * Sets the value of the herId property.
   *
   * @param value allowed object is {@link Integer }
   */
  public void setHerId(Integer value) {
    this.herId = value;
  }

  /**
   * Gets the value of the locationDescription property.
   *
   * @return possible object is {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getLocationDescription() {
    return locationDescription;
  }

  /**
   * Sets the value of the locationDescription property.
   *
   * @param value allowed object is {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setLocationDescription(JAXBElement<String> value) {
    this.locationDescription = value;
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
