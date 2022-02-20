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
 *         &lt;element name="ThisPartyActionBinding" type="{http://www.oasis-open.org/committees/ebxml-cppa/schema/cpp-cpa-2_0.xsd}ActionBinding.type"/>
 *         &lt;element name="OtherPartyActionBinding" type="{http://www.w3.org/2001/XMLSchema}IDREF" minOccurs="0"/>
 *         &lt;element ref="{http://www.oasis-open.org/committees/ebxml-cppa/schema/cpp-cpa-2_0.xsd}CanSend" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"thisPartyActionBinding", "otherPartyActionBinding", "canSend"})
@XmlRootElement(name = "CanReceive")
public class CanReceive {

  @XmlElement(name = "ThisPartyActionBinding", required = true)
  protected ActionBindingType thisPartyActionBinding;

  @XmlElement(name = "OtherPartyActionBinding")
  @XmlIDREF
  @XmlSchemaType(name = "IDREF")
  protected Object otherPartyActionBinding;

  @XmlElement(name = "CanSend")
  protected List<CanSend> canSend;

  /**
   * Gets the value of the thisPartyActionBinding property.
   *
   * @return possible object is {@link ActionBindingType }
   */
  public ActionBindingType getThisPartyActionBinding() {
    return thisPartyActionBinding;
  }

  /**
   * Sets the value of the thisPartyActionBinding property.
   *
   * @param value allowed object is {@link ActionBindingType }
   */
  public void setThisPartyActionBinding(ActionBindingType value) {
    this.thisPartyActionBinding = value;
  }

  /**
   * Gets the value of the otherPartyActionBinding property.
   *
   * @return possible object is {@link Object }
   */
  public ActionBindingType getOtherPartyActionBinding() {
    return (ActionBindingType) otherPartyActionBinding;
  }

  /**
   * Sets the value of the otherPartyActionBinding property.
   *
   * @param value allowed object is {@link Object }
   */
  public void setOtherPartyActionBinding(Object value) {
    this.otherPartyActionBinding = value;
  }

  /**
   * Gets the value of the canSend property.
   *
   * <p>This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why
   * there is not a <CODE>set</CODE> method for the canSend property.
   *
   * <p>For example, to add a new item, do as follows:
   *
   * <pre>
   *    getCanSend().add(newItem);
   * </pre>
   *
   * <p>Objects of the following type(s) are allowed in the list {@link CanSend }
   */
  public List<CanSend> getCanSend() {
    if (canSend == null) {
      canSend = new ArrayList<CanSend>();
    }
    return this.canSend;
  }
}