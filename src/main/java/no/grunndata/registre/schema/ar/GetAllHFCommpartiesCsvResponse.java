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
 *         &lt;element name="GetAllHFCommpartiesCsvResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"getAllHFCommpartiesCsvResult"})
@XmlRootElement(name = "GetAllHFCommpartiesCsvResponse")
public class GetAllHFCommpartiesCsvResponse {

  @XmlElementRef(
          name = "GetAllHFCommpartiesCsvResult",
          namespace = "http://register.nhn.no/CommunicationParty",
          type = JAXBElement.class,
          required = false)
  protected JAXBElement<String> getAllHFCommpartiesCsvResult;

  /**
   * Gets the value of the getAllHFCommpartiesCsvResult property.
   *
   * @return possible object is {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getGetAllHFCommpartiesCsvResult() {
    return getAllHFCommpartiesCsvResult;
  }

  /**
   * Sets the value of the getAllHFCommpartiesCsvResult property.
   *
   * @param value allowed object is {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setGetAllHFCommpartiesCsvResult(JAXBElement<String> value) {
    this.getAllHFCommpartiesCsvResult = value;
  }
}
