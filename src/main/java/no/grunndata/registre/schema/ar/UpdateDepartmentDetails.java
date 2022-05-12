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
 *         &lt;element name="org" type="{http://register.nhn.no/CommunicationParty}DepartmentUpdate" minOccurs="0"/>
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
@XmlRootElement(name = "UpdateDepartmentDetails")
public class UpdateDepartmentDetails {

  @XmlElementRef(
          name = "org",
          namespace = "http://register.nhn.no/CommunicationParty",
          type = JAXBElement.class,
          required = false)
  protected JAXBElement<DepartmentUpdate> org;

  /**
   * Gets the value of the org property.
   *
   * @return possible object is {@link JAXBElement }{@code <}{@link DepartmentUpdate }{@code >}
   */
  public JAXBElement<DepartmentUpdate> getOrg() {
    return org;
  }

  /**
   * Sets the value of the org property.
   *
   * @param value allowed object is {@link JAXBElement }{@code <}{@link DepartmentUpdate }{@code >}
   */
  public void setOrg(JAXBElement<DepartmentUpdate> value) {
    this.org = value;
  }
}
