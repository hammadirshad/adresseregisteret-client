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
 *         &lt;element name="org" type="{http://register.nhn.no/CommunicationParty}DepartmentCreate" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"org"})
@XmlRootElement(name = "CreateDepartment")
public class CreateDepartment {

  @XmlElementRef(
          name = "org",
          namespace = "http://register.nhn.no/CommunicationParty",
          type = JAXBElement.class,
          required = false)
  protected JAXBElement<DepartmentCreate> org;

  /**
   * Gets the value of the org property.
   *
   * @return possible object is {@link JAXBElement }{@code <}{@link DepartmentCreate }{@code >}
   */
  public JAXBElement<DepartmentCreate> getOrg() {
    return org;
  }

  /**
   * Sets the value of the org property.
   *
   * @param value allowed object is {@link JAXBElement }{@code <}{@link DepartmentCreate }{@code >}
   */
  public void setOrg(JAXBElement<DepartmentCreate> value) {
    this.org = value;
  }
}
