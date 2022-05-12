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
 *         &lt;element name="SearchByIdResult" type="{http://register.nhn.no/CommunicationParty}ArrayOfCommunicationParty" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"searchByIdResult"})
@XmlRootElement(name = "SearchByIdResponse")
public class SearchByIdResponse {

  @XmlElementRef(
          name = "SearchByIdResult",
          namespace = "http://register.nhn.no/CommunicationParty",
          type = JAXBElement.class,
          required = false)
  protected JAXBElement<ArrayOfCommunicationParty> searchByIdResult;

  /**
   * Gets the value of the searchByIdResult property.
   *
   * @return possible object is {@link JAXBElement }{@code <}{@link ArrayOfCommunicationParty
   * }{@code >}
   */
  public JAXBElement<ArrayOfCommunicationParty> getSearchByIdResult() {
    return searchByIdResult;
  }

  /**
   * Sets the value of the searchByIdResult property.
   *
   * @param value allowed object is {@link JAXBElement }{@code <}{@link ArrayOfCommunicationParty
   *              }{@code >}
   */
  public void setSearchByIdResult(JAXBElement<ArrayOfCommunicationParty> value) {
    this.searchByIdResult = value;
  }
}
