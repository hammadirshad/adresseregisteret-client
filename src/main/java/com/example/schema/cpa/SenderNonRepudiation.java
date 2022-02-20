//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference
// Implementation, v2.2.4-2
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2013.08.09 at 10:45:26 AM EST
//

package com.example.schema.cpa;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

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
 *         &lt;element name="NonRepudiationProtocol" type="{http://www.oasis-open.org/committees/ebxml-cppa/schema/cpp-cpa-2_0.xsd}protocol.type"/>
 *         &lt;element ref="{http://www.oasis-open.org/committees/ebxml-cppa/schema/cpp-cpa-2_0.xsd}HashFunction"/>
 *         &lt;element ref="{http://www.oasis-open.org/committees/ebxml-cppa/schema/cpp-cpa-2_0.xsd}SignatureAlgorithm" maxOccurs="unbounded"/>
 *         &lt;element name="SigningCertificateRef" type="{http://www.oasis-open.org/committees/ebxml-cppa/schema/cpp-cpa-2_0.xsd}CertificateRef.type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {
                "nonRepudiationProtocol",
                "hashFunction",
                "signatureAlgorithm",
                "signingCertificateRef"
        })
@XmlRootElement(name = "SenderNonRepudiation")
public class SenderNonRepudiation {

  @XmlElement(name = "NonRepudiationProtocol", required = true)
  protected ProtocolType nonRepudiationProtocol;

  @XmlElement(name = "HashFunction", required = true)
  protected String hashFunction;

  @XmlElement(name = "SignatureAlgorithm", required = true)
  protected List<SignatureAlgorithm> signatureAlgorithm;

  @XmlElement(name = "SigningCertificateRef", required = true)
  protected CertificateRefType signingCertificateRef;

  /**
   * Gets the value of the nonRepudiationProtocol property.
   *
   * @return possible object is {@link ProtocolType }
   */
  public ProtocolType getNonRepudiationProtocol() {
    return nonRepudiationProtocol;
  }

  /**
   * Sets the value of the nonRepudiationProtocol property.
   *
   * @param value allowed object is {@link ProtocolType }
   */
  public void setNonRepudiationProtocol(ProtocolType value) {
    this.nonRepudiationProtocol = value;
  }

  /**
   * Gets the value of the hashFunction property.
   *
   * @return possible object is {@link String }
   */
  public String getHashFunction() {
    return hashFunction;
  }

  /**
   * Sets the value of the hashFunction property.
   *
   * @param value allowed object is {@link String }
   */
  public void setHashFunction(String value) {
    this.hashFunction = value;
  }

  /**
   * Gets the value of the signatureAlgorithm property.
   *
   * <p>This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why
   * there is not a <CODE>set</CODE> method for the signatureAlgorithm property.
   *
   * <p>For example, to add a new item, do as follows:
   *
   * <pre>
   *    getSignatureAlgorithm().add(newItem);
   * </pre>
   *
   * <p>Objects of the following type(s) are allowed in the list {@link SignatureAlgorithm }
   */
  public List<SignatureAlgorithm> getSignatureAlgorithm() {
    if (signatureAlgorithm == null) {
      signatureAlgorithm = new ArrayList<SignatureAlgorithm>();
    }
    return this.signatureAlgorithm;
  }

  /**
   * Gets the value of the signingCertificateRef property.
   *
   * @return possible object is {@link CertificateRefType }
   */
  public CertificateRefType getSigningCertificateRef() {
    return signingCertificateRef;
  }

  /**
   * Sets the value of the signingCertificateRef property.
   *
   * @param value allowed object is {@link CertificateRefType }
   */
  public void setSigningCertificateRef(CertificateRefType value) {
    this.signingCertificateRef = value;
  }
}
