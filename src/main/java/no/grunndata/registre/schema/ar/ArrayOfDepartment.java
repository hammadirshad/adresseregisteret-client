package no.grunndata.registre.schema.ar;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

/**
 * Java class for ArrayOfDepartment complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ArrayOfDepartment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Department" type="{http://register.nhn.no/CommunicationParty}Department" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "ArrayOfDepartment",
        propOrder = {"department"})
public class ArrayOfDepartment {

  @XmlElement(name = "Department", nillable = true)
  protected List<Department> department;

  /**
   * Gets the value of the department property.
   *
   * <p>This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why
   * there is not a <CODE>set</CODE> method for the department property.
   *
   * <p>For example, to add a new item, do as follows:
   *
   * <pre>
   *    getDepartment().add(newItem);
   * </pre>
   *
   * <p>Objects of the following type(s) are allowed in the list {@link Department }
   */
  public List<Department> getDepartment() {
    if (department == null) {
      department = new ArrayList<Department>();
    }
    return this.department;
  }
}
