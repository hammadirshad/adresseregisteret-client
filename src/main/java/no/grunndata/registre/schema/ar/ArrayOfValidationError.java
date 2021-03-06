package no.grunndata.registre.schema.ar;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

/**
 * Java class for ArrayOfValidationError complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ArrayOfValidationError">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ValidationError" type="{http://register.nhn.no/Common}ValidationError" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "ArrayOfValidationError",
        namespace = "http://register.nhn.no/Common",
        propOrder = {"validationError"})
public class ArrayOfValidationError {

  @XmlElement(name = "ValidationError", nillable = true)
  protected List<ValidationError> validationError;

  /**
   * Gets the value of the validationError property.
   *
   * <p>This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why
   * there is not a <CODE>set</CODE> method for the validationError property.
   *
   * <p>For example, to add a new item, do as follows:
   *
   * <pre>
   *    getValidationError().add(newItem);
   * </pre>
   *
   * <p>Objects of the following type(s) are allowed in the list {@link ValidationError }
   */
  public List<ValidationError> getValidationError() {
    if (validationError == null) {
      validationError = new ArrayList<ValidationError>();
    }
    return this.validationError;
  }
}
