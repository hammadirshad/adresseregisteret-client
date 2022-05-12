package no.grunndata.registre.schema.cppa;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

@XmlRegistry
public class ObjectFactory {

    private static final QName _CodeSimpleType_QNAME =
            new QName("http://register.nhn.no/Common", "SimpleType");
    private static final QName _CodeCodeText_QNAME =
            new QName("http://register.nhn.no/Common", "CodeText");
    private static final QName _CpaDetailsStatus_QNAME =
            new QName("http://schemas.nhn.no/reg/CollaborationProtocolProfile", "Status");
    private static final QName
            _GetCpaForCommunicationPartiesXmlResponseGetCpaForCommunicationPartiesXmlResult_QNAME =
            new QName(
                    "http://schemas.nhn.no/reg/CollaborationProtocolProfile",
                    "GetCpaForCommunicationPartiesXmlResult");
    private static final QName
            _GetCppXmlForCommunicationPartyResponseGetCppXmlForCommunicationPartyResult_QNAME =
            new QName(
                    "http://schemas.nhn.no/reg/CollaborationProtocolProfile",
                    "GetCppXmlForCommunicationPartyResult");
    private static final QName _CodeCodeValue_QNAME =
            new QName("http://register.nhn.no/Common", "CodeValue");
    private static final QName _CpaXmlDetailsCollaborationProtocolAgreementXml_QNAME =
            new QName(
                    "http://schemas.nhn.no/reg/CollaborationProtocolProfile",
                    "CollaborationProtocolAgreementXml");
    private static final QName _GetCpaXmlResponseGetCpaXmlResult_QNAME =
            new QName("http://schemas.nhn.no/reg/CollaborationProtocolProfile", "GetCpaXmlResult");

    /**
     * Create an instance of {@link CpaXmlDetails }
     */
    public CpaXmlDetails createCpaXmlDetails() {
        return new CpaXmlDetails();
    }

    /**
     * Create an instance of {@link GetCpaForCommunicationPartiesXml }
     */
    public GetCpaForCommunicationPartiesXml createGetCpaForCommunicationPartiesXml() {
        return new GetCpaForCommunicationPartiesXml();
    }

    /**
     * Create an instance of {@link GetCpaForCommunicationPartiesXmlResponse }
     */
    public GetCpaForCommunicationPartiesXmlResponse createGetCpaForCommunicationPartiesXmlResponse() {
        return new GetCpaForCommunicationPartiesXmlResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CpaXmlDetails }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.nhn.no/reg/CollaborationProtocolProfile",
            name = "GetCpaForCommunicationPartiesXmlResult",
            scope = GetCpaForCommunicationPartiesXmlResponse.class)
    public JAXBElement<CpaXmlDetails>
    createGetCpaForCommunicationPartiesXmlResponseGetCpaForCommunicationPartiesXmlResult(
            CpaXmlDetails value) {
        return new JAXBElement<CpaXmlDetails>(
                _GetCpaForCommunicationPartiesXmlResponseGetCpaForCommunicationPartiesXmlResult_QNAME,
                CpaXmlDetails.class,
                GetCpaForCommunicationPartiesXmlResponse.class,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Code }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.nhn.no/reg/CollaborationProtocolProfile",
            name = "Status",
            scope = CpaXmlDetails.class)
    public JAXBElement<Code> createCpaXmlDetailsStatus(Code value) {
        return new JAXBElement<Code>(_CpaDetailsStatus_QNAME, Code.class, CpaXmlDetails.class, value);
    }

    /**
     * Create an instance of {@link GetCppXmlForCommunicationParty }
     */
    public GetCppXmlForCommunicationParty createGetCppXmlForCommunicationParty() {
        return new GetCppXmlForCommunicationParty();
    }

    /**
     * Create an instance of {@link GetCppXmlForCommunicationPartyResponse }
     */
    public GetCppXmlForCommunicationPartyResponse createGetCppXmlForCommunicationPartyResponse() {
        return new GetCppXmlForCommunicationPartyResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.nhn.no/reg/CollaborationProtocolProfile",
            name = "GetCppXmlForCommunicationPartyResult",
            scope = GetCppXmlForCommunicationPartyResponse.class)
    public JAXBElement<String>
    createGetCppXmlForCommunicationPartyResponseGetCppXmlForCommunicationPartyResult(
            String value) {
        return new JAXBElement<String>(
                _GetCppXmlForCommunicationPartyResponseGetCppXmlForCommunicationPartyResult_QNAME,
                String.class,
                GetCppXmlForCommunicationPartyResponse.class,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://register.nhn.no/Common",
            name = "SimpleType",
            scope = Code.class)
    public JAXBElement<String> createCodeSimpleType(String value) {
        return new JAXBElement<String>(_CodeSimpleType_QNAME, String.class, Code.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://register.nhn.no/Common",
            name = "CodeText",
            scope = Code.class)
    public JAXBElement<String> createCodeCodeText(String value) {
        return new JAXBElement<String>(_CodeCodeText_QNAME, String.class, Code.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://register.nhn.no/Common",
            name = "CodeValue",
            scope = Code.class)
    public JAXBElement<String> createCodeCodeValue(String value) {
        return new JAXBElement<String>(_CodeCodeValue_QNAME, String.class, Code.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.nhn.no/reg/CollaborationProtocolProfile",
            name = "CollaborationProtocolAgreementXml",
            scope = CpaXmlDetails.class)
    public JAXBElement<String> createCpaXmlDetailsCollaborationProtocolAgreementXml(String value) {
        return new JAXBElement<String>(
                _CpaXmlDetailsCollaborationProtocolAgreementXml_QNAME,
                String.class,
                CpaXmlDetails.class,
                value);
    }

    /**
     * Create an instance of {@link GetCpaXml }
     */
    public GetCpaXml createGetCpaXml() {
        return new GetCpaXml();
    }

    /**
     * Create an instance of {@link GetCpaXmlResponse }
     */
    public GetCpaXmlResponse createGetCpaXmlResponse() {
        return new GetCpaXmlResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CpaXmlDetails }{@code >}}
     */
    @XmlElementDecl(
            namespace = "http://schemas.nhn.no/reg/CollaborationProtocolProfile",
            name = "GetCpaXmlResult",
            scope = GetCpaXmlResponse.class)
    public JAXBElement<CpaXmlDetails> createGetCpaXmlResponseGetCpaXmlResult(CpaXmlDetails value) {
        return new JAXBElement<CpaXmlDetails>(
                _GetCpaXmlResponseGetCpaXmlResult_QNAME,
                CpaXmlDetails.class,
                GetCpaXmlResponse.class,
                value);
    }
}
