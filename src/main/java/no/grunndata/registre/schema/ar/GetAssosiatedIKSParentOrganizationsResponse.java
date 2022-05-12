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
 *         &lt;element name="GetAssosiatedIKSParentOrganizationsResult" type="{http://register.nhn.no/CommunicationParty}ArrayOfOrganization" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"getAssosiatedIKSParentOrganizationsResult"})
@XmlRootElement(name = "GetAssosiatedIKSParentOrganizationsResponse")
public class GetAssosiatedIKSParentOrganizationsResponse {

  @XmlElementRef(
          name = "GetAssosiatedIKSParentOrganizationsResult",
          namespace = "http://register.nhn.no/CommunicationParty",
          type = JAXBElement.class,
          required = false)
  protected JAXBElement<ArrayOfOrganization> getAssosiatedIKSParentOrganizationsResult;

  /**
   * Gets the value of the getAssosiatedIKSParentOrganizationsResult property.
   *
   * @return possible object is {@link JAXBElement }{@code <}{@link ArrayOfOrganization }{@code >}
   */
  public JAXBElement<ArrayOfOrganization> getGetAssosiatedIKSParentOrganizationsResult() {
    return getAssosiatedIKSParentOrganizationsResult;
  }

  /**
   * Sets the value of the getAssosiatedIKSParentOrganizationsResult property.
   *
   * @param value allowed object is {@link JAXBElement }{@code <}{@link ArrayOfOrganization }{@code
   *              >}
   */
  public void setGetAssosiatedIKSParentOrganizationsResult(JAXBElement<ArrayOfOrganization> value) {
    this.getAssosiatedIKSParentOrganizationsResult = value;
  }
}
