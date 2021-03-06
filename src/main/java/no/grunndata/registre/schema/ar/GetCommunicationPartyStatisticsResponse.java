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
 *         &lt;element name="GetCommunicationPartyStatisticsResult" type="{http://register.nhn.no/CommunicationParty}CommunicationPartyStatistics" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"getCommunicationPartyStatisticsResult"})
@XmlRootElement(name = "GetCommunicationPartyStatisticsResponse")
public class GetCommunicationPartyStatisticsResponse {

  @XmlElementRef(
          name = "GetCommunicationPartyStatisticsResult",
          namespace = "http://register.nhn.no/CommunicationParty",
          type = JAXBElement.class,
          required = false)
  protected JAXBElement<CommunicationPartyStatistics> getCommunicationPartyStatisticsResult;

  /**
   * Gets the value of the getCommunicationPartyStatisticsResult property.
   *
   * @return possible object is {@link JAXBElement }{@code <}{@link CommunicationPartyStatistics
   * }{@code >}
   */
  public JAXBElement<CommunicationPartyStatistics> getGetCommunicationPartyStatisticsResult() {
    return getCommunicationPartyStatisticsResult;
  }

  /**
   * Sets the value of the getCommunicationPartyStatisticsResult property.
   *
   * @param value allowed object is {@link JAXBElement }{@code <}{@link CommunicationPartyStatistics
   *              }{@code >}
   */
  public void setGetCommunicationPartyStatisticsResult(
          JAXBElement<CommunicationPartyStatistics> value) {
    this.getCommunicationPartyStatisticsResult = value;
  }
}
