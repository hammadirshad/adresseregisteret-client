package com.example.schema.ar;

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
 *         &lt;element name="GetOrganizationUpdateStatisticsResult" type="{http://register.nhn.no/CommunicationParty}OrganizationUpdateStatistics" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"getOrganizationUpdateStatisticsResult"})
@XmlRootElement(name = "GetOrganizationUpdateStatisticsResponse")
public class GetOrganizationUpdateStatisticsResponse {

  @XmlElementRef(
          name = "GetOrganizationUpdateStatisticsResult",
          namespace = "http://register.nhn.no/CommunicationParty",
          type = JAXBElement.class,
          required = false)
  protected JAXBElement<OrganizationUpdateStatistics> getOrganizationUpdateStatisticsResult;

  /**
   * Gets the value of the getOrganizationUpdateStatisticsResult property.
   *
   * @return possible object is {@link JAXBElement }{@code <}{@link OrganizationUpdateStatistics
   * }{@code >}
   */
  public JAXBElement<OrganizationUpdateStatistics> getGetOrganizationUpdateStatisticsResult() {
    return getOrganizationUpdateStatisticsResult;
  }

  /**
   * Sets the value of the getOrganizationUpdateStatisticsResult property.
   *
   * @param value allowed object is {@link JAXBElement }{@code <}{@link OrganizationUpdateStatistics
   *              }{@code >}
   */
  public void setGetOrganizationUpdateStatisticsResult(
          JAXBElement<OrganizationUpdateStatistics> value) {
    this.getOrganizationUpdateStatisticsResult = value;
  }
}
