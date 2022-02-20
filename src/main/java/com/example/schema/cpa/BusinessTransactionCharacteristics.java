//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference
// Implementation, v2.2.4-2
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2013.08.09 at 10:45:26 AM EST
//

package com.example.schema.cpa;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.Duration;
import java.math.BigInteger;

/**
 * Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="isNonRepudiationRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="isNonRepudiationReceiptRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="isConfidential" type="{http://www.oasis-open.org/committees/ebxml-cppa/schema/cpp-cpa-2_0.xsd}persistenceLevel.type" />
 *       &lt;attribute name="isAuthenticated" type="{http://www.oasis-open.org/committees/ebxml-cppa/schema/cpp-cpa-2_0.xsd}persistenceLevel.type" />
 *       &lt;attribute name="isTamperProof" type="{http://www.oasis-open.org/committees/ebxml-cppa/schema/cpp-cpa-2_0.xsd}persistenceLevel.type" />
 *       &lt;attribute name="isAuthorizationRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="isIntelligibleCheckRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="timeToAcknowledgeReceipt" type="{http://www.w3.org/2001/XMLSchema}duration" />
 *       &lt;attribute name="timeToAcknowledgeAcceptance" type="{http://www.w3.org/2001/XMLSchema}duration" />
 *       &lt;attribute name="timeToPerform" type="{http://www.w3.org/2001/XMLSchema}duration" />
 *       &lt;attribute name="retryCount" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "BusinessTransactionCharacteristics")
public class BusinessTransactionCharacteristics {

  @XmlAttribute(
          name = "isNonRepudiationRequired",
          namespace = "http://www.oasis-open.org/committees/ebxml-cppa/schema/cpp-cpa-2_0.xsd")
  protected Boolean isNonRepudiationRequired;

  @XmlAttribute(
          name = "isNonRepudiationReceiptRequired",
          namespace = "http://www.oasis-open.org/committees/ebxml-cppa/schema/cpp-cpa-2_0.xsd")
  protected Boolean isNonRepudiationReceiptRequired;

  @XmlAttribute(
          name = "isConfidential",
          namespace = "http://www.oasis-open.org/committees/ebxml-cppa/schema/cpp-cpa-2_0.xsd")
  protected PersistenceLevelType isConfidential;

  @XmlAttribute(
          name = "isAuthenticated",
          namespace = "http://www.oasis-open.org/committees/ebxml-cppa/schema/cpp-cpa-2_0.xsd")
  protected PersistenceLevelType isAuthenticated;

  @XmlAttribute(
          name = "isTamperProof",
          namespace = "http://www.oasis-open.org/committees/ebxml-cppa/schema/cpp-cpa-2_0.xsd")
  protected PersistenceLevelType isTamperProof;

  @XmlAttribute(
          name = "isAuthorizationRequired",
          namespace = "http://www.oasis-open.org/committees/ebxml-cppa/schema/cpp-cpa-2_0.xsd")
  protected Boolean isAuthorizationRequired;

  @XmlAttribute(
          name = "isIntelligibleCheckRequired",
          namespace = "http://www.oasis-open.org/committees/ebxml-cppa/schema/cpp-cpa-2_0.xsd")
  protected Boolean isIntelligibleCheckRequired;

  @XmlAttribute(
          name = "timeToAcknowledgeReceipt",
          namespace = "http://www.oasis-open.org/committees/ebxml-cppa/schema/cpp-cpa-2_0.xsd")
  protected Duration timeToAcknowledgeReceipt;

  @XmlAttribute(
          name = "timeToAcknowledgeAcceptance",
          namespace = "http://www.oasis-open.org/committees/ebxml-cppa/schema/cpp-cpa-2_0.xsd")
  protected Duration timeToAcknowledgeAcceptance;

  @XmlAttribute(
          name = "timeToPerform",
          namespace = "http://www.oasis-open.org/committees/ebxml-cppa/schema/cpp-cpa-2_0.xsd")
  protected Duration timeToPerform;

  @XmlAttribute(
          name = "retryCount",
          namespace = "http://www.oasis-open.org/committees/ebxml-cppa/schema/cpp-cpa-2_0.xsd")
  protected BigInteger retryCount;

  /**
   * Gets the value of the isNonRepudiationRequired property.
   *
   * @return possible object is {@link Boolean }
   */
  public Boolean isIsNonRepudiationRequired() {
    return isNonRepudiationRequired;
  }

  /**
   * Sets the value of the isNonRepudiationRequired property.
   *
   * @param value allowed object is {@link Boolean }
   */
  public void setIsNonRepudiationRequired(Boolean value) {
    this.isNonRepudiationRequired = value;
  }

  /**
   * Gets the value of the isNonRepudiationReceiptRequired property.
   *
   * @return possible object is {@link Boolean }
   */
  public Boolean isIsNonRepudiationReceiptRequired() {
    return isNonRepudiationReceiptRequired;
  }

  /**
   * Sets the value of the isNonRepudiationReceiptRequired property.
   *
   * @param value allowed object is {@link Boolean }
   */
  public void setIsNonRepudiationReceiptRequired(Boolean value) {
    this.isNonRepudiationReceiptRequired = value;
  }

  /**
   * Gets the value of the isConfidential property.
   *
   * @return possible object is {@link PersistenceLevelType }
   */
  public PersistenceLevelType getIsConfidential() {
    return isConfidential;
  }

  /**
   * Sets the value of the isConfidential property.
   *
   * @param value allowed object is {@link PersistenceLevelType }
   */
  public void setIsConfidential(PersistenceLevelType value) {
    this.isConfidential = value;
  }

  /**
   * Gets the value of the isAuthenticated property.
   *
   * @return possible object is {@link PersistenceLevelType }
   */
  public PersistenceLevelType getIsAuthenticated() {
    return isAuthenticated;
  }

  /**
   * Sets the value of the isAuthenticated property.
   *
   * @param value allowed object is {@link PersistenceLevelType }
   */
  public void setIsAuthenticated(PersistenceLevelType value) {
    this.isAuthenticated = value;
  }

  /**
   * Gets the value of the isTamperProof property.
   *
   * @return possible object is {@link PersistenceLevelType }
   */
  public PersistenceLevelType getIsTamperProof() {
    return isTamperProof;
  }

  /**
   * Sets the value of the isTamperProof property.
   *
   * @param value allowed object is {@link PersistenceLevelType }
   */
  public void setIsTamperProof(PersistenceLevelType value) {
    this.isTamperProof = value;
  }

  /**
   * Gets the value of the isAuthorizationRequired property.
   *
   * @return possible object is {@link Boolean }
   */
  public Boolean isIsAuthorizationRequired() {
    return isAuthorizationRequired;
  }

  /**
   * Sets the value of the isAuthorizationRequired property.
   *
   * @param value allowed object is {@link Boolean }
   */
  public void setIsAuthorizationRequired(Boolean value) {
    this.isAuthorizationRequired = value;
  }

  /**
   * Gets the value of the isIntelligibleCheckRequired property.
   *
   * @return possible object is {@link Boolean }
   */
  public Boolean isIsIntelligibleCheckRequired() {
    return isIntelligibleCheckRequired;
  }

  /**
   * Sets the value of the isIntelligibleCheckRequired property.
   *
   * @param value allowed object is {@link Boolean }
   */
  public void setIsIntelligibleCheckRequired(Boolean value) {
    this.isIntelligibleCheckRequired = value;
  }

  /**
   * Gets the value of the timeToAcknowledgeReceipt property.
   *
   * @return possible object is {@link Duration }
   */
  public Duration getTimeToAcknowledgeReceipt() {
    return timeToAcknowledgeReceipt;
  }

  /**
   * Sets the value of the timeToAcknowledgeReceipt property.
   *
   * @param value allowed object is {@link Duration }
   */
  public void setTimeToAcknowledgeReceipt(Duration value) {
    this.timeToAcknowledgeReceipt = value;
  }

  /**
   * Gets the value of the timeToAcknowledgeAcceptance property.
   *
   * @return possible object is {@link Duration }
   */
  public Duration getTimeToAcknowledgeAcceptance() {
    return timeToAcknowledgeAcceptance;
  }

  /**
   * Sets the value of the timeToAcknowledgeAcceptance property.
   *
   * @param value allowed object is {@link Duration }
   */
  public void setTimeToAcknowledgeAcceptance(Duration value) {
    this.timeToAcknowledgeAcceptance = value;
  }

  /**
   * Gets the value of the timeToPerform property.
   *
   * @return possible object is {@link Duration }
   */
  public Duration getTimeToPerform() {
    return timeToPerform;
  }

  /**
   * Sets the value of the timeToPerform property.
   *
   * @param value allowed object is {@link Duration }
   */
  public void setTimeToPerform(Duration value) {
    this.timeToPerform = value;
  }

  /**
   * Gets the value of the retryCount property.
   *
   * @return possible object is {@link BigInteger }
   */
  public BigInteger getRetryCount() {
    return retryCount;
  }

  /**
   * Sets the value of the retryCount property.
   *
   * @param value allowed object is {@link BigInteger }
   */
  public void setRetryCount(BigInteger value) {
    this.retryCount = value;
  }
}
