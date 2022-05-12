package no.grunndata.registre.schema.cppa;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

/**
 * Java class for CpaXmlDetails complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="CpaXmlDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CollaborationProtocolAgreementXml" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://register.nhn.no/Common}Code" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "CpaXmlDetails",
        propOrder = {"collaborationProtocolAgreementXml", "status"})
public class CpaXmlDetails {

    @XmlElementRef(
            name = "CollaborationProtocolAgreementXml",
            namespace = "http://schemas.nhn.no/reg/CollaborationProtocolProfile",
            type = JAXBElement.class,
            required = false)
    protected JAXBElement<String> collaborationProtocolAgreementXml;

    @XmlElementRef(
            name = "Status",
            namespace = "http://schemas.nhn.no/reg/CollaborationProtocolProfile",
            type = JAXBElement.class,
            required = false)
    protected JAXBElement<Code> status;

    /**
     * Gets the value of the collaborationProtocolAgreementXml property.
     *
     * @return possible object is {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getCollaborationProtocolAgreementXml() {
        return collaborationProtocolAgreementXml;
    }

    /**
     * Sets the value of the collaborationProtocolAgreementXml property.
     *
     * @param value allowed object is {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setCollaborationProtocolAgreementXml(JAXBElement<String> value) {
        this.collaborationProtocolAgreementXml = value;
    }

    /**
     * Gets the value of the status property.
     *
     * @return possible object is {@link JAXBElement }{@code <}{@link Code }{@code >}
     */
    public JAXBElement<Code> getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     *
     * @param value allowed object is {@link JAXBElement }{@code <}{@link Code }{@code >}
     */
    public void setStatus(JAXBElement<Code> value) {
        this.status = value;
    }
}
