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
 *         &lt;element name="SearchResult" type="{http://register.nhn.no/CommunicationParty}SearchResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"searchResult"})
@XmlRootElement(name = "SearchResponse")
public class SearchResponse {

  @XmlElementRef(
          name = "SearchResult",
          namespace = "http://register.nhn.no/CommunicationParty",
          type = JAXBElement.class,
          required = false)
  protected JAXBElement<SearchResult> searchResult;

  /**
   * Gets the value of the searchResult property.
   *
   * @return possible object is {@link JAXBElement }{@code <}{@link SearchResult }{@code >}
   */
  public JAXBElement<SearchResult> getSearchResult() {
    return searchResult;
  }

  /**
   * Sets the value of the searchResult property.
   *
   * @param value allowed object is {@link JAXBElement }{@code <}{@link SearchResult }{@code >}
   */
  public void setSearchResult(JAXBElement<SearchResult> value) {
    this.searchResult = value;
  }
}
