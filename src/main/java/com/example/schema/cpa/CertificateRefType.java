//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference
// Implementation, v2.2.4-2
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2013.08.09 at 10:45:26 AM EST
//

package com.example.schema.cpa;

import javax.xml.bind.annotation.*;

/**
 * Java class for CertificateRef.type complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="CertificateRef.type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="certId" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CertificateRef.type")
public class CertificateRefType {

  @XmlAttribute(
          name = "certId",
          namespace = "http://www.oasis-open.org/committees/ebxml-cppa/schema/cpp-cpa-2_0.xsd",
          required = true)
  @XmlIDREF
  @XmlSchemaType(name = "IDREF")
  protected Object certId;

  /**
   * Gets the value of the certId property.
   *
   * @return possible object is {@link Object }
   */
  public Object getCertId() {
    return certId;
  }

  /**
   * Sets the value of the certId property.
   *
   * @param value allowed object is {@link Object }
   */
  public void setCertId(Object value) {
    this.certId = value;
  }
}
