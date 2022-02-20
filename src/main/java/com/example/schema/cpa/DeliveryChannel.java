//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference
// Implementation, v2.2.4-2
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2013.08.09 at 10:45:26 AM EST
//

package com.example.schema.cpa;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

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
 *         &lt;element ref="{http://www.oasis-open.org/committees/ebxml-cppa/schema/cpp-cpa-2_0.xsd}MessagingCharacteristics"/>
 *       &lt;/sequence>
 *       &lt;attribute name="channelId" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="transportId" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       &lt;attribute name="docExchangeId" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"messagingCharacteristics"})
@XmlRootElement(name = "DeliveryChannel")
public class DeliveryChannel {

  @XmlElement(name = "MessagingCharacteristics", required = true)
  protected MessagingCharacteristics messagingCharacteristics;

  @XmlAttribute(
          name = "channelId",
          namespace = "http://www.oasis-open.org/committees/ebxml-cppa/schema/cpp-cpa-2_0.xsd",
          required = true)
  @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
  @XmlID
  @XmlSchemaType(name = "ID")
  protected String channelId;

  @XmlAttribute(
          name = "transportId",
          namespace = "http://www.oasis-open.org/committees/ebxml-cppa/schema/cpp-cpa-2_0.xsd",
          required = true)
  @XmlIDREF
  @XmlSchemaType(name = "IDREF")
  protected Object transportId;

  @XmlAttribute(
          name = "docExchangeId",
          namespace = "http://www.oasis-open.org/committees/ebxml-cppa/schema/cpp-cpa-2_0.xsd",
          required = true)
  @XmlIDREF
  @XmlSchemaType(name = "IDREF")
  protected Object docExchangeId;

  /**
   * Gets the value of the messagingCharacteristics property.
   *
   * @return possible object is {@link MessagingCharacteristics }
   */
  public MessagingCharacteristics getMessagingCharacteristics() {
    return messagingCharacteristics;
  }

  /**
   * Sets the value of the messagingCharacteristics property.
   *
   * @param value allowed object is {@link MessagingCharacteristics }
   */
  public void setMessagingCharacteristics(MessagingCharacteristics value) {
    this.messagingCharacteristics = value;
  }

  /**
   * Gets the value of the channelId property.
   *
   * @return possible object is {@link String }
   */
  public String getChannelId() {
    return channelId;
  }

  /**
   * Sets the value of the channelId property.
   *
   * @param value allowed object is {@link String }
   */
  public void setChannelId(String value) {
    this.channelId = value;
  }

  /**
   * Gets the value of the transportId property.
   *
   * @return possible object is {@link Object }
   */
  public Object getTransportId() {
    return transportId;
  }

  /**
   * Sets the value of the transportId property.
   *
   * @param value allowed object is {@link Object }
   */
  public void setTransportId(Object value) {
    this.transportId = value;
  }

  /**
   * Gets the value of the transport.
   *
   * @return possible object is {@link Transport }
   */
  public Transport getTransport() {
    return (Transport) transportId;
  }

  /**
   * Gets the value of the docExchangeId property.
   *
   * @return possible object is {@link Object }
   */
  public Object getDocExchangeId() {
    return docExchangeId;
  }

  /**
   * Sets the value of the docExchangeId property.
   *
   * @param value allowed object is {@link Object }
   */
  public void setDocExchangeId(Object value) {
    this.docExchangeId = value;
  }

  /**
   * Gets the value of the docExchange property.
   *
   * @return possible object is {@link DocExchange }
   */
  public DocExchange getDocExchange() {
    return (DocExchange) docExchangeId;
  }
}