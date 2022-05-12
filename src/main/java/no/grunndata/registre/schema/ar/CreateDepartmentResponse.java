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
 *         &lt;element name="CreateDepartmentResult" type="{http://register.nhn.no/CommunicationParty}Department" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"createDepartmentResult"})
@XmlRootElement(name = "CreateDepartmentResponse")
public class CreateDepartmentResponse {

  @XmlElementRef(
          name = "CreateDepartmentResult",
          namespace = "http://register.nhn.no/CommunicationParty",
          type = JAXBElement.class,
          required = false)
  protected JAXBElement<Department> createDepartmentResult;

  /**
   * Gets the value of the createDepartmentResult property.
   *
   * @return possible object is {@link JAXBElement }{@code <}{@link Department }{@code >}
   */
  public JAXBElement<Department> getCreateDepartmentResult() {
    return createDepartmentResult;
  }

  /**
   * Sets the value of the createDepartmentResult property.
   *
   * @param value allowed object is {@link JAXBElement }{@code <}{@link Department }{@code >}
   */
  public void setCreateDepartmentResult(JAXBElement<Department> value) {
    this.createDepartmentResult = value;
  }
}
