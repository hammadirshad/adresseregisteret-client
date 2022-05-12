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
 *         &lt;element name="organizaitonHerId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="herIdsForAssociatedIKS" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"organizaitonHerId", "herIdsForAssociatedIKS"})
@XmlRootElement(name = "UpdateOrganizationIKSAssociations")
public class UpdateOrganizationIKSAssociations {

  protected Integer organizaitonHerId;

  @XmlElementRef(
          name = "herIdsForAssociatedIKS",
          namespace = "http://register.nhn.no/CommunicationParty",
          type = JAXBElement.class,
          required = false)
  protected JAXBElement<ArrayOfint> herIdsForAssociatedIKS;

  /**
   * Gets the value of the organizaitonHerId property.
   *
   * @return possible object is {@link Integer }
   */
  public Integer getOrganizaitonHerId() {
    return organizaitonHerId;
  }

  /**
   * Sets the value of the organizaitonHerId property.
   *
   * @param value allowed object is {@link Integer }
   */
  public void setOrganizaitonHerId(Integer value) {
    this.organizaitonHerId = value;
  }

  /**
   * Gets the value of the herIdsForAssociatedIKS property.
   *
   * @return possible object is {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
   */
  public JAXBElement<ArrayOfint> getHerIdsForAssociatedIKS() {
    return herIdsForAssociatedIKS;
  }

  /**
   * Sets the value of the herIdsForAssociatedIKS property.
   *
   * @param value allowed object is {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
   */
  public void setHerIdsForAssociatedIKS(JAXBElement<ArrayOfint> value) {
    this.herIdsForAssociatedIKS = value;
  }
}
