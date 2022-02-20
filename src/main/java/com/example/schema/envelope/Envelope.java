package com.example.schema.envelope;

import javax.xml.bind.annotation.*;

/**
 * Java class for Envelope complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Envelope">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://schemas.xmlsoap.org/soap/envelope/}Header" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.xmlsoap.org/soap/envelope/}Body"/>
 *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"header", "body"})
@XmlRootElement(name = "Envelope")
public class Envelope {

  @XmlElement(name = "Header")
  protected Header header;

  @XmlElement(name = "Body", required = true)
  protected Body body;

  /**
   * Gets the value of the header property.
   *
   * @return possible object is {@link Header }
   */
  public Header getHeader() {
    return header;
  }

  /**
   * Sets the value of the header property.
   *
   * @param value allowed object is {@link Header }
   */
  public void setHeader(Header value) {
    this.header = value;
  }

  /**
   * Gets the value of the body property.
   *
   * @return possible object is {@link Body }
   */
  public Body getBody() {
    return body;
  }

  /**
   * Sets the value of the body property.
   *
   * @param value allowed object is {@link Body }
   */
  public void setBody(Body value) {
    this.body = value;
  }
}
