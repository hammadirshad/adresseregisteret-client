package no.grunndata.registre.schema.ar;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

/**
 * Java class for Service complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Service">
 *   &lt;complexContent>
 *     &lt;extension base="{http://register.nhn.no/CommunicationParty}CommunicationParty">
 *       &lt;sequence>
 *         &lt;element name="Code" type="{http://register.nhn.no/Common}Code" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LocationDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Properties" type="{http://register.nhn.no/Common}ArrayOfCode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "Service",
        propOrder = {"code", "description", "locationDescription", "properties"})
public class Service extends CommunicationParty {

    @XmlElementRef(
            name = "Code",
            namespace = "http://register.nhn.no/CommunicationParty",
            type = JAXBElement.class,
            required = false)
    protected JAXBElement<Code> code;

    @XmlElementRef(
            name = "Description",
            namespace = "http://register.nhn.no/CommunicationParty",
            type = JAXBElement.class,
            required = false)
    protected JAXBElement<String> description;

    @XmlElementRef(
            name = "LocationDescription",
            namespace = "http://register.nhn.no/CommunicationParty",
            type = JAXBElement.class,
            required = false)
    protected JAXBElement<String> locationDescription;

    @XmlElementRef(
            name = "Properties",
            namespace = "http://register.nhn.no/CommunicationParty",
            type = JAXBElement.class,
            required = false)
    protected JAXBElement<ArrayOfCode> properties;

    /**
     * Gets the value of the code property.
     *
     * @return possible object is {@link JAXBElement }{@code <}{@link Code }{@code >}
     */
    public JAXBElement<Code> getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     *
     * @param value allowed object is {@link JAXBElement }{@code <}{@link Code }{@code >}
     */
    public void setCode(JAXBElement<Code> value) {
        this.code = value;
    }

    /**
     * Gets the value of the description property.
     *
     * @return possible object is {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     *
     * @param value allowed object is {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setDescription(JAXBElement<String> value) {
        this.description = value;
    }

    /**
     * Gets the value of the locationDescription property.
     *
     * @return possible object is {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getLocationDescription() {
        return locationDescription;
    }

    /**
     * Sets the value of the locationDescription property.
     *
     * @param value allowed object is {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setLocationDescription(JAXBElement<String> value) {
        this.locationDescription = value;
    }

    /**
     * Gets the value of the properties property.
     *
     * @return possible object is {@link JAXBElement }{@code <}{@link ArrayOfCode }{@code >}
     */
    public JAXBElement<ArrayOfCode> getProperties() {
        return properties;
    }

    /**
     * Sets the value of the properties property.
     *
     * @param value allowed object is {@link JAXBElement }{@code <}{@link ArrayOfCode }{@code >}
     */
    public void setProperties(JAXBElement<ArrayOfCode> value) {
        this.properties = value;
    }
}
