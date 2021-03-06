package no.grunndata.registre.schema.ar;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

/**
 * Java class for ArrayOfCode complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ArrayOfCode">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Code" type="{http://register.nhn.no/Common}Code" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "ArrayOfCode",
        namespace = "http://register.nhn.no/Common",
        propOrder = {"code"})
public class ArrayOfCode {

  @XmlElement(name = "Code", nillable = true)
  protected List<Code> code;

  /**
   * Gets the value of the code property.
   *
   * <p>This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why
   * there is not a <CODE>set</CODE> method for the code property.
   *
   * <p>For example, to add a new item, do as follows:
   *
   * <pre>
   *    getCode().add(newItem);
   * </pre>
   *
   * <p>Objects of the following type(s) are allowed in the list {@link Code }
   */
  public List<Code> getCode() {
    if (code == null) {
      code = new ArrayList<Code>();
    }
    return this.code;
  }
}
