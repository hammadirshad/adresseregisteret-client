package no.grunndata.registre.schema.envelope;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

@XmlRegistry
public class ObjectFactory {
    private static final QName _Fault_QNAME =
            new QName("http://schemas.xmlsoap.org/soap/envelope/", "Fault");
    private static final QName _Header_QNAME =
            new QName("http://schemas.xmlsoap.org/soap/envelope/", "Header");

    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Header }
     */
    public Header createHeader() {
        return new Header();
    }

    /**
     * Create an instance of {@link Fault }
     */
    public Fault createFault() {
        return new Fault();
    }

    /**
     * Create an instance of {@link Envelope }
     */
    public Envelope createEnvelope() {
        return new Envelope();
    }

    /**
     * Create an instance of {@link Body }
     */
    public Body createBody() {
        return new Body();
    }

    /**
     * Create an instance of {@link Detail }
     */
    public Detail createDetail() {
        return new Detail();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Fault }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/soap/envelope/", name = "Fault")
    public JAXBElement<Fault> createFault(Fault value) {
        return new JAXBElement<Fault>(_Fault_QNAME, Fault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Header }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/soap/envelope/", name = "Header")
    public JAXBElement<Header> createHeader(Header value) {
        return new JAXBElement<Header>(_Header_QNAME, Header.class, null, value);
    }
}
