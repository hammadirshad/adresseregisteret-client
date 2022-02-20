package com.example.schema.ar;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

/**
 * This object contains factory methods for each Java content interface and Java element interface
 * generated in the com.example.ar.model package.
 *
 * <p>An ObjectFactory allows you to programatically construct new instances of the Java
 * representation for XML content. The Java representation of XML content can consist of schema
 * derived interfaces and classes representing the binding of schema type definitions, element
 * declarations and model groups. Factory methods for each of these are provided in this class.
 */
@XmlRegistry
public class ObjectFactory {

  private static final QName _CertificateDetails_QNAME =
          new QName("http://register.nhn.no/CertificateDetails", "CertificateDetails");
  private static final QName _GenericFault_QNAME =
          new QName("http://register.nhn.no/Common", "GenericFault");
  private static final QName _DepartmentCreate_QNAME =
          new QName("http://register.nhn.no/CommunicationParty", "DepartmentCreate");
  private static final QName _ArrayOfCode_QNAME =
          new QName("http://register.nhn.no/Common", "ArrayOfCode");
  private static final QName _ArrayOfService_QNAME =
          new QName("http://register.nhn.no/CommunicationParty", "ArrayOfService");
  private static final QName _ArrayOfEntityLogEntry_QNAME =
          new QName("http://register.nhn.no/Common", "ArrayOfEntityLogEntry");
  private static final QName _Duration_QNAME =
          new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
  private static final QName _ValidationError_QNAME =
          new QName("http://register.nhn.no/Common", "ValidationError");
  private static final QName _OrganizationUpdate_QNAME =
          new QName("http://register.nhn.no/CommunicationParty", "OrganizationUpdate");
  private static final QName _ArrayOfEntityLogEntryData_QNAME =
          new QName("http://register.nhn.no/Common", "ArrayOfEntityLogEntryData");
  private static final QName _Organization_QNAME =
          new QName("http://register.nhn.no/CommunicationParty", "Organization");
  private static final QName _ArrayOfstring_QNAME =
          new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfstring");
  private static final QName _Long_QNAME =
          new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
  private static final QName _DateTime_QNAME =
          new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
  private static final QName _ArrayOfPhysicalAddress_QNAME =
          new QName("http://register.nhn.no/Common", "ArrayOfPhysicalAddress");
  private static final QName _String_QNAME =
          new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
  private static final QName _ArrayOfCertificateDetails_QNAME =
          new QName("http://register.nhn.no/CertificateDetails", "ArrayOfCertificateDetails");
  private static final QName _ArrayOfSpecialCompetence_QNAME =
          new QName("http://register.nhn.no/HPR", "ArrayOfSpecialCompetence");
  private static final QName _ArrayOfOrganization_QNAME =
          new QName("http://register.nhn.no/CommunicationParty", "ArrayOfOrganization");
  private static final QName _ArrayOfAuthorization_QNAME =
          new QName("http://register.nhn.no/HPR", "ArrayOfAuthorization");
  private static final QName _SearchResultFacetEntry_QNAME =
          new QName("http://register.nhn.no/CommunicationParty", "SearchResultFacetEntry");
  private static final QName _UnsignedInt_QNAME =
          new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
  private static final QName _Char_QNAME =
          new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
  private static final QName _ArrayOfSearchFacet_QNAME =
          new QName("http://register.nhn.no/CommunicationParty", "ArrayOfSearchFacet");
  private static final QName _Short_QNAME =
          new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
  private static final QName _ArrayOfDepartment_QNAME =
          new QName("http://register.nhn.no/CommunicationParty", "ArrayOfDepartment");
  private static final QName _CommunicationPartyStatistics_QNAME =
          new QName("http://register.nhn.no/CommunicationParty", "CommunicationPartyStatistics");
  private static final QName _ArrayOfKeyValuePairOfstringstring_QNAME =
          new QName(
                  "http://schemas.datacontract.org/2004/07/System.Collections.Generic",
                  "ArrayOfKeyValuePairOfstringstring");
  private static final QName _KeyValuePairOfintArrayOfCodeUO9UWExd_QNAME =
          new QName(
                  "http://schemas.datacontract.org/2004/07/System.Collections.Generic",
                  "KeyValuePairOfintArrayOfCodeUO9uWExd");
  private static final QName _CommunicationParty_QNAME =
          new QName("http://register.nhn.no/CommunicationParty", "CommunicationParty");
  private static final QName _Boolean_QNAME =
          new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
  private static final QName _ArrayOfUpdateStatistic_QNAME =
          new QName("http://register.nhn.no/CommunicationParty", "ArrayOfUpdateStatistic");
  private static final QName _ServiceCreate_QNAME =
          new QName("http://register.nhn.no/CommunicationParty", "ServiceCreate");
  private static final QName _Person_QNAME = new QName("http://register.nhn.no/HPR", "Person");
  private static final QName _CommunicationPartySearch_QNAME =
          new QName("http://register.nhn.no/CommunicationParty", "CommunicationPartySearch");
  private static final QName _Speciality_QNAME =
          new QName("http://register.nhn.no/HPR", "Speciality");
  private static final QName _Int_QNAME =
          new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
  private static final QName _BusinessTypeStatistics_QNAME =
          new QName("http://register.nhn.no/CommunicationParty", "BusinessTypeStatistics");
  private static final QName _SearchResult_QNAME =
          new QName("http://register.nhn.no/CommunicationParty", "SearchResult");
  private static final QName _Period_QNAME = new QName("http://register.nhn.no/Common", "Period");
  private static final QName _CitizenId_QNAME =
          new QName("http://register.nhn.no/Common", "CitizenId");
  private static final QName _ArrayOfint_QNAME =
          new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfint");
  private static final QName _PhysicalAddress_QNAME =
          new QName("http://register.nhn.no/Common", "PhysicalAddress");
  private static final QName _KeyValuePairOfstringstring_QNAME =
          new QName(
                  "http://schemas.datacontract.org/2004/07/System.Collections.Generic",
                  "KeyValuePairOfstringstring");
  private static final QName _Service_QNAME =
          new QName("http://register.nhn.no/CommunicationParty", "Service");
  private static final QName _QName_QNAME =
          new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
  private static final QName _Code_QNAME = new QName("http://register.nhn.no/Common", "Code");
  private static final QName _Authorization_QNAME =
          new QName("http://register.nhn.no/HPR", "Authorization");
  private static final QName _Department_QNAME =
          new QName("http://register.nhn.no/CommunicationParty", "Department");
  private static final QName _UnsignedLong_QNAME =
          new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
  private static final QName _SearchFacet_QNAME =
          new QName("http://register.nhn.no/CommunicationParty", "SearchFacet");
  private static final QName _UnsignedByte_QNAME =
          new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
  private static final QName _UnsignedShort_QNAME =
          new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
  private static final QName _ArrayOfBusinessTypeStatistics_QNAME =
          new QName("http://register.nhn.no/CommunicationParty", "ArrayOfBusinessTypeStatistics");
  private static final QName _OrganizationPersonCreate_QNAME =
          new QName("http://register.nhn.no/CommunicationParty", "OrganizationPersonCreate");
  private static final QName _ArrayOfOrganizationPerson_QNAME =
          new QName("http://register.nhn.no/CommunicationParty", "ArrayOfOrganizationPerson");
  private static final QName _ArrayOfValidationError_QNAME =
          new QName("http://register.nhn.no/Common", "ArrayOfValidationError");
  private static final QName _CitizenIdType_QNAME =
          new QName("http://register.nhn.no/Common", "CitizenIdType");
  private static final QName _ServiceUpdate_QNAME =
          new QName("http://register.nhn.no/CommunicationParty", "ServiceUpdate");
  private static final QName _EntityLogEntry_QNAME =
          new QName("http://register.nhn.no/Common", "EntityLogEntry");
  private static final QName _OrganizationPerson_QNAME =
          new QName("http://register.nhn.no/CommunicationParty", "OrganizationPerson");
  private static final QName _Float_QNAME =
          new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
  private static final QName _ArrayOfElectronicAddress_QNAME =
          new QName("http://register.nhn.no/Common", "ArrayOfElectronicAddress");
  private static final QName _AnyType_QNAME =
          new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
  private static final QName _CommunicationPartyType_QNAME =
          new QName("http://register.nhn.no/CommunicationParty", "CommunicationPartyType");
  private static final QName _ValidationFault_QNAME =
          new QName("http://register.nhn.no/Common", "ValidationFault");
  private static final QName _Guid_QNAME =
          new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
  private static final QName _Decimal_QNAME =
          new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
  private static final QName _ArrayOfCommunicationParty_QNAME =
          new QName("http://register.nhn.no/CommunicationParty", "ArrayOfCommunicationParty");
  private static final QName _ArrayOfKeyValuePairOfintArrayOfCodeUO9UWExd_QNAME =
          new QName(
                  "http://schemas.datacontract.org/2004/07/System.Collections.Generic",
                  "ArrayOfKeyValuePairOfintArrayOfCodeUO9uWExd");
  private static final QName _UpdateStatistic_QNAME =
          new QName("http://register.nhn.no/CommunicationParty", "UpdateStatistic");
  private static final QName _HPRInformation_QNAME =
          new QName("http://register.nhn.no/HPR", "HPRInformation");
  private static final QName _Requisition_QNAME =
          new QName("http://register.nhn.no/HPR", "Requisition");
  private static final QName _Base64Binary_QNAME =
          new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
  private static final QName _DepartmentUpdate_QNAME =
          new QName("http://register.nhn.no/CommunicationParty", "DepartmentUpdate");
  private static final QName _OrganizationUpdateStatistics_QNAME =
          new QName("http://register.nhn.no/CommunicationParty", "OrganizationUpdateStatistics");
  private static final QName _EntityLogEntryData_QNAME =
          new QName("http://register.nhn.no/Common", "EntityLogEntryData");
  private static final QName _OrganizationPersonUpdate_QNAME =
          new QName("http://register.nhn.no/CommunicationParty", "OrganizationPersonUpdate");
  private static final QName _AnyURI_QNAME =
          new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
  private static final QName _ArrayOfSearchResultFacetEntry_QNAME =
          new QName("http://register.nhn.no/CommunicationParty", "ArrayOfSearchResultFacetEntry");
  private static final QName _OrganizationCreate_QNAME =
          new QName("http://register.nhn.no/CommunicationParty", "OrganizationCreate");
  private static final QName _ElectronicAddress_QNAME =
          new QName("http://register.nhn.no/Common", "ElectronicAddress");
  private static final QName _Byte_QNAME =
          new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
  private static final QName _Double_QNAME =
          new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
  private static final QName _ArrayOfSpeciality_QNAME =
          new QName("http://register.nhn.no/HPR", "ArrayOfSpeciality");
  private static final QName _SpecialCompetence_QNAME =
          new QName("http://register.nhn.no/HPR", "SpecialCompetence");
  private static final QName _UpdateDepartmentDetailsOrg_QNAME =
          new QName("http://register.nhn.no/CommunicationParty", "org");
  private static final QName _SearchCertificatesForValidatingSignatureOu_QNAME =
          new QName("http://register.nhn.no/CommunicationParty", "ou");
  private static final QName _SearchCertificatesForValidatingSignatureSn_QNAME =
          new QName("http://register.nhn.no/CommunicationParty", "sn");
  private static final QName _SearchCertificatesForValidatingSignatureCn_QNAME =
          new QName("http://register.nhn.no/CommunicationParty", "cn");
  private static final QName _UpdateOrganizationIKSAssociationsHerIdsForAssociatedIKS_QNAME =
          new QName("http://register.nhn.no/CommunicationParty", "herIdsForAssociatedIKS");
  private static final QName _SearchByIdResponseSearchByIdResult_QNAME =
          new QName("http://register.nhn.no/CommunicationParty", "SearchByIdResult");
  private static final QName _ServiceDescription_QNAME =
          new QName("http://register.nhn.no/CommunicationParty", "Description");
  private static final QName _ServiceLocationDescription_QNAME =
          new QName("http://register.nhn.no/CommunicationParty", "LocationDescription");
  private static final QName _ServiceProperties_QNAME =
          new QName("http://register.nhn.no/CommunicationParty", "Properties");
  private static final QName _ServiceCode_QNAME =
          new QName("http://register.nhn.no/CommunicationParty", "Code");
  private static final QName
          _GetCertificateForValidatingSignatureLdapResponseGetCertificateForValidatingSignatureLdapResult_QNAME =
          new QName(
                  "http://register.nhn.no/CommunicationParty",
                  "GetCertificateForValidatingSignatureLdapResult");
  private static final QName _OrganizationUpdateElectronicAddresses_QNAME =
          new QName("http://register.nhn.no/CommunicationParty", "ElectronicAddresses");
  private static final QName _OrganizationUpdateValid_QNAME =
          new QName("http://register.nhn.no/CommunicationParty", "Valid");
  private static final QName _OrganizationUpdateBusinessType_QNAME =
          new QName("http://register.nhn.no/CommunicationParty", "BusinessType");
  private static final QName _OrganizationUpdateDisplayName_QNAME =
          new QName("http://register.nhn.no/CommunicationParty", "DisplayName");
  private static final QName _OrganizationUpdatePhysicalAddresses_QNAME =
          new QName("http://register.nhn.no/CommunicationParty", "PhysicalAddresses");
  private static final QName _SearchResultFacets_QNAME =
          new QName("http://register.nhn.no/CommunicationParty", "Facets");
  private static final QName _SearchResultResults_QNAME =
          new QName("http://register.nhn.no/CommunicationParty", "Results");
  private static final QName _ValidationErrorPropertyName_QNAME =
          new QName("http://register.nhn.no/Common", "PropertyName");
  private static final QName _ValidationErrorMessage_QNAME =
          new QName("http://register.nhn.no/Common", "Message");
  private static final QName _ValidationErrorDisplayName_QNAME =
          new QName("http://register.nhn.no/Common", "DisplayName");
  private static final QName _ValidationErrorValue_QNAME =
          new QName("http://register.nhn.no/Common", "Value");
  private static final QName _CreateServiceT_QNAME =
          new QName("http://register.nhn.no/CommunicationParty", "t");
  private static final QName _CreateOrganizationResponseCreateOrganizationResult_QNAME =
          new QName("http://register.nhn.no/CommunicationParty", "CreateOrganizationResult");
  private static final QName _SearchResultFacetEntryType_QNAME =
          new QName("http://register.nhn.no/CommunicationParty", "Type");
  private static final QName _SearchResultFacetEntryText_QNAME =
          new QName("http://register.nhn.no/CommunicationParty", "Text");
  private static final QName _SearchResultFacetEntryValue_QNAME =
          new QName("http://register.nhn.no/CommunicationParty", "Value");
  private static final QName
          _GetOrganizationsHavingCodeResponseGetOrganizationsHavingCodeResult_QNAME =
          new QName(
                  "http://register.nhn.no/CommunicationParty", "GetOrganizationsHavingCodeResult");
  private static final QName _CreateOrganizationPersonResponseCreateOrganizationPersonResult_QNAME =
          new QName("http://register.nhn.no/CommunicationParty", "CreateOrganizationPersonResult");
  private static final QName
          _GetCommunicationPartyDetailsResponseGetCommunicationPartyDetailsResult_QNAME =
          new QName(
                  "http://register.nhn.no/CommunicationParty", "GetCommunicationPartyDetailsResult");
  private static final QName
          _GetCertificateForValidatingSignatureResponseGetCertificateForValidatingSignatureResult_QNAME =
          new QName(
                  "http://register.nhn.no/CommunicationParty",
                  "GetCertificateForValidatingSignatureResult");
  private static final QName _AddCustomAttributeResponseAddCustomAttributeResult_QNAME =
          new QName("http://register.nhn.no/CommunicationParty", "AddCustomAttributeResult");
  private static final QName _GetCustomAttributesResponseGetCustomAttributesResult_QNAME =
          new QName("http://register.nhn.no/CommunicationParty", "GetCustomAttributesResult");
  private static final QName _SearchSearch_QNAME =
          new QName("http://register.nhn.no/CommunicationParty", "search");
  private static final QName _GetGPCommunicationPartySsn_QNAME =
          new QName("http://register.nhn.no/CommunicationParty", "ssn");
  private static final QName _CreateServiceResponseCreateServiceResult_QNAME =
          new QName("http://register.nhn.no/CommunicationParty", "CreateServiceResult");
  private static final QName
          _GetCertificateForValidatingSignatureByOrganizationNumberResponseGetCertificateForValidatingSignatureByOrganizationNumberResult_QNAME =
          new QName(
                  "http://register.nhn.no/CommunicationParty",
                  "GetCertificateForValidatingSignatureByOrganizationNumberResult");
  private static final QName _CommunicationPartySearchSearchConstraints_QNAME =
          new QName("http://register.nhn.no/CommunicationParty", "SearchConstraints");
  private static final QName _DepartmentIndustryCodes_QNAME =
          new QName("http://register.nhn.no/CommunicationParty", "IndustryCodes");
  private static final QName _DepartmentPeople_QNAME =
          new QName("http://register.nhn.no/CommunicationParty", "People");
  private static final QName _GetAllHFCommpartiesCsvResponseGetAllHFCommpartiesCsvResult_QNAME =
          new QName("http://register.nhn.no/CommunicationParty", "GetAllHFCommpartiesCsvResult");
  private static final QName _GetCertificateForValidatingSignatureLdapLdapUrl_QNAME =
          new QName("http://register.nhn.no/CommunicationParty", "ldapUrl");
  private static final QName _CreateOrganizationPersonP_QNAME =
          new QName("http://register.nhn.no/CommunicationParty", "p");
  private static final QName _GetServiceDetailsResponseGetServiceDetailsResult_QNAME =
          new QName("http://register.nhn.no/CommunicationParty", "GetServiceDetailsResult");
  private static final QName
          _GetCertificateDetailsForEncryptionResponseGetCertificateDetailsForEncryptionResult_QNAME =
          new QName(
                  "http://register.nhn.no/CommunicationParty",
                  "GetCertificateDetailsForEncryptionResult");
  private static final QName _OrganizationPersonCreateHprNumber_QNAME =
          new QName("http://register.nhn.no/CommunicationParty", "HprNumber");
  private static final QName _OrganizationPersonCreateSpecialities_QNAME =
          new QName("http://register.nhn.no/CommunicationParty", "Specialities");
  private static final QName _OrganizationPersonCreateTitle_QNAME =
          new QName("http://register.nhn.no/CommunicationParty", "Title");
  private static final QName _OrganizationPersonCreateProfessions_QNAME =
          new QName("http://register.nhn.no/CommunicationParty", "Professions");
  private static final QName _GetGPCommunicationPartyResponseGetGPCommunicationPartyResult_QNAME =
          new QName("http://register.nhn.no/CommunicationParty", "GetGPCommunicationPartyResult");
  private static final QName
          _GetOrganizationUpdateStatisticsResponseGetOrganizationUpdateStatisticsResult_QNAME =
          new QName(
                  "http://register.nhn.no/CommunicationParty", "GetOrganizationUpdateStatisticsResult");
  private static final QName
          _GetAssosiatedIKSChildOrganizationsResponseGetAssosiatedIKSChildOrganizationsResult_QNAME =
          new QName(
                  "http://register.nhn.no/CommunicationParty",
                  "GetAssosiatedIKSChildOrganizationsResult");
  private static final QName _SetCommunicationPartyValidPeriod_QNAME =
          new QName("http://register.nhn.no/CommunicationParty", "period");
  private static final QName _GenericFaultErrorCode_QNAME =
          new QName("http://register.nhn.no/Common", "ErrorCode");
  private static final QName _GetOrganizationDetailsResponseGetOrganizationDetailsResult_QNAME =
          new QName("http://register.nhn.no/CommunicationParty", "GetOrganizationDetailsResult");
  private static final QName _GetCertificateResponseGetCertificateResult_QNAME =
          new QName("http://register.nhn.no/CommunicationParty", "GetCertificateResult");
  private static final QName _OrganizationPersonDepartments_QNAME =
          new QName("http://register.nhn.no/CommunicationParty", "Departments");
  private static final QName _OrganizationPersonOrganizations_QNAME =
          new QName("http://register.nhn.no/CommunicationParty", "Organizations");
  private static final QName _OrganizationPersonPerson_QNAME =
          new QName("http://register.nhn.no/CommunicationParty", "Person");
  private static final QName _SpecialCompetenceType_QNAME =
          new QName("http://register.nhn.no/HPR", "Type");
  private static final QName _SpecialCompetenceValid_QNAME =
          new QName("http://register.nhn.no/HPR", "Valid");
  private static final QName _ValidationFaultErrors_QNAME =
          new QName("http://register.nhn.no/Common", "Errors");
  private static final QName _OrganizationUpdateStatisticsStatistics_QNAME =
          new QName("http://register.nhn.no/CommunicationParty", "Statistics");
  private static final QName _CodeSimpleType_QNAME =
          new QName("http://register.nhn.no/Common", "SimpleType");
  private static final QName _CodeCodeText_QNAME =
          new QName("http://register.nhn.no/Common", "CodeText");
  private static final QName _CodeCodeValue_QNAME =
          new QName("http://register.nhn.no/Common", "CodeValue");
  private static final QName
          _GetCommunicationPartyStatisticsResponseGetCommunicationPartyStatisticsResult_QNAME =
          new QName(
                  "http://register.nhn.no/CommunicationParty", "GetCommunicationPartyStatisticsResult");
  private static final QName _GetDepartmentDetailsResponseGetDepartmentDetailsResult_QNAME =
          new QName("http://register.nhn.no/CommunicationParty", "GetDepartmentDetailsResult");
  private static final QName _UpdateStatisticUsername_QNAME =
          new QName("http://register.nhn.no/CommunicationParty", "Username");
  private static final QName _UpdateStatisticIPAddress_QNAME =
          new QName("http://register.nhn.no/CommunicationParty", "IPAddress");
  private static final QName _CommunicationPartyMunicipality_QNAME =
          new QName("http://register.nhn.no/CommunicationParty", "Municipality");
  private static final QName _CommunicationPartyParentBusinessType_QNAME =
          new QName("http://register.nhn.no/CommunicationParty", "ParentBusinessType");
  private static final QName _CommunicationPartyName_QNAME =
          new QName("http://register.nhn.no/CommunicationParty", "Name");
  private static final QName _CommunicationPartyParentName_QNAME =
          new QName("http://register.nhn.no/CommunicationParty", "ParentName");
  private static final QName
          _GetCertificateForEncryptionResponseGetCertificateForEncryptionResult_QNAME =
          new QName(
                  "http://register.nhn.no/CommunicationParty", "GetCertificateForEncryptionResult");
  private static final QName _EnableTransportOnOrganizationTransportType_QNAME =
          new QName("http://register.nhn.no/CommunicationParty", "transportType");
  private static final QName
          _GetOrganizationPersonDetailsResponseGetOrganizationPersonDetailsResult_QNAME =
          new QName(
                  "http://register.nhn.no/CommunicationParty", "GetOrganizationPersonDetailsResult");
  private static final QName _CertificateDetailsLdapUrl_QNAME =
          new QName("http://register.nhn.no/CertificateDetails", "LdapUrl");
  private static final QName _CertificateDetailsCertificate_QNAME =
          new QName("http://register.nhn.no/CertificateDetails", "Certificate");
  private static final QName _SearchByIdId_QNAME =
          new QName("http://register.nhn.no/CommunicationParty", "id");
  private static final QName
          _GetCertificateForEncryptionByOrganizationNumberResponseGetCertificateForEncryptionByOrganizationNumberResult_QNAME =
          new QName(
                  "http://register.nhn.no/CommunicationParty",
                  "GetCertificateForEncryptionByOrganizationNumberResult");
  private static final QName _ServiceCreateServiceCode_QNAME =
          new QName("http://register.nhn.no/CommunicationParty", "ServiceCode");
  private static final QName _SearchFacetEntries_QNAME =
          new QName("http://register.nhn.no/CommunicationParty", "Entries");
  private static final QName _SearchFacetCodeValue_QNAME =
          new QName("http://register.nhn.no/CommunicationParty", "CodeValue");
  private static final QName
          _SearchCertificatesForEncryptionResponseSearchCertificatesForEncryptionResult_QNAME =
          new QName(
                  "http://register.nhn.no/CommunicationParty", "SearchCertificatesForEncryptionResult");
  private static final QName _HPRInformationAuthorizations_QNAME =
          new QName("http://register.nhn.no/HPR", "Authorizations");
  private static final QName _HPRInformationSpecialCompetences_QNAME =
          new QName("http://register.nhn.no/HPR", "SpecialCompetences");
  private static final QName _HPRInformationHPRNo_QNAME =
          new QName("http://register.nhn.no/HPR", "HPRNo");
  private static final QName _GetOrganizationsOwnedByResponseGetOrganizationsOwnedByResult_QNAME =
          new QName("http://register.nhn.no/CommunicationParty", "GetOrganizationsOwnedByResult");
  private static final QName _OrganizationServices_QNAME =
          new QName("http://register.nhn.no/CommunicationParty", "Services");
  private static final QName _PersonFirstName_QNAME =
          new QName("http://register.nhn.no/HPR", "FirstName");
  private static final QName _PersonSex_QNAME = new QName("http://register.nhn.no/HPR", "Sex");
  private static final QName _PersonCitizenId_QNAME =
          new QName("http://register.nhn.no/HPR", "CitizenId");
  private static final QName _PersonLastName_QNAME =
          new QName("http://register.nhn.no/HPR", "LastName");
  private static final QName _PersonMiddleName_QNAME =
          new QName("http://register.nhn.no/HPR", "MiddleName");
  private static final QName _CreateDepartmentResponseCreateDepartmentResult_QNAME =
          new QName("http://register.nhn.no/CommunicationParty", "CreateDepartmentResult");
  private static final QName _RemoveCustomAttributeCode_QNAME =
          new QName("http://register.nhn.no/CommunicationParty", "code");
  private static final QName _GetChangeLogResponseGetChangeLogResult_QNAME =
          new QName("http://register.nhn.no/CommunicationParty", "GetChangeLogResult");
  private static final QName
          _GetCertificateDetailsForValidatingSignatureResponseGetCertificateDetailsForValidatingSignatureResult_QNAME =
          new QName(
                  "http://register.nhn.no/CommunicationParty",
                  "GetCertificateDetailsForValidatingSignatureResult");
  private static final QName
          _SearchCertificatesForValidatingSignatureResponseSearchCertificatesForValidatingSignatureResult_QNAME =
          new QName(
                  "http://register.nhn.no/CommunicationParty",
                  "SearchCertificatesForValidatingSignatureResult");
  private static final QName _PingResponsePingResult_QNAME =
          new QName("http://register.nhn.no/CommunicationParty", "PingResult");
  private static final QName
          _GetAssosiatedIKSParentOrganizationsResponseGetAssosiatedIKSParentOrganizationsResult_QNAME =
          new QName(
                  "http://register.nhn.no/CommunicationParty",
                  "GetAssosiatedIKSParentOrganizationsResult");
  private static final QName _PhysicalAddressTypeCodeValue_QNAME =
          new QName("http://register.nhn.no/Common", "TypeCodeValue");
  private static final QName _PhysicalAddressStreetAddress_QNAME =
          new QName("http://register.nhn.no/Common", "StreetAddress");
  private static final QName _PhysicalAddressType_QNAME =
          new QName("http://register.nhn.no/Common", "Type");
  private static final QName _PhysicalAddressDescription_QNAME =
          new QName("http://register.nhn.no/Common", "Description");
  private static final QName _PhysicalAddressCountry_QNAME =
          new QName("http://register.nhn.no/Common", "Country");
  private static final QName _PhysicalAddressCity_QNAME =
          new QName("http://register.nhn.no/Common", "City");
  private static final QName _PhysicalAddressPostbox_QNAME =
          new QName("http://register.nhn.no/Common", "Postbox");
  private static final QName _CitizenIdSex_QNAME =
          new QName("http://register.nhn.no/Common", "Sex");
  private static final QName _CitizenIdId_QNAME = new QName("http://register.nhn.no/Common", "Id");
  private static final QName
          _GetCertificateForEncryptionLdapResponseGetCertificateForEncryptionLdapResult_QNAME =
          new QName(
                  "http://register.nhn.no/CommunicationParty", "GetCertificateForEncryptionLdapResult");
  private static final QName _AuthorizationProfession_QNAME =
          new QName("http://register.nhn.no/HPR", "Profession");
  private static final QName _AuthorizationSpecialities_QNAME =
          new QName("http://register.nhn.no/HPR", "Specialities");
  private static final QName _EntityLogEntryDataOldValue_QNAME =
          new QName("http://register.nhn.no/Common", "OldValue");
  private static final QName _EntityLogEntryDataNewValue_QNAME =
          new QName("http://register.nhn.no/Common", "NewValue");
  private static final QName _EntityLogEntryDataName_QNAME =
          new QName("http://register.nhn.no/Common", "Name");
  private static final QName _EntityLogEntryChanges_QNAME =
          new QName("http://register.nhn.no/Common", "Changes");
  private static final QName _EntityLogEntryByUser_QNAME =
          new QName("http://register.nhn.no/Common", "ByUser");
  private static final QName _GetCustomAttributesHerIds_QNAME =
          new QName("http://register.nhn.no/CommunicationParty", "herIds");
  private static final QName _ElectronicAddressAddress_QNAME =
          new QName("http://register.nhn.no/Common", "Address");

  /**
   * Create a new ObjectFactory that can be used to create new instances of schema derived classes
   * for package: com.example.ar.model
   */
  public ObjectFactory() {
  }

  /**
   * Create an instance of {@link ArrayOfstring }
   */
  public ArrayOfstring createArrayOfstring() {
    return new ArrayOfstring();
  }

  /**
   * Create an instance of {@link ArrayOfint }
   */
  public ArrayOfint createArrayOfint() {
    return new ArrayOfint();
  }

  /**
   * Create an instance of {@link CertificateDetails }
   */
  public CertificateDetails createCertificateDetails() {
    return new CertificateDetails();
  }

  /**
   * Create an instance of {@link ArrayOfCertificateDetails }
   */
  public ArrayOfCertificateDetails createArrayOfCertificateDetails() {
    return new ArrayOfCertificateDetails();
  }

  /**
   * Create an instance of {@link ArrayOfKeyValuePairOfintArrayOfCodeUO9UWExd }
   */
  public ArrayOfKeyValuePairOfintArrayOfCodeUO9UWExd
  createArrayOfKeyValuePairOfintArrayOfCodeUO9UWExd() {
    return new ArrayOfKeyValuePairOfintArrayOfCodeUO9UWExd();
  }

  /**
   * Create an instance of {@link KeyValuePairOfstringstring }
   */
  public KeyValuePairOfstringstring createKeyValuePairOfstringstring() {
    return new KeyValuePairOfstringstring();
  }

  /**
   * Create an instance of {@link ArrayOfKeyValuePairOfstringstring }
   */
  public ArrayOfKeyValuePairOfstringstring createArrayOfKeyValuePairOfstringstring() {
    return new ArrayOfKeyValuePairOfstringstring();
  }

  /**
   * Create an instance of {@link KeyValuePairOfintArrayOfCodeUO9UWExd }
   */
  public KeyValuePairOfintArrayOfCodeUO9UWExd createKeyValuePairOfintArrayOfCodeUO9UWExd() {
    return new KeyValuePairOfintArrayOfCodeUO9UWExd();
  }

  /**
   * Create an instance of {@link EntityLogEntry }
   */
  public EntityLogEntry createEntityLogEntry() {
    return new EntityLogEntry();
  }

  /**
   * Create an instance of {@link EntityLogEntryData }
   */
  public EntityLogEntryData createEntityLogEntryData() {
    return new EntityLogEntryData();
  }

  /**
   * Create an instance of {@link ArrayOfElectronicAddress }
   */
  public ArrayOfElectronicAddress createArrayOfElectronicAddress() {
    return new ArrayOfElectronicAddress();
  }

  /**
   * Create an instance of {@link ElectronicAddress }
   */
  public ElectronicAddress createElectronicAddress() {
    return new ElectronicAddress();
  }

  /**
   * Create an instance of {@link Period }
   */
  public Period createPeriod() {
    return new Period();
  }

  /**
   * Create an instance of {@link CitizenId }
   */
  public CitizenId createCitizenId() {
    return new CitizenId();
  }

  /**
   * Create an instance of {@link ArrayOfPhysicalAddress }
   */
  public ArrayOfPhysicalAddress createArrayOfPhysicalAddress() {
    return new ArrayOfPhysicalAddress();
  }

  /**
   * Create an instance of {@link PhysicalAddress }
   */
  public PhysicalAddress createPhysicalAddress() {
    return new PhysicalAddress();
  }

  /**
   * Create an instance of {@link Code }
   */
  public Code createCode() {
    return new Code();
  }

  /**
   * Create an instance of {@link GenericFault }
   */
  public GenericFault createGenericFault() {
    return new GenericFault();
  }

  /**
   * Create an instance of {@link ArrayOfCode }
   */
  public ArrayOfCode createArrayOfCode() {
    return new ArrayOfCode();
  }

  /**
   * Create an instance of {@link ValidationFault }
   */
  public ValidationFault createValidationFault() {
    return new ValidationFault();
  }

  /**
   * Create an instance of {@link ArrayOfEntityLogEntry }
   */
  public ArrayOfEntityLogEntry createArrayOfEntityLogEntry() {
    return new ArrayOfEntityLogEntry();
  }

  /**
   * Create an instance of {@link ArrayOfValidationError }
   */
  public ArrayOfValidationError createArrayOfValidationError() {
    return new ArrayOfValidationError();
  }

  /**
   * Create an instance of {@link ValidationError }
   */
  public ValidationError createValidationError() {
    return new ValidationError();
  }

  /**
   * Create an instance of {@link ArrayOfEntityLogEntryData }
   */
  public ArrayOfEntityLogEntryData createArrayOfEntityLogEntryData() {
    return new ArrayOfEntityLogEntryData();
  }

  /**
   * Create an instance of {@link ArrayOfAuthorization }
   */
  public ArrayOfAuthorization createArrayOfAuthorization() {
    return new ArrayOfAuthorization();
  }

  /**
   * Create an instance of {@link Authorization }
   */
  public Authorization createAuthorization() {
    return new Authorization();
  }

  /**
   * Create an instance of {@link Speciality }
   */
  public Speciality createSpeciality() {
    return new Speciality();
  }

  /**
   * Create an instance of {@link HPRInformation }
   */
  public HPRInformation createHPRInformation() {
    return new HPRInformation();
  }

  /**
   * Create an instance of {@link Person }
   */
  public Person createPerson() {
    return new Person();
  }

  /**
   * Create an instance of {@link Requisition }
   */
  public Requisition createRequisition() {
    return new Requisition();
  }

  /**
   * Create an instance of {@link ArrayOfSpeciality }
   */
  public ArrayOfSpeciality createArrayOfSpeciality() {
    return new ArrayOfSpeciality();
  }

  /**
   * Create an instance of {@link ArrayOfSpecialCompetence }
   */
  public ArrayOfSpecialCompetence createArrayOfSpecialCompetence() {
    return new ArrayOfSpecialCompetence();
  }

  /**
   * Create an instance of {@link SpecialCompetence }
   */
  public SpecialCompetence createSpecialCompetence() {
    return new SpecialCompetence();
  }

  /**
   * Create an instance of {@link GetCommunicationPartyStatistics }
   */
  public GetCommunicationPartyStatistics createGetCommunicationPartyStatistics() {
    return new GetCommunicationPartyStatistics();
  }

  /**
   * Create an instance of {@link GetCommunicationPartyDetails }
   */
  public GetCommunicationPartyDetails createGetCommunicationPartyDetails() {
    return new GetCommunicationPartyDetails();
  }

  /**
   * Create an instance of {@link GetCertificateDetailsForEncryption }
   */
  public GetCertificateDetailsForEncryption createGetCertificateDetailsForEncryption() {
    return new GetCertificateDetailsForEncryption();
  }

  /**
   * Create an instance of {@link GetCertificateForValidatingSignature }
   */
  public GetCertificateForValidatingSignature createGetCertificateForValidatingSignature() {
    return new GetCertificateForValidatingSignature();
  }

  /**
   * Create an instance of {@link PingResponse }
   */
  public PingResponse createPingResponse() {
    return new PingResponse();
  }

  /**
   * Create an instance of {@link GetOrganizationsHavingCodeResponse }
   */
  public GetOrganizationsHavingCodeResponse createGetOrganizationsHavingCodeResponse() {
    return new GetOrganizationsHavingCodeResponse();
  }

  /**
   * Create an instance of {@link ArrayOfOrganization }
   */
  public ArrayOfOrganization createArrayOfOrganization() {
    return new ArrayOfOrganization();
  }

  /**
   * Create an instance of {@link GetCertificateForEncryptionLdap }
   */
  public GetCertificateForEncryptionLdap createGetCertificateForEncryptionLdap() {
    return new GetCertificateForEncryptionLdap();
  }

  /**
   * Create an instance of {@link GetCustomAttributesResponse }
   */
  public GetCustomAttributesResponse createGetCustomAttributesResponse() {
    return new GetCustomAttributesResponse();
  }

  /**
   * Create an instance of {@link GetServiceDetails }
   */
  public GetServiceDetails createGetServiceDetails() {
    return new GetServiceDetails();
  }

  /**
   * Create an instance of {@link RemoveCustomAttributeResponse }
   */
  public RemoveCustomAttributeResponse createRemoveCustomAttributeResponse() {
    return new RemoveCustomAttributeResponse();
  }

  /**
   * Create an instance of {@link Department }
   */
  public Department createDepartment() {
    return new Department();
  }

  /**
   * Create an instance of {@link SearchFacet }
   */
  public SearchFacet createSearchFacet() {
    return new SearchFacet();
  }

  /**
   * Create an instance of {@link GetCertificateResponse }
   */
  public GetCertificateResponse createGetCertificateResponse() {
    return new GetCertificateResponse();
  }

  /**
   * Create an instance of {@link OrganizationPersonCreate }
   */
  public OrganizationPersonCreate createOrganizationPersonCreate() {
    return new OrganizationPersonCreate();
  }

  /**
   * Create an instance of {@link GetAssosiatedIKSParentOrganizations }
   */
  public GetAssosiatedIKSParentOrganizations createGetAssosiatedIKSParentOrganizations() {
    return new GetAssosiatedIKSParentOrganizations();
  }

  /**
   * Create an instance of {@link SearchCertificatesForEncryptionResponse }
   */
  public SearchCertificatesForEncryptionResponse createSearchCertificatesForEncryptionResponse() {
    return new SearchCertificatesForEncryptionResponse();
  }

  /**
   * Create an instance of {@link ServiceUpdate }
   */
  public ServiceUpdate createServiceUpdate() {
    return new ServiceUpdate();
  }

  /**
   * Create an instance of {@link OrganizationUpdateStatistics }
   */
  public OrganizationUpdateStatistics createOrganizationUpdateStatistics() {
    return new OrganizationUpdateStatistics();
  }

  /**
   * Create an instance of {@link OrganizationPersonUpdate }
   */
  public OrganizationPersonUpdate createOrganizationPersonUpdate() {
    return new OrganizationPersonUpdate();
  }

  /**
   * Create an instance of {@link GetAssosiatedIKSChildOrganizations }
   */
  public GetAssosiatedIKSChildOrganizations createGetAssosiatedIKSChildOrganizations() {
    return new GetAssosiatedIKSChildOrganizations();
  }

  /**
   * Create an instance of {@link GetOrganizationUpdateStatisticsResponse }
   */
  public GetOrganizationUpdateStatisticsResponse createGetOrganizationUpdateStatisticsResponse() {
    return new GetOrganizationUpdateStatisticsResponse();
  }

  /**
   * Create an instance of {@link GetDepartmentDetailsResponse }
   */
  public GetDepartmentDetailsResponse createGetDepartmentDetailsResponse() {
    return new GetDepartmentDetailsResponse();
  }

  /**
   * Create an instance of {@link GetChangeLog }
   */
  public GetChangeLog createGetChangeLog() {
    return new GetChangeLog();
  }

  /**
   * Create an instance of {@link GetAllHFCommpartiesCsv }
   */
  public GetAllHFCommpartiesCsv createGetAllHFCommpartiesCsv() {
    return new GetAllHFCommpartiesCsv();
  }

  /**
   * Create an instance of {@link CreateService }
   */
  public CreateService createCreateService() {
    return new CreateService();
  }

  /**
   * Create an instance of {@link ServiceCreate }
   */
  public ServiceCreate createServiceCreate() {
    return new ServiceCreate();
  }

  /**
   * Create an instance of {@link GetGPCommunicationParty }
   */
  public GetGPCommunicationParty createGetGPCommunicationParty() {
    return new GetGPCommunicationParty();
  }

  /**
   * Create an instance of {@link UpdateStatistic }
   */
  public UpdateStatistic createUpdateStatistic() {
    return new UpdateStatistic();
  }

  /**
   * Create an instance of {@link CreateOrganizationPersonResponse }
   */
  public CreateOrganizationPersonResponse createCreateOrganizationPersonResponse() {
    return new CreateOrganizationPersonResponse();
  }

  /**
   * Create an instance of {@link OrganizationPerson }
   */
  public OrganizationPerson createOrganizationPerson() {
    return new OrganizationPerson();
  }

  /**
   * Create an instance of {@link GetChangeLogResponse }
   */
  public GetChangeLogResponse createGetChangeLogResponse() {
    return new GetChangeLogResponse();
  }

  /**
   * Create an instance of {@link UpdateServiceDetailsResponse }
   */
  public UpdateServiceDetailsResponse createUpdateServiceDetailsResponse() {
    return new UpdateServiceDetailsResponse();
  }

  /**
   * Create an instance of {@link SetCommunicationPartyValidResponse }
   */
  public SetCommunicationPartyValidResponse createSetCommunicationPartyValidResponse() {
    return new SetCommunicationPartyValidResponse();
  }

  /**
   * Create an instance of {@link Organization }
   */
  public Organization createOrganization() {
    return new Organization();
  }

  /**
   * Create an instance of {@link AddCustomAttribute }
   */
  public AddCustomAttribute createAddCustomAttribute() {
    return new AddCustomAttribute();
  }

  /**
   * Create an instance of {@link GetCertificateForValidatingSignatureResponse }
   */
  public GetCertificateForValidatingSignatureResponse
  createGetCertificateForValidatingSignatureResponse() {
    return new GetCertificateForValidatingSignatureResponse();
  }

  /**
   * Create an instance of {@link CreateDepartmentResponse }
   */
  public CreateDepartmentResponse createCreateDepartmentResponse() {
    return new CreateDepartmentResponse();
  }

  /**
   * Create an instance of {@link UpdateOrganizationIKSAssociationsResponse }
   */
  public UpdateOrganizationIKSAssociationsResponse
  createUpdateOrganizationIKSAssociationsResponse() {
    return new UpdateOrganizationIKSAssociationsResponse();
  }

  /**
   * Create an instance of {@link GetOrganizationDetails }
   */
  public GetOrganizationDetails createGetOrganizationDetails() {
    return new GetOrganizationDetails();
  }

  /**
   * Create an instance of {@link GetCustomAttributes }
   */
  public GetCustomAttributes createGetCustomAttributes() {
    return new GetCustomAttributes();
  }

  /**
   * Create an instance of {@link GetCertificateForEncryption }
   */
  public GetCertificateForEncryption createGetCertificateForEncryption() {
    return new GetCertificateForEncryption();
  }

  /**
   * Create an instance of {@link BusinessTypeStatistics }
   */
  public BusinessTypeStatistics createBusinessTypeStatistics() {
    return new BusinessTypeStatistics();
  }

  /**
   * Create an instance of {@link GetDepartmentDetails }
   */
  public GetDepartmentDetails createGetDepartmentDetails() {
    return new GetDepartmentDetails();
  }

  /**
   * Create an instance of {@link GetServiceDetailsResponse }
   */
  public GetServiceDetailsResponse createGetServiceDetailsResponse() {
    return new GetServiceDetailsResponse();
  }

  /**
   * Create an instance of {@link Service }
   */
  public Service createService() {
    return new Service();
  }

  /**
   * Create an instance of {@link CreateOrganizationPerson }
   */
  public CreateOrganizationPerson createCreateOrganizationPerson() {
    return new CreateOrganizationPerson();
  }

  /**
   * Create an instance of {@link SearchResult }
   */
  public SearchResult createSearchResult() {
    return new SearchResult();
  }

  /**
   * Create an instance of {@link UpdateOrganizationPersonDetailsResponse }
   */
  public UpdateOrganizationPersonDetailsResponse createUpdateOrganizationPersonDetailsResponse() {
    return new UpdateOrganizationPersonDetailsResponse();
  }

  /**
   * Create an instance of {@link CreateOrganizationResponse }
   */
  public CreateOrganizationResponse createCreateOrganizationResponse() {
    return new CreateOrganizationResponse();
  }

  /**
   * Create an instance of {@link ArrayOfSearchFacet }
   */
  public ArrayOfSearchFacet createArrayOfSearchFacet() {
    return new ArrayOfSearchFacet();
  }

  /**
   * Create an instance of {@link SearchResultFacetEntry }
   */
  public SearchResultFacetEntry createSearchResultFacetEntry() {
    return new SearchResultFacetEntry();
  }

  /**
   * Create an instance of {@link CommunicationParty }
   */
  public CommunicationParty createCommunicationParty() {
    return new CommunicationParty();
  }

  /**
   * Create an instance of {@link GetOrganizationUpdateStatistics }
   */
  public GetOrganizationUpdateStatistics createGetOrganizationUpdateStatistics() {
    return new GetOrganizationUpdateStatistics();
  }

  /**
   * Create an instance of {@link SearchByIdResponse }
   */
  public SearchByIdResponse createSearchByIdResponse() {
    return new SearchByIdResponse();
  }

  /**
   * Create an instance of {@link ArrayOfCommunicationParty }
   */
  public ArrayOfCommunicationParty createArrayOfCommunicationParty() {
    return new ArrayOfCommunicationParty();
  }

  /**
   * Create an instance of {@link ArrayOfDepartment }
   */
  public ArrayOfDepartment createArrayOfDepartment() {
    return new ArrayOfDepartment();
  }

  /**
   * Create an instance of {@link CommunicationPartyStatistics }
   */
  public CommunicationPartyStatistics createCommunicationPartyStatistics() {
    return new CommunicationPartyStatistics();
  }

  /**
   * Create an instance of {@link GetCertificateForValidatingSignatureLdapResponse }
   */
  public GetCertificateForValidatingSignatureLdapResponse
  createGetCertificateForValidatingSignatureLdapResponse() {
    return new GetCertificateForValidatingSignatureLdapResponse();
  }

  /**
   * Create an instance of {@link GetAllHFCommpartiesCsvResponse }
   */
  public GetAllHFCommpartiesCsvResponse createGetAllHFCommpartiesCsvResponse() {
    return new GetAllHFCommpartiesCsvResponse();
  }

  /**
   * Create an instance of {@link GetCommunicationPartyDetailsResponse }
   */
  public GetCommunicationPartyDetailsResponse createGetCommunicationPartyDetailsResponse() {
    return new GetCommunicationPartyDetailsResponse();
  }

  /**
   * Create an instance of {@link GetCertificateDetailsForValidatingSignatureResponse }
   */
  public GetCertificateDetailsForValidatingSignatureResponse
  createGetCertificateDetailsForValidatingSignatureResponse() {
    return new GetCertificateDetailsForValidatingSignatureResponse();
  }

  /**
   * Create an instance of {@link UpdateDepartmentDetails }
   */
  public UpdateDepartmentDetails createUpdateDepartmentDetails() {
    return new UpdateDepartmentDetails();
  }

  /**
   * Create an instance of {@link DepartmentUpdate }
   */
  public DepartmentUpdate createDepartmentUpdate() {
    return new DepartmentUpdate();
  }

  /**
   * Create an instance of {@link GetOrganizationPersonDetailsResponse }
   */
  public GetOrganizationPersonDetailsResponse createGetOrganizationPersonDetailsResponse() {
    return new GetOrganizationPersonDetailsResponse();
  }

  /**
   * Create an instance of {@link ArrayOfBusinessTypeStatistics }
   */
  public ArrayOfBusinessTypeStatistics createArrayOfBusinessTypeStatistics() {
    return new ArrayOfBusinessTypeStatistics();
  }

  /**
   * Create an instance of {@link Search }
   */
  public Search createSearch() {
    return new Search();
  }

  /**
   * Create an instance of {@link CommunicationPartySearch }
   */
  public CommunicationPartySearch createCommunicationPartySearch() {
    return new CommunicationPartySearch();
  }

  /**
   * Create an instance of {@link GetCommunicationPartyStatisticsResponse }
   */
  public GetCommunicationPartyStatisticsResponse createGetCommunicationPartyStatisticsResponse() {
    return new GetCommunicationPartyStatisticsResponse();
  }

  /**
   * Create an instance of {@link ArrayOfOrganizationPerson }
   */
  public ArrayOfOrganizationPerson createArrayOfOrganizationPerson() {
    return new ArrayOfOrganizationPerson();
  }

  /**
   * Create an instance of {@link CreateServiceResponse }
   */
  public CreateServiceResponse createCreateServiceResponse() {
    return new CreateServiceResponse();
  }

  /**
   * Create an instance of {@link GetOrganizationsOwnedByResponse }
   */
  public GetOrganizationsOwnedByResponse createGetOrganizationsOwnedByResponse() {
    return new GetOrganizationsOwnedByResponse();
  }

  /**
   * Create an instance of {@link GetOrganizationDetailsResponse }
   */
  public GetOrganizationDetailsResponse createGetOrganizationDetailsResponse() {
    return new GetOrganizationDetailsResponse();
  }

  /**
   * Create an instance of {@link GetAssosiatedIKSParentOrganizationsResponse }
   */
  public GetAssosiatedIKSParentOrganizationsResponse
  createGetAssosiatedIKSParentOrganizationsResponse() {
    return new GetAssosiatedIKSParentOrganizationsResponse();
  }

  /**
   * Create an instance of {@link AddCustomAttributeResponse }
   */
  public AddCustomAttributeResponse createAddCustomAttributeResponse() {
    return new AddCustomAttributeResponse();
  }

  /**
   * Create an instance of {@link UpdateOrganizationIKSAssociations }
   */
  public UpdateOrganizationIKSAssociations createUpdateOrganizationIKSAssociations() {
    return new UpdateOrganizationIKSAssociations();
  }

  /**
   * Create an instance of {@link UpdateOrganizationDetailsResponse }
   */
  public UpdateOrganizationDetailsResponse createUpdateOrganizationDetailsResponse() {
    return new UpdateOrganizationDetailsResponse();
  }

  /**
   * Create an instance of {@link ArrayOfSearchResultFacetEntry }
   */
  public ArrayOfSearchResultFacetEntry createArrayOfSearchResultFacetEntry() {
    return new ArrayOfSearchResultFacetEntry();
  }

  /**
   * Create an instance of {@link OrganizationCreate }
   */
  public OrganizationCreate createOrganizationCreate() {
    return new OrganizationCreate();
  }

  /**
   * Create an instance of {@link GetGPCommunicationPartyResponse }
   */
  public GetGPCommunicationPartyResponse createGetGPCommunicationPartyResponse() {
    return new GetGPCommunicationPartyResponse();
  }

  /**
   * Create an instance of {@link CreateOrganization }
   */
  public CreateOrganization createCreateOrganization() {
    return new CreateOrganization();
  }

  /**
   * Create an instance of {@link RemoveCustomAttribute }
   */
  public RemoveCustomAttribute createRemoveCustomAttribute() {
    return new RemoveCustomAttribute();
  }

  /**
   * Create an instance of {@link SearchResponse }
   */
  public SearchResponse createSearchResponse() {
    return new SearchResponse();
  }

  /**
   * Create an instance of {@link CreateDepartment }
   */
  public CreateDepartment createCreateDepartment() {
    return new CreateDepartment();
  }

  /**
   * Create an instance of {@link DepartmentCreate }
   */
  public DepartmentCreate createDepartmentCreate() {
    return new DepartmentCreate();
  }

  /**
   * Create an instance of {@link UpdateOrganizationDetails }
   */
  public UpdateOrganizationDetails createUpdateOrganizationDetails() {
    return new UpdateOrganizationDetails();
  }

  /**
   * Create an instance of {@link OrganizationUpdate }
   */
  public OrganizationUpdate createOrganizationUpdate() {
    return new OrganizationUpdate();
  }

  /**
   * Create an instance of {@link UpdateDepartmentDetailsResponse }
   */
  public UpdateDepartmentDetailsResponse createUpdateDepartmentDetailsResponse() {
    return new UpdateDepartmentDetailsResponse();
  }

  /**
   * Create an instance of {@link GetOrganizationsOwnedBy }
   */
  public GetOrganizationsOwnedBy createGetOrganizationsOwnedBy() {
    return new GetOrganizationsOwnedBy();
  }

  /**
   * Create an instance of {@link Ping }
   */
  public Ping createPing() {
    return new Ping();
  }

  /**
   * Create an instance of {@link GetCertificateDetailsForEncryptionResponse }
   */
  public GetCertificateDetailsForEncryptionResponse
  createGetCertificateDetailsForEncryptionResponse() {
    return new GetCertificateDetailsForEncryptionResponse();
  }

  /**
   * Create an instance of {@link GetCertificateForEncryptionResponse }
   */
  public GetCertificateForEncryptionResponse createGetCertificateForEncryptionResponse() {
    return new GetCertificateForEncryptionResponse();
  }

  /**
   * Create an instance of {@link GetCertificateForEncryptionByOrganizationNumberResponse }
   */
  public GetCertificateForEncryptionByOrganizationNumberResponse
  createGetCertificateForEncryptionByOrganizationNumberResponse() {
    return new GetCertificateForEncryptionByOrganizationNumberResponse();
  }

  /**
   * Create an instance of {@link GetCertificateForEncryptionByOrganizationNumber }
   */
  public GetCertificateForEncryptionByOrganizationNumber
  createGetCertificateForEncryptionByOrganizationNumber() {
    return new GetCertificateForEncryptionByOrganizationNumber();
  }

  /**
   * Create an instance of {@link GetCertificateForValidatingSignatureByOrganizationNumberResponse
   * }
   */
  public GetCertificateForValidatingSignatureByOrganizationNumberResponse
  createGetCertificateForValidatingSignatureByOrganizationNumberResponse() {
    return new GetCertificateForValidatingSignatureByOrganizationNumberResponse();
  }

  /**
   * Create an instance of {@link GetOrganizationsHavingCode }
   */
  public GetOrganizationsHavingCode createGetOrganizationsHavingCode() {
    return new GetOrganizationsHavingCode();
  }

  /**
   * Create an instance of {@link SearchById }
   */
  public SearchById createSearchById() {
    return new SearchById();
  }

  /**
   * Create an instance of {@link EnableTransportOnOrganizationResponse }
   */
  public EnableTransportOnOrganizationResponse createEnableTransportOnOrganizationResponse() {
    return new EnableTransportOnOrganizationResponse();
  }

  /**
   * Create an instance of {@link UpdateOrganizationPersonDetails }
   */
  public UpdateOrganizationPersonDetails createUpdateOrganizationPersonDetails() {
    return new UpdateOrganizationPersonDetails();
  }

  /**
   * Create an instance of {@link ArrayOfService }
   */
  public ArrayOfService createArrayOfService() {
    return new ArrayOfService();
  }

  /**
   * Create an instance of {@link GetCertificateForValidatingSignatureLdap }
   */
  public GetCertificateForValidatingSignatureLdap createGetCertificateForValidatingSignatureLdap() {
    return new GetCertificateForValidatingSignatureLdap();
  }

  /**
   * Create an instance of {@link EnableTransportOnOrganization }
   */
  public EnableTransportOnOrganization createEnableTransportOnOrganization() {
    return new EnableTransportOnOrganization();
  }

  /**
   * Create an instance of {@link GetAssosiatedIKSChildOrganizationsResponse }
   */
  public GetAssosiatedIKSChildOrganizationsResponse
  createGetAssosiatedIKSChildOrganizationsResponse() {
    return new GetAssosiatedIKSChildOrganizationsResponse();
  }

  /**
   * Create an instance of {@link GetCertificateForValidatingSignatureByOrganizationNumber }
   */
  public GetCertificateForValidatingSignatureByOrganizationNumber
  createGetCertificateForValidatingSignatureByOrganizationNumber() {
    return new GetCertificateForValidatingSignatureByOrganizationNumber();
  }

  /**
   * Create an instance of {@link SearchCertificatesForEncryption }
   */
  public SearchCertificatesForEncryption createSearchCertificatesForEncryption() {
    return new SearchCertificatesForEncryption();
  }

  /**
   * Create an instance of {@link GetCertificateForEncryptionLdapResponse }
   */
  public GetCertificateForEncryptionLdapResponse createGetCertificateForEncryptionLdapResponse() {
    return new GetCertificateForEncryptionLdapResponse();
  }

  /**
   * Create an instance of {@link SetCommunicationPartyValid }
   */
  public SetCommunicationPartyValid createSetCommunicationPartyValid() {
    return new SetCommunicationPartyValid();
  }

  /**
   * Create an instance of {@link GetOrganizationPersonDetails }
   */
  public GetOrganizationPersonDetails createGetOrganizationPersonDetails() {
    return new GetOrganizationPersonDetails();
  }

  /**
   * Create an instance of {@link GetCertificateDetailsForValidatingSignature }
   */
  public GetCertificateDetailsForValidatingSignature
  createGetCertificateDetailsForValidatingSignature() {
    return new GetCertificateDetailsForValidatingSignature();
  }

  /**
   * Create an instance of {@link SearchCertificatesForValidatingSignature }
   */
  public SearchCertificatesForValidatingSignature createSearchCertificatesForValidatingSignature() {
    return new SearchCertificatesForValidatingSignature();
  }

  /**
   * Create an instance of {@link ArrayOfUpdateStatistic }
   */
  public ArrayOfUpdateStatistic createArrayOfUpdateStatistic() {
    return new ArrayOfUpdateStatistic();
  }

  /**
   * Create an instance of {@link SearchCertificatesForValidatingSignatureResponse }
   */
  public SearchCertificatesForValidatingSignatureResponse
  createSearchCertificatesForValidatingSignatureResponse() {
    return new SearchCertificatesForValidatingSignatureResponse();
  }

  /**
   * Create an instance of {@link GetCertificate }
   */
  public GetCertificate createGetCertificate() {
    return new GetCertificate();
  }

  /**
   * Create an instance of {@link UpdateServiceDetails }
   */
  public UpdateServiceDetails createUpdateServiceDetails() {
    return new UpdateServiceDetails();
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link CertificateDetails }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CertificateDetails",
          name = "CertificateDetails")
  public JAXBElement<CertificateDetails> createCertificateDetails(CertificateDetails value) {
    return new JAXBElement<>(
            _CertificateDetails_QNAME, CertificateDetails.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link GenericFault }{@code >}}
   */
  @XmlElementDecl(namespace = "http://register.nhn.no/Common", name = "GenericFault")
  public JAXBElement<GenericFault> createGenericFault(GenericFault value) {
    return new JAXBElement<>(_GenericFault_QNAME, GenericFault.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link DepartmentCreate }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "DepartmentCreate")
  public JAXBElement<DepartmentCreate> createDepartmentCreate(DepartmentCreate value) {
    return new JAXBElement<>(
            _DepartmentCreate_QNAME, DepartmentCreate.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCode }{@code >}}
   */
  @XmlElementDecl(namespace = "http://register.nhn.no/Common", name = "ArrayOfCode")
  public JAXBElement<ArrayOfCode> createArrayOfCode(ArrayOfCode value) {
    return new JAXBElement<>(_ArrayOfCode_QNAME, ArrayOfCode.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfService }{@code >}}
   */
  @XmlElementDecl(namespace = "http://register.nhn.no/CommunicationParty", name = "ArrayOfService")
  public JAXBElement<ArrayOfService> createArrayOfService(ArrayOfService value) {
    return new JAXBElement<>(
            _ArrayOfService_QNAME, ArrayOfService.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEntityLogEntry }{@code >}}
   */
  @XmlElementDecl(namespace = "http://register.nhn.no/Common", name = "ArrayOfEntityLogEntry")
  public JAXBElement<ArrayOfEntityLogEntry> createArrayOfEntityLogEntry(
          ArrayOfEntityLogEntry value) {
    return new JAXBElement<>(
            _ArrayOfEntityLogEntry_QNAME, ArrayOfEntityLogEntry.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://schemas.microsoft.com/2003/10/Serialization/",
          name = "duration")
  public JAXBElement<Duration> createDuration(Duration value) {
    return new JAXBElement<>(_Duration_QNAME, Duration.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ValidationError }{@code >}}
   */
  @XmlElementDecl(namespace = "http://register.nhn.no/Common", name = "ValidationError")
  public JAXBElement<ValidationError> createValidationError(ValidationError value) {
    return new JAXBElement<ValidationError>(
            _ValidationError_QNAME, ValidationError.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link OrganizationUpdate }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "OrganizationUpdate")
  public JAXBElement<OrganizationUpdate> createOrganizationUpdate(OrganizationUpdate value) {
    return new JAXBElement<>(
            _OrganizationUpdate_QNAME, OrganizationUpdate.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEntityLogEntryData }{@code
   * >}}
   */
  @XmlElementDecl(namespace = "http://register.nhn.no/Common", name = "ArrayOfEntityLogEntryData")
  public JAXBElement<ArrayOfEntityLogEntryData> createArrayOfEntityLogEntryData(
          ArrayOfEntityLogEntryData value) {
    return new JAXBElement<>(
            _ArrayOfEntityLogEntryData_QNAME, ArrayOfEntityLogEntryData.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Organization }{@code >}}
   */
  @XmlElementDecl(namespace = "http://register.nhn.no/CommunicationParty", name = "Organization")
  public JAXBElement<Organization> createOrganization(Organization value) {
    return new JAXBElement<Organization>(_Organization_QNAME, Organization.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays",
          name = "ArrayOfstring")
  public JAXBElement<ArrayOfstring> createArrayOfstring(ArrayOfstring value) {
    return new JAXBElement<>(_ArrayOfstring_QNAME, ArrayOfstring.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "long")
  public JAXBElement<Long> createLong(Long value) {
    return new JAXBElement<>(_Long_QNAME, Long.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://schemas.microsoft.com/2003/10/Serialization/",
          name = "dateTime")
  public JAXBElement<XMLGregorianCalendar> createDateTime(XMLGregorianCalendar value) {
    return new JAXBElement<>(
            _DateTime_QNAME, XMLGregorianCalendar.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPhysicalAddress }{@code >}}
   */
  @XmlElementDecl(namespace = "http://register.nhn.no/Common", name = "ArrayOfPhysicalAddress")
  public JAXBElement<ArrayOfPhysicalAddress> createArrayOfPhysicalAddress(
          ArrayOfPhysicalAddress value) {
    return new JAXBElement<>(
            _ArrayOfPhysicalAddress_QNAME, ArrayOfPhysicalAddress.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://schemas.microsoft.com/2003/10/Serialization/",
          name = "string")
  public JAXBElement<String> createString(String value) {
    return new JAXBElement<>(_String_QNAME, String.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCertificateDetails }{@code
   * >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CertificateDetails",
          name = "ArrayOfCertificateDetails")
  public JAXBElement<ArrayOfCertificateDetails> createArrayOfCertificateDetails(
          ArrayOfCertificateDetails value) {
    return new JAXBElement<>(
            _ArrayOfCertificateDetails_QNAME, ArrayOfCertificateDetails.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSpecialCompetence }{@code >}}
   */
  @XmlElementDecl(namespace = "http://register.nhn.no/HPR", name = "ArrayOfSpecialCompetence")
  public JAXBElement<ArrayOfSpecialCompetence> createArrayOfSpecialCompetence(
          ArrayOfSpecialCompetence value) {
    return new JAXBElement<>(
            _ArrayOfSpecialCompetence_QNAME, ArrayOfSpecialCompetence.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOrganization }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "ArrayOfOrganization")
  public JAXBElement<ArrayOfOrganization> createArrayOfOrganization(ArrayOfOrganization value) {
    return new JAXBElement<>(
            _ArrayOfOrganization_QNAME, ArrayOfOrganization.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAuthorization }{@code >}}
   */
  @XmlElementDecl(namespace = "http://register.nhn.no/HPR", name = "ArrayOfAuthorization")
  public JAXBElement<ArrayOfAuthorization> createArrayOfAuthorization(ArrayOfAuthorization value) {
    return new JAXBElement<>(
            _ArrayOfAuthorization_QNAME, ArrayOfAuthorization.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link SearchResultFacetEntry }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "SearchResultFacetEntry")
  public JAXBElement<SearchResultFacetEntry> createSearchResultFacetEntry(
          SearchResultFacetEntry value) {
    return new JAXBElement<>(
            _SearchResultFacetEntry_QNAME, SearchResultFacetEntry.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://schemas.microsoft.com/2003/10/Serialization/",
          name = "unsignedInt")
  public JAXBElement<Long> createUnsignedInt(Long value) {
    return new JAXBElement<>(_UnsignedInt_QNAME, Long.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "char")
  public JAXBElement<Integer> createChar(Integer value) {
    return new JAXBElement<>(_Char_QNAME, Integer.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSearchFacet }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "ArrayOfSearchFacet")
  public JAXBElement<ArrayOfSearchFacet> createArrayOfSearchFacet(ArrayOfSearchFacet value) {
    return new JAXBElement<>(
            _ArrayOfSearchFacet_QNAME, ArrayOfSearchFacet.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "short")
  public JAXBElement<Short> createShort(Short value) {
    return new JAXBElement<>(_Short_QNAME, Short.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDepartment }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "ArrayOfDepartment")
  public JAXBElement<ArrayOfDepartment> createArrayOfDepartment(ArrayOfDepartment value) {
    return new JAXBElement<>(
            _ArrayOfDepartment_QNAME, ArrayOfDepartment.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link CommunicationPartyStatistics }{@code
   * >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "CommunicationPartyStatistics")
  public JAXBElement<CommunicationPartyStatistics> createCommunicationPartyStatistics(
          CommunicationPartyStatistics value) {
    return new JAXBElement<>(
            _CommunicationPartyStatistics_QNAME, CommunicationPartyStatistics.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValuePairOfstringstring
   * }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://schemas.datacontract.org/2004/07/System.Collections.Generic",
          name = "ArrayOfKeyValuePairOfstringstring")
  public JAXBElement<ArrayOfKeyValuePairOfstringstring> createArrayOfKeyValuePairOfstringstring(
          ArrayOfKeyValuePairOfstringstring value) {
    return new JAXBElement<>(
            _ArrayOfKeyValuePairOfstringstring_QNAME,
            ArrayOfKeyValuePairOfstringstring.class,
            null,
            value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link KeyValuePairOfintArrayOfCodeUO9UWExd
   * }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://schemas.datacontract.org/2004/07/System.Collections.Generic",
          name = "KeyValuePairOfintArrayOfCodeUO9uWExd")
  public JAXBElement<KeyValuePairOfintArrayOfCodeUO9UWExd>
  createKeyValuePairOfintArrayOfCodeUO9UWExd(KeyValuePairOfintArrayOfCodeUO9UWExd value) {
    return new JAXBElement<KeyValuePairOfintArrayOfCodeUO9UWExd>(
            _KeyValuePairOfintArrayOfCodeUO9UWExd_QNAME,
            KeyValuePairOfintArrayOfCodeUO9UWExd.class,
            null,
            value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link CommunicationParty }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "CommunicationParty")
  public JAXBElement<CommunicationParty> createCommunicationParty(CommunicationParty value) {
    return new JAXBElement<>(
            _CommunicationParty_QNAME, CommunicationParty.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://schemas.microsoft.com/2003/10/Serialization/",
          name = "boolean")
  public JAXBElement<Boolean> createBoolean(Boolean value) {
    return new JAXBElement<Boolean>(_Boolean_QNAME, Boolean.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUpdateStatistic }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "ArrayOfUpdateStatistic")
  public JAXBElement<ArrayOfUpdateStatistic> createArrayOfUpdateStatistic(
          ArrayOfUpdateStatistic value) {
    return new JAXBElement<ArrayOfUpdateStatistic>(
            _ArrayOfUpdateStatistic_QNAME, ArrayOfUpdateStatistic.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ServiceCreate }{@code >}}
   */
  @XmlElementDecl(namespace = "http://register.nhn.no/CommunicationParty", name = "ServiceCreate")
  public JAXBElement<ServiceCreate> createServiceCreate(ServiceCreate value) {
    return new JAXBElement<ServiceCreate>(_ServiceCreate_QNAME, ServiceCreate.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Person }{@code >}}
   */
  @XmlElementDecl(namespace = "http://register.nhn.no/HPR", name = "Person")
  public JAXBElement<Person> createPerson(Person value) {
    return new JAXBElement<Person>(_Person_QNAME, Person.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link CommunicationPartySearch }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "CommunicationPartySearch")
  public JAXBElement<CommunicationPartySearch> createCommunicationPartySearch(
          CommunicationPartySearch value) {
    return new JAXBElement<CommunicationPartySearch>(
            _CommunicationPartySearch_QNAME, CommunicationPartySearch.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Speciality }{@code >}}
   */
  @XmlElementDecl(namespace = "http://register.nhn.no/HPR", name = "Speciality")
  public JAXBElement<Speciality> createSpeciality(Speciality value) {
    return new JAXBElement<Speciality>(_Speciality_QNAME, Speciality.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "int")
  public JAXBElement<Integer> createInt(Integer value) {
    return new JAXBElement<>(_Int_QNAME, Integer.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link BusinessTypeStatistics }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "BusinessTypeStatistics")
  public JAXBElement<BusinessTypeStatistics> createBusinessTypeStatistics(
          BusinessTypeStatistics value) {
    return new JAXBElement<BusinessTypeStatistics>(
            _BusinessTypeStatistics_QNAME, BusinessTypeStatistics.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link SearchResult }{@code >}}
   */
  @XmlElementDecl(namespace = "http://register.nhn.no/CommunicationParty", name = "SearchResult")
  public JAXBElement<SearchResult> createSearchResult(SearchResult value) {
    return new JAXBElement<SearchResult>(_SearchResult_QNAME, SearchResult.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Period }{@code >}}
   */
  @XmlElementDecl(namespace = "http://register.nhn.no/Common", name = "Period")
  public JAXBElement<Period> createPeriod(Period value) {
    return new JAXBElement<>(_Period_QNAME, Period.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link CitizenId }{@code >}}
   */
  @XmlElementDecl(namespace = "http://register.nhn.no/Common", name = "CitizenId")
  public JAXBElement<CitizenId> createCitizenId(CitizenId value) {
    return new JAXBElement<CitizenId>(_CitizenId_QNAME, CitizenId.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays",
          name = "ArrayOfint")
  public JAXBElement<ArrayOfint> createArrayOfint(ArrayOfint value) {
    return new JAXBElement<ArrayOfint>(_ArrayOfint_QNAME, ArrayOfint.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link PhysicalAddress }{@code >}}
   */
  @XmlElementDecl(namespace = "http://register.nhn.no/Common", name = "PhysicalAddress")
  public JAXBElement<PhysicalAddress> createPhysicalAddress(PhysicalAddress value) {
    return new JAXBElement<PhysicalAddress>(
            _PhysicalAddress_QNAME, PhysicalAddress.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link KeyValuePairOfstringstring }{@code
   * >}}
   */
  @XmlElementDecl(
          namespace = "http://schemas.datacontract.org/2004/07/System.Collections.Generic",
          name = "KeyValuePairOfstringstring")
  public JAXBElement<KeyValuePairOfstringstring> createKeyValuePairOfstringstring(
          KeyValuePairOfstringstring value) {
    return new JAXBElement<KeyValuePairOfstringstring>(
            _KeyValuePairOfstringstring_QNAME, KeyValuePairOfstringstring.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Service }{@code >}}
   */
  @XmlElementDecl(namespace = "http://register.nhn.no/CommunicationParty", name = "Service")
  public JAXBElement<Service> createService(Service value) {
    return new JAXBElement<Service>(_Service_QNAME, Service.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "QName")
  public JAXBElement<QName> createQName(QName value) {
    return new JAXBElement<QName>(_QName_QNAME, QName.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Code }{@code >}}
   */
  @XmlElementDecl(namespace = "http://register.nhn.no/Common", name = "Code")
  public JAXBElement<Code> createCode(Code value) {
    return new JAXBElement<>(_Code_QNAME, Code.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Authorization }{@code >}}
   */
  @XmlElementDecl(namespace = "http://register.nhn.no/HPR", name = "Authorization")
  public JAXBElement<Authorization> createAuthorization(Authorization value) {
    return new JAXBElement<Authorization>(_Authorization_QNAME, Authorization.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Department }{@code >}}
   */
  @XmlElementDecl(namespace = "http://register.nhn.no/CommunicationParty", name = "Department")
  public JAXBElement<Department> createDepartment(Department value) {
    return new JAXBElement<>(_Department_QNAME, Department.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://schemas.microsoft.com/2003/10/Serialization/",
          name = "unsignedLong")
  public JAXBElement<BigInteger> createUnsignedLong(BigInteger value) {
    return new JAXBElement<BigInteger>(_UnsignedLong_QNAME, BigInteger.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link SearchFacet }{@code >}}
   */
  @XmlElementDecl(namespace = "http://register.nhn.no/CommunicationParty", name = "SearchFacet")
  public JAXBElement<SearchFacet> createSearchFacet(SearchFacet value) {
    return new JAXBElement<SearchFacet>(_SearchFacet_QNAME, SearchFacet.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://schemas.microsoft.com/2003/10/Serialization/",
          name = "unsignedByte")
  public JAXBElement<Short> createUnsignedByte(Short value) {
    return new JAXBElement<>(_UnsignedByte_QNAME, Short.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://schemas.microsoft.com/2003/10/Serialization/",
          name = "unsignedShort")
  public JAXBElement<Integer> createUnsignedShort(Integer value) {
    return new JAXBElement<>(_UnsignedShort_QNAME, Integer.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBusinessTypeStatistics }{@code
   * >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "ArrayOfBusinessTypeStatistics")
  public JAXBElement<ArrayOfBusinessTypeStatistics> createArrayOfBusinessTypeStatistics(
          ArrayOfBusinessTypeStatistics value) {
    return new JAXBElement<ArrayOfBusinessTypeStatistics>(
            _ArrayOfBusinessTypeStatistics_QNAME, ArrayOfBusinessTypeStatistics.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link OrganizationPersonCreate }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "OrganizationPersonCreate")
  public JAXBElement<OrganizationPersonCreate> createOrganizationPersonCreate(
          OrganizationPersonCreate value) {
    return new JAXBElement<OrganizationPersonCreate>(
            _OrganizationPersonCreate_QNAME, OrganizationPersonCreate.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOrganizationPerson }{@code
   * >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "ArrayOfOrganizationPerson")
  public JAXBElement<ArrayOfOrganizationPerson> createArrayOfOrganizationPerson(
          ArrayOfOrganizationPerson value) {
    return new JAXBElement<ArrayOfOrganizationPerson>(
            _ArrayOfOrganizationPerson_QNAME, ArrayOfOrganizationPerson.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfValidationError }{@code >}}
   */
  @XmlElementDecl(namespace = "http://register.nhn.no/Common", name = "ArrayOfValidationError")
  public JAXBElement<ArrayOfValidationError> createArrayOfValidationError(
          ArrayOfValidationError value) {
    return new JAXBElement<>(
            _ArrayOfValidationError_QNAME, ArrayOfValidationError.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link CitizenIdType }{@code >}}
   */
  @XmlElementDecl(namespace = "http://register.nhn.no/Common", name = "CitizenIdType")
  public JAXBElement<CitizenIdType> createCitizenIdType(CitizenIdType value) {
    return new JAXBElement<CitizenIdType>(_CitizenIdType_QNAME, CitizenIdType.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ServiceUpdate }{@code >}}
   */
  @XmlElementDecl(namespace = "http://register.nhn.no/CommunicationParty", name = "ServiceUpdate")
  public JAXBElement<ServiceUpdate> createServiceUpdate(ServiceUpdate value) {
    return new JAXBElement<ServiceUpdate>(_ServiceUpdate_QNAME, ServiceUpdate.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link EntityLogEntry }{@code >}}
   */
  @XmlElementDecl(namespace = "http://register.nhn.no/Common", name = "EntityLogEntry")
  public JAXBElement<EntityLogEntry> createEntityLogEntry(EntityLogEntry value) {
    return new JAXBElement<EntityLogEntry>(
            _EntityLogEntry_QNAME, EntityLogEntry.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link OrganizationPerson }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "OrganizationPerson")
  public JAXBElement<OrganizationPerson> createOrganizationPerson(OrganizationPerson value) {
    return new JAXBElement<>(
            _OrganizationPerson_QNAME, OrganizationPerson.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "float")
  public JAXBElement<Float> createFloat(Float value) {
    return new JAXBElement<Float>(_Float_QNAME, Float.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfElectronicAddress }{@code >}}
   */
  @XmlElementDecl(namespace = "http://register.nhn.no/Common", name = "ArrayOfElectronicAddress")
  public JAXBElement<ArrayOfElectronicAddress> createArrayOfElectronicAddress(
          ArrayOfElectronicAddress value) {
    return new JAXBElement<>(
            _ArrayOfElectronicAddress_QNAME, ArrayOfElectronicAddress.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://schemas.microsoft.com/2003/10/Serialization/",
          name = "anyType")
  public JAXBElement<Object> createAnyType(Object value) {
    return new JAXBElement<Object>(_AnyType_QNAME, Object.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code
   * >}{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "CommunicationPartyType")
  public JAXBElement<List<String>> createCommunicationPartyType(List<String> value) {
    return new JAXBElement<List<String>>(
            _CommunicationPartyType_QNAME, ((Class) List.class), null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ValidationFault }{@code >}}
   */
  @XmlElementDecl(namespace = "http://register.nhn.no/Common", name = "ValidationFault")
  public JAXBElement<ValidationFault> createValidationFault(ValidationFault value) {
    return new JAXBElement<ValidationFault>(
            _ValidationFault_QNAME, ValidationFault.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "guid")
  public JAXBElement<String> createGuid(String value) {
    return new JAXBElement<>(_Guid_QNAME, String.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://schemas.microsoft.com/2003/10/Serialization/",
          name = "decimal")
  public JAXBElement<BigDecimal> createDecimal(BigDecimal value) {
    return new JAXBElement<BigDecimal>(_Decimal_QNAME, BigDecimal.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCommunicationParty }{@code
   * >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "ArrayOfCommunicationParty")
  public JAXBElement<ArrayOfCommunicationParty> createArrayOfCommunicationParty(
          ArrayOfCommunicationParty value) {
    return new JAXBElement<ArrayOfCommunicationParty>(
            _ArrayOfCommunicationParty_QNAME, ArrayOfCommunicationParty.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValuePairOfintArrayOfCodeUO9UWExd
   * }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://schemas.datacontract.org/2004/07/System.Collections.Generic",
          name = "ArrayOfKeyValuePairOfintArrayOfCodeUO9uWExd")
  public JAXBElement<ArrayOfKeyValuePairOfintArrayOfCodeUO9UWExd>
  createArrayOfKeyValuePairOfintArrayOfCodeUO9UWExd(
          ArrayOfKeyValuePairOfintArrayOfCodeUO9UWExd value) {
    return new JAXBElement<ArrayOfKeyValuePairOfintArrayOfCodeUO9UWExd>(
            _ArrayOfKeyValuePairOfintArrayOfCodeUO9UWExd_QNAME,
            ArrayOfKeyValuePairOfintArrayOfCodeUO9UWExd.class,
            null,
            value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link UpdateStatistic }{@code >}}
   */
  @XmlElementDecl(namespace = "http://register.nhn.no/CommunicationParty", name = "UpdateStatistic")
  public JAXBElement<UpdateStatistic> createUpdateStatistic(UpdateStatistic value) {
    return new JAXBElement<UpdateStatistic>(
            _UpdateStatistic_QNAME, UpdateStatistic.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link HPRInformation }{@code >}}
   */
  @XmlElementDecl(namespace = "http://register.nhn.no/HPR", name = "HPRInformation")
  public JAXBElement<HPRInformation> createHPRInformation(HPRInformation value) {
    return new JAXBElement<HPRInformation>(
            _HPRInformation_QNAME, HPRInformation.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Requisition }{@code >}}
   */
  @XmlElementDecl(namespace = "http://register.nhn.no/HPR", name = "Requisition")
  public JAXBElement<Requisition> createRequisition(Requisition value) {
    return new JAXBElement<>(_Requisition_QNAME, Requisition.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://schemas.microsoft.com/2003/10/Serialization/",
          name = "base64Binary")
  public JAXBElement<byte[]> createBase64Binary(byte[] value) {
    return new JAXBElement<>(_Base64Binary_QNAME, byte[].class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link DepartmentUpdate }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "DepartmentUpdate")
  public JAXBElement<DepartmentUpdate> createDepartmentUpdate(DepartmentUpdate value) {
    return new JAXBElement<DepartmentUpdate>(
            _DepartmentUpdate_QNAME, DepartmentUpdate.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link OrganizationUpdateStatistics }{@code
   * >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "OrganizationUpdateStatistics")
  public JAXBElement<OrganizationUpdateStatistics> createOrganizationUpdateStatistics(
          OrganizationUpdateStatistics value) {
    return new JAXBElement<OrganizationUpdateStatistics>(
            _OrganizationUpdateStatistics_QNAME, OrganizationUpdateStatistics.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link EntityLogEntryData }{@code >}}
   */
  @XmlElementDecl(namespace = "http://register.nhn.no/Common", name = "EntityLogEntryData")
  public JAXBElement<EntityLogEntryData> createEntityLogEntryData(EntityLogEntryData value) {
    return new JAXBElement<EntityLogEntryData>(
            _EntityLogEntryData_QNAME, EntityLogEntryData.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link OrganizationPersonUpdate }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "OrganizationPersonUpdate")
  public JAXBElement<OrganizationPersonUpdate> createOrganizationPersonUpdate(
          OrganizationPersonUpdate value) {
    return new JAXBElement<>(
            _OrganizationPersonUpdate_QNAME, OrganizationPersonUpdate.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://schemas.microsoft.com/2003/10/Serialization/",
          name = "anyURI")
  public JAXBElement<String> createAnyURI(String value) {
    return new JAXBElement<>(_AnyURI_QNAME, String.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSearchResultFacetEntry }{@code
   * >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "ArrayOfSearchResultFacetEntry")
  public JAXBElement<ArrayOfSearchResultFacetEntry> createArrayOfSearchResultFacetEntry(
          ArrayOfSearchResultFacetEntry value) {
    return new JAXBElement<ArrayOfSearchResultFacetEntry>(
            _ArrayOfSearchResultFacetEntry_QNAME, ArrayOfSearchResultFacetEntry.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link OrganizationCreate }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "OrganizationCreate")
  public JAXBElement<OrganizationCreate> createOrganizationCreate(OrganizationCreate value) {
    return new JAXBElement<>(
            _OrganizationCreate_QNAME, OrganizationCreate.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ElectronicAddress }{@code >}}
   */
  @XmlElementDecl(namespace = "http://register.nhn.no/Common", name = "ElectronicAddress")
  public JAXBElement<ElectronicAddress> createElectronicAddress(ElectronicAddress value) {
    return new JAXBElement<ElectronicAddress>(
            _ElectronicAddress_QNAME, ElectronicAddress.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "byte")
  public JAXBElement<Byte> createByte(Byte value) {
    return new JAXBElement<Byte>(_Byte_QNAME, Byte.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://schemas.microsoft.com/2003/10/Serialization/",
          name = "double")
  public JAXBElement<Double> createDouble(Double value) {
    return new JAXBElement<Double>(_Double_QNAME, Double.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSpeciality }{@code >}}
   */
  @XmlElementDecl(namespace = "http://register.nhn.no/HPR", name = "ArrayOfSpeciality")
  public JAXBElement<ArrayOfSpeciality> createArrayOfSpeciality(ArrayOfSpeciality value) {
    return new JAXBElement<>(
            _ArrayOfSpeciality_QNAME, ArrayOfSpeciality.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link SpecialCompetence }{@code >}}
   */
  @XmlElementDecl(namespace = "http://register.nhn.no/HPR", name = "SpecialCompetence")
  public JAXBElement<SpecialCompetence> createSpecialCompetence(SpecialCompetence value) {
    return new JAXBElement<SpecialCompetence>(
            _SpecialCompetence_QNAME, SpecialCompetence.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link DepartmentUpdate }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "org",
          scope = UpdateDepartmentDetails.class)
  public JAXBElement<DepartmentUpdate> createUpdateDepartmentDetailsOrg(DepartmentUpdate value) {
    return new JAXBElement<DepartmentUpdate>(
            _UpdateDepartmentDetailsOrg_QNAME,
            DepartmentUpdate.class,
            UpdateDepartmentDetails.class,
            value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "ou",
          scope = SearchCertificatesForValidatingSignature.class)
  public JAXBElement<String> createSearchCertificatesForValidatingSignatureOu(String value) {
    return new JAXBElement<>(
            _SearchCertificatesForValidatingSignatureOu_QNAME,
            String.class,
            SearchCertificatesForValidatingSignature.class,
            value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "sn",
          scope = SearchCertificatesForValidatingSignature.class)
  public JAXBElement<String> createSearchCertificatesForValidatingSignatureSn(String value) {
    return new JAXBElement<>(
            _SearchCertificatesForValidatingSignatureSn_QNAME,
            String.class,
            SearchCertificatesForValidatingSignature.class,
            value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "cn",
          scope = SearchCertificatesForValidatingSignature.class)
  public JAXBElement<String> createSearchCertificatesForValidatingSignatureCn(String value) {
    return new JAXBElement<>(
            _SearchCertificatesForValidatingSignatureCn_QNAME,
            String.class,
            SearchCertificatesForValidatingSignature.class,
            value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "herIdsForAssociatedIKS",
          scope = UpdateOrganizationIKSAssociations.class)
  public JAXBElement<ArrayOfint> createUpdateOrganizationIKSAssociationsHerIdsForAssociatedIKS(
          ArrayOfint value) {
    return new JAXBElement<ArrayOfint>(
            _UpdateOrganizationIKSAssociationsHerIdsForAssociatedIKS_QNAME,
            ArrayOfint.class,
            UpdateOrganizationIKSAssociations.class,
            value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCommunicationParty }{@code
   * >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "SearchByIdResult",
          scope = SearchByIdResponse.class)
  public JAXBElement<ArrayOfCommunicationParty> createSearchByIdResponseSearchByIdResult(
          ArrayOfCommunicationParty value) {
    return new JAXBElement<ArrayOfCommunicationParty>(
            _SearchByIdResponseSearchByIdResult_QNAME,
            ArrayOfCommunicationParty.class,
            SearchByIdResponse.class,
            value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "Description",
          scope = Service.class)
  public JAXBElement<String> createServiceDescription(String value) {
    return new JAXBElement<>(_ServiceDescription_QNAME, String.class, Service.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "LocationDescription",
          scope = Service.class)
  public JAXBElement<String> createServiceLocationDescription(String value) {
    return new JAXBElement<>(
            _ServiceLocationDescription_QNAME, String.class, Service.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCode }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "Properties",
          scope = Service.class)
  public JAXBElement<ArrayOfCode> createServiceProperties(ArrayOfCode value) {
    return new JAXBElement<>(
            _ServiceProperties_QNAME, ArrayOfCode.class, Service.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Code }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "Code",
          scope = Service.class)
  public JAXBElement<Code> createServiceCode(Code value) {
    return new JAXBElement<>(_ServiceCode_QNAME, Code.class, Service.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "GetCertificateForValidatingSignatureLdapResult",
          scope = GetCertificateForValidatingSignatureLdapResponse.class)
  public JAXBElement<byte[]>
  createGetCertificateForValidatingSignatureLdapResponseGetCertificateForValidatingSignatureLdapResult(
          byte[] value) {
    return new JAXBElement<>(
            _GetCertificateForValidatingSignatureLdapResponseGetCertificateForValidatingSignatureLdapResult_QNAME,
            byte[].class,
            GetCertificateForValidatingSignatureLdapResponse.class,
            value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfElectronicAddress }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "ElectronicAddresses",
          scope = OrganizationUpdate.class)
  public JAXBElement<ArrayOfElectronicAddress> createOrganizationUpdateElectronicAddresses(
          ArrayOfElectronicAddress value) {
    return new JAXBElement<>(
            _OrganizationUpdateElectronicAddresses_QNAME,
            ArrayOfElectronicAddress.class,
            OrganizationUpdate.class,
            value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Period }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "Valid",
          scope = OrganizationUpdate.class)
  public JAXBElement<Period> createOrganizationUpdateValid(Period value) {
    return new JAXBElement<>(
            _OrganizationUpdateValid_QNAME, Period.class, OrganizationUpdate.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Code }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "BusinessType",
          scope = OrganizationUpdate.class)
  public JAXBElement<Code> createOrganizationUpdateBusinessType(Code value) {
    return new JAXBElement<>(
            _OrganizationUpdateBusinessType_QNAME, Code.class, OrganizationUpdate.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "DisplayName",
          scope = OrganizationUpdate.class)
  public JAXBElement<String> createOrganizationUpdateDisplayName(String value) {
    return new JAXBElement<>(
            _OrganizationUpdateDisplayName_QNAME, String.class, OrganizationUpdate.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPhysicalAddress }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "PhysicalAddresses",
          scope = OrganizationUpdate.class)
  public JAXBElement<ArrayOfPhysicalAddress> createOrganizationUpdatePhysicalAddresses(
          ArrayOfPhysicalAddress value) {
    return new JAXBElement<>(
            _OrganizationUpdatePhysicalAddresses_QNAME,
            ArrayOfPhysicalAddress.class,
            OrganizationUpdate.class,
            value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSearchFacet }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "Facets",
          scope = SearchResult.class)
  public JAXBElement<ArrayOfSearchFacet> createSearchResultFacets(ArrayOfSearchFacet value) {
    return new JAXBElement<>(
            _SearchResultFacets_QNAME, ArrayOfSearchFacet.class, SearchResult.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCommunicationParty }{@code
   * >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "Results",
          scope = SearchResult.class)
  public JAXBElement<ArrayOfCommunicationParty> createSearchResultResults(
          ArrayOfCommunicationParty value) {
    return new JAXBElement<ArrayOfCommunicationParty>(
            _SearchResultResults_QNAME, ArrayOfCommunicationParty.class, SearchResult.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/Common",
          name = "PropertyName",
          scope = ValidationError.class)
  public JAXBElement<String> createValidationErrorPropertyName(String value) {
    return new JAXBElement<>(
            _ValidationErrorPropertyName_QNAME, String.class, ValidationError.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/Common",
          name = "Message",
          scope = ValidationError.class)
  public JAXBElement<String> createValidationErrorMessage(String value) {
    return new JAXBElement<>(
            _ValidationErrorMessage_QNAME, String.class, ValidationError.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/Common",
          name = "DisplayName",
          scope = ValidationError.class)
  public JAXBElement<String> createValidationErrorDisplayName(String value) {
    return new JAXBElement<>(
            _ValidationErrorDisplayName_QNAME, String.class, ValidationError.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/Common",
          name = "Value",
          scope = ValidationError.class)
  public JAXBElement<String> createValidationErrorValue(String value) {
    return new JAXBElement<>(
            _ValidationErrorValue_QNAME, String.class, ValidationError.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfElectronicAddress }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "ElectronicAddresses",
          scope = OrganizationCreate.class)
  public JAXBElement<ArrayOfElectronicAddress> createOrganizationCreateElectronicAddresses(
          ArrayOfElectronicAddress value) {
    return new JAXBElement<>(
            _OrganizationUpdateElectronicAddresses_QNAME,
            ArrayOfElectronicAddress.class,
            OrganizationCreate.class,
            value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Period }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "Valid",
          scope = OrganizationCreate.class)
  public JAXBElement<Period> createOrganizationCreateValid(Period value) {
    return new JAXBElement<>(
            _OrganizationUpdateValid_QNAME, Period.class, OrganizationCreate.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Code }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "BusinessType",
          scope = OrganizationCreate.class)
  public JAXBElement<Code> createOrganizationCreateBusinessType(Code value) {
    return new JAXBElement<>(
            _OrganizationUpdateBusinessType_QNAME, Code.class, OrganizationCreate.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "DisplayName",
          scope = OrganizationCreate.class)
  public JAXBElement<String> createOrganizationCreateDisplayName(String value) {
    return new JAXBElement<>(
            _OrganizationUpdateDisplayName_QNAME, String.class, OrganizationCreate.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPhysicalAddress }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "PhysicalAddresses",
          scope = OrganizationCreate.class)
  public JAXBElement<ArrayOfPhysicalAddress> createOrganizationCreatePhysicalAddresses(
          ArrayOfPhysicalAddress value) {
    return new JAXBElement<>(
            _OrganizationUpdatePhysicalAddresses_QNAME,
            ArrayOfPhysicalAddress.class,
            OrganizationCreate.class,
            value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link DepartmentCreate }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "org",
          scope = CreateDepartment.class)
  public JAXBElement<DepartmentCreate> createCreateDepartmentOrg(DepartmentCreate value) {
    return new JAXBElement<>(
            _UpdateDepartmentDetailsOrg_QNAME, DepartmentCreate.class, CreateDepartment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ServiceCreate }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "t",
          scope = CreateService.class)
  public JAXBElement<ServiceCreate> createCreateServiceT(ServiceCreate value) {
    return new JAXBElement<ServiceCreate>(
            _CreateServiceT_QNAME, ServiceCreate.class, CreateService.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ServiceUpdate }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "t",
          scope = UpdateServiceDetails.class)
  public JAXBElement<ServiceUpdate> createUpdateServiceDetailsT(ServiceUpdate value) {
    return new JAXBElement<ServiceUpdate>(
            _CreateServiceT_QNAME, ServiceUpdate.class, UpdateServiceDetails.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Organization }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "CreateOrganizationResult",
          scope = CreateOrganizationResponse.class)
  public JAXBElement<Organization> createCreateOrganizationResponseCreateOrganizationResult(
          Organization value) {
    return new JAXBElement<Organization>(
            _CreateOrganizationResponseCreateOrganizationResult_QNAME,
            Organization.class,
            CreateOrganizationResponse.class,
            value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "Description",
          scope = ServiceUpdate.class)
  public JAXBElement<String> createServiceUpdateDescription(String value) {
    return new JAXBElement<>(
            _ServiceDescription_QNAME, String.class, ServiceUpdate.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfElectronicAddress }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "ElectronicAddresses",
          scope = ServiceUpdate.class)
  public JAXBElement<ArrayOfElectronicAddress> createServiceUpdateElectronicAddresses(
          ArrayOfElectronicAddress value) {
    return new JAXBElement<>(
            _OrganizationUpdateElectronicAddresses_QNAME,
            ArrayOfElectronicAddress.class,
            ServiceUpdate.class,
            value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "LocationDescription",
          scope = ServiceUpdate.class)
  public JAXBElement<String> createServiceUpdateLocationDescription(String value) {
    return new JAXBElement<>(
            _ServiceLocationDescription_QNAME, String.class, ServiceUpdate.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Period }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "Valid",
          scope = ServiceUpdate.class)
  public JAXBElement<Period> createServiceUpdateValid(Period value) {
    return new JAXBElement<>(
            _OrganizationUpdateValid_QNAME, Period.class, ServiceUpdate.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPhysicalAddress }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "PhysicalAddresses",
          scope = ServiceUpdate.class)
  public JAXBElement<ArrayOfPhysicalAddress> createServiceUpdatePhysicalAddresses(
          ArrayOfPhysicalAddress value) {
    return new JAXBElement<>(
            _OrganizationUpdatePhysicalAddresses_QNAME,
            ArrayOfPhysicalAddress.class,
            ServiceUpdate.class,
            value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCode }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "Properties",
          scope = ServiceUpdate.class)
  public JAXBElement<ArrayOfCode> createServiceUpdateProperties(ArrayOfCode value) {
    return new JAXBElement<>(
            _ServiceProperties_QNAME, ArrayOfCode.class, ServiceUpdate.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "Type",
          scope = SearchResultFacetEntry.class)
  public JAXBElement<String> createSearchResultFacetEntryType(String value) {
    return new JAXBElement<>(
            _SearchResultFacetEntryType_QNAME, String.class, SearchResultFacetEntry.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "Text",
          scope = SearchResultFacetEntry.class)
  public JAXBElement<String> createSearchResultFacetEntryText(String value) {
    return new JAXBElement<>(
            _SearchResultFacetEntryText_QNAME, String.class, SearchResultFacetEntry.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "Value",
          scope = SearchResultFacetEntry.class)
  public JAXBElement<String> createSearchResultFacetEntryValue(String value) {
    return new JAXBElement<>(
            _SearchResultFacetEntryValue_QNAME, String.class, SearchResultFacetEntry.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOrganization }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "GetOrganizationsHavingCodeResult",
          scope = GetOrganizationsHavingCodeResponse.class)
  public JAXBElement<ArrayOfOrganization>
  createGetOrganizationsHavingCodeResponseGetOrganizationsHavingCodeResult(
          ArrayOfOrganization value) {
    return new JAXBElement<>(
            _GetOrganizationsHavingCodeResponseGetOrganizationsHavingCodeResult_QNAME,
            ArrayOfOrganization.class,
            GetOrganizationsHavingCodeResponse.class,
            value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link OrganizationPerson }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "CreateOrganizationPersonResult",
          scope = CreateOrganizationPersonResponse.class)
  public JAXBElement<OrganizationPerson>
  createCreateOrganizationPersonResponseCreateOrganizationPersonResult(
          OrganizationPerson value) {
    return new JAXBElement<>(
            _CreateOrganizationPersonResponseCreateOrganizationPersonResult_QNAME,
            OrganizationPerson.class,
            CreateOrganizationPersonResponse.class,
            value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link CommunicationParty }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "GetCommunicationPartyDetailsResult",
          scope = GetCommunicationPartyDetailsResponse.class)
  public JAXBElement<CommunicationParty>
  createGetCommunicationPartyDetailsResponseGetCommunicationPartyDetailsResult(
          CommunicationParty value) {
    return new JAXBElement<>(
            _GetCommunicationPartyDetailsResponseGetCommunicationPartyDetailsResult_QNAME,
            CommunicationParty.class,
            GetCommunicationPartyDetailsResponse.class,
            value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "GetCertificateForValidatingSignatureResult",
          scope = GetCertificateForValidatingSignatureResponse.class)
  public JAXBElement<byte[]>
  createGetCertificateForValidatingSignatureResponseGetCertificateForValidatingSignatureResult(
          byte[] value) {
    return new JAXBElement<>(
            _GetCertificateForValidatingSignatureResponseGetCertificateForValidatingSignatureResult_QNAME,
            byte[].class,
            GetCertificateForValidatingSignatureResponse.class,
            value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Code }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "AddCustomAttributeResult",
          scope = AddCustomAttributeResponse.class)
  public JAXBElement<Code> createAddCustomAttributeResponseAddCustomAttributeResult(Code value) {
    return new JAXBElement<>(
            _AddCustomAttributeResponseAddCustomAttributeResult_QNAME,
            Code.class,
            AddCustomAttributeResponse.class,
            value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValuePairOfintArrayOfCodeUO9UWExd
   * }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "GetCustomAttributesResult",
          scope = GetCustomAttributesResponse.class)
  public JAXBElement<ArrayOfKeyValuePairOfintArrayOfCodeUO9UWExd>
  createGetCustomAttributesResponseGetCustomAttributesResult(
          ArrayOfKeyValuePairOfintArrayOfCodeUO9UWExd value) {
    return new JAXBElement<ArrayOfKeyValuePairOfintArrayOfCodeUO9UWExd>(
            _GetCustomAttributesResponseGetCustomAttributesResult_QNAME,
            ArrayOfKeyValuePairOfintArrayOfCodeUO9UWExd.class,
            GetCustomAttributesResponse.class,
            value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link CommunicationPartySearch }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "search",
          scope = Search.class)
  public JAXBElement<CommunicationPartySearch> createSearchSearch(CommunicationPartySearch value) {
    return new JAXBElement<CommunicationPartySearch>(
            _SearchSearch_QNAME, CommunicationPartySearch.class, Search.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "ssn",
          scope = GetGPCommunicationParty.class)
  public JAXBElement<String> createGetGPCommunicationPartySsn(String value) {
    return new JAXBElement<>(
            _GetGPCommunicationPartySsn_QNAME, String.class, GetGPCommunicationParty.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfElectronicAddress }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "ElectronicAddresses",
          scope = DepartmentCreate.class)
  public JAXBElement<ArrayOfElectronicAddress> createDepartmentCreateElectronicAddresses(
          ArrayOfElectronicAddress value) {
    return new JAXBElement<>(
            _OrganizationUpdateElectronicAddresses_QNAME,
            ArrayOfElectronicAddress.class,
            DepartmentCreate.class,
            value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Period }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "Valid",
          scope = DepartmentCreate.class)
  public JAXBElement<Period> createDepartmentCreateValid(Period value) {
    return new JAXBElement<>(
            _OrganizationUpdateValid_QNAME, Period.class, DepartmentCreate.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Code }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "BusinessType",
          scope = DepartmentCreate.class)
  public JAXBElement<Code> createDepartmentCreateBusinessType(Code value) {
    return new JAXBElement<>(
            _OrganizationUpdateBusinessType_QNAME, Code.class, DepartmentCreate.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "DisplayName",
          scope = DepartmentCreate.class)
  public JAXBElement<String> createDepartmentCreateDisplayName(String value) {
    return new JAXBElement<>(
            _OrganizationUpdateDisplayName_QNAME, String.class, DepartmentCreate.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPhysicalAddress }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "PhysicalAddresses",
          scope = DepartmentCreate.class)
  public JAXBElement<ArrayOfPhysicalAddress> createDepartmentCreatePhysicalAddresses(
          ArrayOfPhysicalAddress value) {
    return new JAXBElement<>(
            _OrganizationUpdatePhysicalAddresses_QNAME,
            ArrayOfPhysicalAddress.class,
            DepartmentCreate.class,
            value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Service }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "CreateServiceResult",
          scope = CreateServiceResponse.class)
  public JAXBElement<Service> createCreateServiceResponseCreateServiceResult(Service value) {
    return new JAXBElement<Service>(
            _CreateServiceResponseCreateServiceResult_QNAME,
            Service.class,
            CreateServiceResponse.class,
            value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "GetCertificateForValidatingSignatureByOrganizationNumberResult",
          scope = GetCertificateForValidatingSignatureByOrganizationNumberResponse.class)
  public JAXBElement<byte[]>
  createGetCertificateForValidatingSignatureByOrganizationNumberResponseGetCertificateForValidatingSignatureByOrganizationNumberResult(
          byte[] value) {
    return new JAXBElement<>(
            _GetCertificateForValidatingSignatureByOrganizationNumberResponseGetCertificateForValidatingSignatureByOrganizationNumberResult_QNAME,
            byte[].class,
            GetCertificateForValidatingSignatureByOrganizationNumberResponse.class,
            value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValuePairOfstringstring
   * }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "SearchConstraints",
          scope = CommunicationPartySearch.class)
  public JAXBElement<ArrayOfKeyValuePairOfstringstring>
  createCommunicationPartySearchSearchConstraints(ArrayOfKeyValuePairOfstringstring value) {
    return new JAXBElement<>(
            _CommunicationPartySearchSearchConstraints_QNAME,
            ArrayOfKeyValuePairOfstringstring.class,
            CommunicationPartySearch.class,
            value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCode }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "IndustryCodes",
          scope = Department.class)
  public JAXBElement<ArrayOfCode> createDepartmentIndustryCodes(ArrayOfCode value) {
    return new JAXBElement<>(
            _DepartmentIndustryCodes_QNAME, ArrayOfCode.class, Department.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Code }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "BusinessType",
          scope = Department.class)
  public JAXBElement<Code> createDepartmentBusinessType(Code value) {
    return new JAXBElement<>(
            _OrganizationUpdateBusinessType_QNAME, Code.class, Department.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOrganizationPerson }{@code
   * >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "People",
          scope = Department.class)
  public JAXBElement<ArrayOfOrganizationPerson> createDepartmentPeople(
          ArrayOfOrganizationPerson value) {
    return new JAXBElement<ArrayOfOrganizationPerson>(
            _DepartmentPeople_QNAME, ArrayOfOrganizationPerson.class, Department.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "GetAllHFCommpartiesCsvResult",
          scope = GetAllHFCommpartiesCsvResponse.class)
  public JAXBElement<String> createGetAllHFCommpartiesCsvResponseGetAllHFCommpartiesCsvResult(
          String value) {
    return new JAXBElement<>(
            _GetAllHFCommpartiesCsvResponseGetAllHFCommpartiesCsvResult_QNAME,
            String.class,
            GetAllHFCommpartiesCsvResponse.class,
            value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "ldapUrl",
          scope = GetCertificateForValidatingSignatureLdap.class)
  public JAXBElement<String> createGetCertificateForValidatingSignatureLdapLdapUrl(String value) {
    return new JAXBElement<>(
            _GetCertificateForValidatingSignatureLdapLdapUrl_QNAME,
            String.class,
            GetCertificateForValidatingSignatureLdap.class,
            value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link OrganizationPersonCreate }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "p",
          scope = CreateOrganizationPerson.class)
  public JAXBElement<OrganizationPersonCreate> createCreateOrganizationPersonP(
          OrganizationPersonCreate value) {
    return new JAXBElement<OrganizationPersonCreate>(
            _CreateOrganizationPersonP_QNAME,
            OrganizationPersonCreate.class,
            CreateOrganizationPerson.class,
            value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Service }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "GetServiceDetailsResult",
          scope = GetServiceDetailsResponse.class)
  public JAXBElement<Service> createGetServiceDetailsResponseGetServiceDetailsResult(
          Service value) {
    return new JAXBElement<Service>(
            _GetServiceDetailsResponseGetServiceDetailsResult_QNAME,
            Service.class,
            GetServiceDetailsResponse.class,
            value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link CertificateDetails }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "GetCertificateDetailsForEncryptionResult",
          scope = GetCertificateDetailsForEncryptionResponse.class)
  public JAXBElement<CertificateDetails>
  createGetCertificateDetailsForEncryptionResponseGetCertificateDetailsForEncryptionResult(
          CertificateDetails value) {
    return new JAXBElement<>(
            _GetCertificateDetailsForEncryptionResponseGetCertificateDetailsForEncryptionResult_QNAME,
            CertificateDetails.class,
            GetCertificateDetailsForEncryptionResponse.class,
            value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfElectronicAddress }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "ElectronicAddresses",
          scope = OrganizationPersonCreate.class)
  public JAXBElement<ArrayOfElectronicAddress> createOrganizationPersonCreateElectronicAddresses(
          ArrayOfElectronicAddress value) {
    return new JAXBElement<>(
            _OrganizationUpdateElectronicAddresses_QNAME,
            ArrayOfElectronicAddress.class,
            OrganizationPersonCreate.class,
            value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "HprNumber",
          scope = OrganizationPersonCreate.class)
  public JAXBElement<String> createOrganizationPersonCreateHprNumber(String value) {
    return new JAXBElement<>(
            _OrganizationPersonCreateHprNumber_QNAME,
            String.class,
            OrganizationPersonCreate.class,
            value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Period }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "Valid",
          scope = OrganizationPersonCreate.class)
  public JAXBElement<Period> createOrganizationPersonCreateValid(Period value) {
    return new JAXBElement<>(
            _OrganizationUpdateValid_QNAME, Period.class, OrganizationPersonCreate.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "Specialities",
          scope = OrganizationPersonCreate.class)
  public JAXBElement<ArrayOfstring> createOrganizationPersonCreateSpecialities(
          ArrayOfstring value) {
    return new JAXBElement<>(
            _OrganizationPersonCreateSpecialities_QNAME,
            ArrayOfstring.class,
            OrganizationPersonCreate.class,
            value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "Title",
          scope = OrganizationPersonCreate.class)
  public JAXBElement<String> createOrganizationPersonCreateTitle(String value) {
    return new JAXBElement<>(
            _OrganizationPersonCreateTitle_QNAME, String.class, OrganizationPersonCreate.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPhysicalAddress }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "PhysicalAddresses",
          scope = OrganizationPersonCreate.class)
  public JAXBElement<ArrayOfPhysicalAddress> createOrganizationPersonCreatePhysicalAddresses(
          ArrayOfPhysicalAddress value) {
    return new JAXBElement<>(
            _OrganizationUpdatePhysicalAddresses_QNAME,
            ArrayOfPhysicalAddress.class,
            OrganizationPersonCreate.class,
            value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "Professions",
          scope = OrganizationPersonCreate.class)
  public JAXBElement<ArrayOfstring> createOrganizationPersonCreateProfessions(ArrayOfstring value) {
    return new JAXBElement<>(
            _OrganizationPersonCreateProfessions_QNAME,
            ArrayOfstring.class,
            OrganizationPersonCreate.class,
            value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCode }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "Properties",
          scope = OrganizationPersonCreate.class)
  public JAXBElement<ArrayOfCode> createOrganizationPersonCreateProperties(ArrayOfCode value) {
    return new JAXBElement<>(
            _ServiceProperties_QNAME, ArrayOfCode.class, OrganizationPersonCreate.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link CommunicationParty }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "GetGPCommunicationPartyResult",
          scope = GetGPCommunicationPartyResponse.class)
  public JAXBElement<CommunicationParty>
  createGetGPCommunicationPartyResponseGetGPCommunicationPartyResult(CommunicationParty value) {
    return new JAXBElement<>(
            _GetGPCommunicationPartyResponseGetGPCommunicationPartyResult_QNAME,
            CommunicationParty.class,
            GetGPCommunicationPartyResponse.class,
            value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link OrganizationUpdateStatistics }{@code
   * >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "GetOrganizationUpdateStatisticsResult",
          scope = GetOrganizationUpdateStatisticsResponse.class)
  public JAXBElement<OrganizationUpdateStatistics>
  createGetOrganizationUpdateStatisticsResponseGetOrganizationUpdateStatisticsResult(
          OrganizationUpdateStatistics value) {
    return new JAXBElement<OrganizationUpdateStatistics>(
            _GetOrganizationUpdateStatisticsResponseGetOrganizationUpdateStatisticsResult_QNAME,
            OrganizationUpdateStatistics.class,
            GetOrganizationUpdateStatisticsResponse.class,
            value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOrganization }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "GetAssosiatedIKSChildOrganizationsResult",
          scope = GetAssosiatedIKSChildOrganizationsResponse.class)
  public JAXBElement<ArrayOfOrganization>
  createGetAssosiatedIKSChildOrganizationsResponseGetAssosiatedIKSChildOrganizationsResult(
          ArrayOfOrganization value) {
    return new JAXBElement<>(
            _GetAssosiatedIKSChildOrganizationsResponseGetAssosiatedIKSChildOrganizationsResult_QNAME,
            ArrayOfOrganization.class,
            GetAssosiatedIKSChildOrganizationsResponse.class,
            value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Period }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "period",
          scope = SetCommunicationPartyValid.class)
  public JAXBElement<Period> createSetCommunicationPartyValidPeriod(Period value) {
    return new JAXBElement<>(
            _SetCommunicationPartyValidPeriod_QNAME,
            Period.class,
            SetCommunicationPartyValid.class,
            value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/Common",
          name = "Message",
          scope = GenericFault.class)
  public JAXBElement<String> createGenericFaultMessage(String value) {
    return new JAXBElement<>(
            _ValidationErrorMessage_QNAME, String.class, GenericFault.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/Common",
          name = "ErrorCode",
          scope = GenericFault.class)
  public JAXBElement<String> createGenericFaultErrorCode(String value) {
    return new JAXBElement<>(
            _GenericFaultErrorCode_QNAME, String.class, GenericFault.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Organization }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "GetOrganizationDetailsResult",
          scope = GetOrganizationDetailsResponse.class)
  public JAXBElement<Organization> createGetOrganizationDetailsResponseGetOrganizationDetailsResult(
          Organization value) {
    return new JAXBElement<Organization>(
            _GetOrganizationDetailsResponseGetOrganizationDetailsResult_QNAME,
            Organization.class,
            GetOrganizationDetailsResponse.class,
            value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "GetCertificateResult",
          scope = GetCertificateResponse.class)
  public JAXBElement<byte[]> createGetCertificateResponseGetCertificateResult(byte[] value) {
    return new JAXBElement<>(
            _GetCertificateResponseGetCertificateResult_QNAME,
            byte[].class,
            GetCertificateResponse.class,
            value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "BusinessType",
          scope = BusinessTypeStatistics.class)
  public JAXBElement<String> createBusinessTypeStatisticsBusinessType(String value) {
    return new JAXBElement<>(
            _OrganizationUpdateBusinessType_QNAME, String.class, BusinessTypeStatistics.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDepartment }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "Departments",
          scope = OrganizationPerson.class)
  public JAXBElement<ArrayOfDepartment> createOrganizationPersonDepartments(
          ArrayOfDepartment value) {
    return new JAXBElement<>(
            _OrganizationPersonDepartments_QNAME,
            ArrayOfDepartment.class,
            OrganizationPerson.class,
            value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOrganization }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "Organizations",
          scope = OrganizationPerson.class)
  public JAXBElement<ArrayOfOrganization> createOrganizationPersonOrganizations(
          ArrayOfOrganization value) {
    return new JAXBElement<>(
            _OrganizationPersonOrganizations_QNAME,
            ArrayOfOrganization.class,
            OrganizationPerson.class,
            value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "Title",
          scope = OrganizationPerson.class)
  public JAXBElement<String> createOrganizationPersonTitle(String value) {
    return new JAXBElement<>(
            _OrganizationPersonCreateTitle_QNAME, String.class, OrganizationPerson.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCode }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "Properties",
          scope = OrganizationPerson.class)
  public JAXBElement<ArrayOfCode> createOrganizationPersonProperties(ArrayOfCode value) {
    return new JAXBElement<>(
            _ServiceProperties_QNAME, ArrayOfCode.class, OrganizationPerson.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Person }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "Person",
          scope = OrganizationPerson.class)
  public JAXBElement<Person> createOrganizationPersonPerson(Person value) {
    return new JAXBElement<Person>(
            _OrganizationPersonPerson_QNAME, Person.class, OrganizationPerson.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Code }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/HPR",
          name = "Type",
          scope = SpecialCompetence.class)
  public JAXBElement<Code> createSpecialCompetenceType(Code value) {
    return new JAXBElement<>(
            _SpecialCompetenceType_QNAME, Code.class, SpecialCompetence.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Period }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/HPR",
          name = "Valid",
          scope = SpecialCompetence.class)
  public JAXBElement<Period> createSpecialCompetenceValid(Period value) {
    return new JAXBElement<>(
            _SpecialCompetenceValid_QNAME, Period.class, SpecialCompetence.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "ldapUrl",
          scope = GetCertificate.class)
  public JAXBElement<String> createGetCertificateLdapUrl(String value) {
    return new JAXBElement<>(
            _GetCertificateForValidatingSignatureLdapLdapUrl_QNAME,
            String.class,
            GetCertificate.class,
            value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Code }{@code >}}
   */
  @XmlElementDecl(namespace = "http://register.nhn.no/HPR", name = "Type", scope = Speciality.class)
  public JAXBElement<Code> createSpecialityType(Code value) {
    return new JAXBElement<>(_SpecialCompetenceType_QNAME, Code.class, Speciality.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Period }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/HPR",
          name = "Valid",
          scope = Speciality.class)
  public JAXBElement<Period> createSpecialityValid(Period value) {
    return new JAXBElement<>(
            _SpecialCompetenceValid_QNAME, Period.class, Speciality.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfValidationError }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/Common",
          name = "Errors",
          scope = ValidationFault.class)
  public JAXBElement<ArrayOfValidationError> createValidationFaultErrors(
          ArrayOfValidationError value) {
    return new JAXBElement<>(
            _ValidationFaultErrors_QNAME, ArrayOfValidationError.class, ValidationFault.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBusinessTypeStatistics }{@code
   * >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "BusinessTypeStatistics",
          scope = CommunicationPartyStatistics.class)
  public JAXBElement<ArrayOfBusinessTypeStatistics>
  createCommunicationPartyStatisticsBusinessTypeStatistics(
          ArrayOfBusinessTypeStatistics value) {
    return new JAXBElement<ArrayOfBusinessTypeStatistics>(
            _BusinessTypeStatistics_QNAME,
            ArrayOfBusinessTypeStatistics.class,
            CommunicationPartyStatistics.class,
            value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUpdateStatistic }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "Statistics",
          scope = OrganizationUpdateStatistics.class)
  public JAXBElement<ArrayOfUpdateStatistic> createOrganizationUpdateStatisticsStatistics(
          ArrayOfUpdateStatistic value) {
    return new JAXBElement<ArrayOfUpdateStatistic>(
            _OrganizationUpdateStatisticsStatistics_QNAME,
            ArrayOfUpdateStatistic.class,
            OrganizationUpdateStatistics.class,
            value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link OrganizationCreate }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "org",
          scope = CreateOrganization.class)
  public JAXBElement<OrganizationCreate> createCreateOrganizationOrg(OrganizationCreate value) {
    return new JAXBElement<>(
            _UpdateDepartmentDetailsOrg_QNAME,
            OrganizationCreate.class,
            CreateOrganization.class,
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
    return new JAXBElement<>(_CodeSimpleType_QNAME, String.class, Code.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/Common",
          name = "CodeText",
          scope = Code.class)
  public JAXBElement<String> createCodeCodeText(String value) {
    return new JAXBElement<>(_CodeCodeText_QNAME, String.class, Code.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/Common",
          name = "CodeValue",
          scope = Code.class)
  public JAXBElement<String> createCodeCodeValue(String value) {
    return new JAXBElement<>(_CodeCodeValue_QNAME, String.class, Code.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link OrganizationPersonUpdate }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "p",
          scope = UpdateOrganizationPersonDetails.class)
  public JAXBElement<OrganizationPersonUpdate> createUpdateOrganizationPersonDetailsP(
          OrganizationPersonUpdate value) {
    return new JAXBElement<>(
            _CreateOrganizationPersonP_QNAME,
            OrganizationPersonUpdate.class,
            UpdateOrganizationPersonDetails.class,
            value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link CommunicationPartyStatistics }{@code
   * >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "GetCommunicationPartyStatisticsResult",
          scope = GetCommunicationPartyStatisticsResponse.class)
  public JAXBElement<CommunicationPartyStatistics>
  createGetCommunicationPartyStatisticsResponseGetCommunicationPartyStatisticsResult(
          CommunicationPartyStatistics value) {
    return new JAXBElement<>(
            _GetCommunicationPartyStatisticsResponseGetCommunicationPartyStatisticsResult_QNAME,
            CommunicationPartyStatistics.class,
            GetCommunicationPartyStatisticsResponse.class,
            value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Code }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/HPR",
          name = "Type",
          scope = Requisition.class)
  public JAXBElement<Code> createRequisitionType(Code value) {
    return new JAXBElement<>(
            _SpecialCompetenceType_QNAME, Code.class, Requisition.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Period }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/HPR",
          name = "Valid",
          scope = Requisition.class)
  public JAXBElement<Period> createRequisitionValid(Period value) {
    return new JAXBElement<>(
            _SpecialCompetenceValid_QNAME, Period.class, Requisition.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Department }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "GetDepartmentDetailsResult",
          scope = GetDepartmentDetailsResponse.class)
  public JAXBElement<Department> createGetDepartmentDetailsResponseGetDepartmentDetailsResult(
          Department value) {
    return new JAXBElement<>(
            _GetDepartmentDetailsResponseGetDepartmentDetailsResult_QNAME,
            Department.class,
            GetDepartmentDetailsResponse.class,
            value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "Username",
          scope = UpdateStatistic.class)
  public JAXBElement<String> createUpdateStatisticUsername(String value) {
    return new JAXBElement<>(
            _UpdateStatisticUsername_QNAME, String.class, UpdateStatistic.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "DisplayName",
          scope = UpdateStatistic.class)
  public JAXBElement<String> createUpdateStatisticDisplayName(String value) {
    return new JAXBElement<>(
            _OrganizationUpdateDisplayName_QNAME, String.class, UpdateStatistic.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "IPAddress",
          scope = UpdateStatistic.class)
  public JAXBElement<String> createUpdateStatisticIPAddress(String value) {
    return new JAXBElement<>(
            _UpdateStatisticIPAddress_QNAME, String.class, UpdateStatistic.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link OrganizationUpdate }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "org",
          scope = UpdateOrganizationDetails.class)
  public JAXBElement<OrganizationUpdate> createUpdateOrganizationDetailsOrg(
          OrganizationUpdate value) {
    return new JAXBElement<>(
            _UpdateDepartmentDetailsOrg_QNAME,
            OrganizationUpdate.class,
            UpdateOrganizationDetails.class,
            value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Code }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "Municipality",
          scope = CommunicationParty.class)
  public JAXBElement<Code> createCommunicationPartyMunicipality(Code value) {
    return new JAXBElement<>(
            _CommunicationPartyMunicipality_QNAME, Code.class, CommunicationParty.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Code }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "ParentBusinessType",
          scope = CommunicationParty.class)
  public JAXBElement<Code> createCommunicationPartyParentBusinessType(Code value) {
    return new JAXBElement<>(
            _CommunicationPartyParentBusinessType_QNAME, Code.class, CommunicationParty.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfElectronicAddress }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "ElectronicAddresses",
          scope = CommunicationParty.class)
  public JAXBElement<ArrayOfElectronicAddress> createCommunicationPartyElectronicAddresses(
          ArrayOfElectronicAddress value) {
    return new JAXBElement<>(
            _OrganizationUpdateElectronicAddresses_QNAME,
            ArrayOfElectronicAddress.class,
            CommunicationParty.class,
            value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Period }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "Valid",
          scope = CommunicationParty.class)
  public JAXBElement<Period> createCommunicationPartyValid(Period value) {
    return new JAXBElement<>(
            _OrganizationUpdateValid_QNAME, Period.class, CommunicationParty.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "DisplayName",
          scope = CommunicationParty.class)
  public JAXBElement<String> createCommunicationPartyDisplayName(String value) {
    return new JAXBElement<>(
            _OrganizationUpdateDisplayName_QNAME, String.class, CommunicationParty.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "Name",
          scope = CommunicationParty.class)
  public JAXBElement<String> createCommunicationPartyName(String value) {
    return new JAXBElement<>(
            _CommunicationPartyName_QNAME, String.class, CommunicationParty.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPhysicalAddress }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "PhysicalAddresses",
          scope = CommunicationParty.class)
  public JAXBElement<ArrayOfPhysicalAddress> createCommunicationPartyPhysicalAddresses(
          ArrayOfPhysicalAddress value) {
    return new JAXBElement<>(
            _OrganizationUpdatePhysicalAddresses_QNAME,
            ArrayOfPhysicalAddress.class,
            CommunicationParty.class,
            value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "ParentName",
          scope = CommunicationParty.class)
  public JAXBElement<String> createCommunicationPartyParentName(String value) {
    return new JAXBElement<>(
            _CommunicationPartyParentName_QNAME, String.class, CommunicationParty.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "GetCertificateForEncryptionResult",
          scope = GetCertificateForEncryptionResponse.class)
  public JAXBElement<byte[]>
  createGetCertificateForEncryptionResponseGetCertificateForEncryptionResult(byte[] value) {
    return new JAXBElement<>(
            _GetCertificateForEncryptionResponseGetCertificateForEncryptionResult_QNAME,
            byte[].class,
            GetCertificateForEncryptionResponse.class,
            value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "ou",
          scope = SearchCertificatesForEncryption.class)
  public JAXBElement<String> createSearchCertificatesForEncryptionOu(String value) {
    return new JAXBElement<>(
            _SearchCertificatesForValidatingSignatureOu_QNAME,
            String.class,
            SearchCertificatesForEncryption.class,
            value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "sn",
          scope = SearchCertificatesForEncryption.class)
  public JAXBElement<String> createSearchCertificatesForEncryptionSn(String value) {
    return new JAXBElement<>(
            _SearchCertificatesForValidatingSignatureSn_QNAME,
            String.class,
            SearchCertificatesForEncryption.class,
            value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "cn",
          scope = SearchCertificatesForEncryption.class)
  public JAXBElement<String> createSearchCertificatesForEncryptionCn(String value) {
    return new JAXBElement<>(
            _SearchCertificatesForValidatingSignatureCn_QNAME,
            String.class,
            SearchCertificatesForEncryption.class,
            value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "transportType",
          scope = EnableTransportOnOrganization.class)
  public JAXBElement<String> createEnableTransportOnOrganizationTransportType(String value) {
    return new JAXBElement<>(
            _EnableTransportOnOrganizationTransportType_QNAME,
            String.class,
            EnableTransportOnOrganization.class,
            value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link OrganizationPerson }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "GetOrganizationPersonDetailsResult",
          scope = GetOrganizationPersonDetailsResponse.class)
  public JAXBElement<OrganizationPerson>
  createGetOrganizationPersonDetailsResponseGetOrganizationPersonDetailsResult(
          OrganizationPerson value) {
    return new JAXBElement<>(
            _GetOrganizationPersonDetailsResponseGetOrganizationPersonDetailsResult_QNAME,
            OrganizationPerson.class,
            GetOrganizationPersonDetailsResponse.class,
            value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CertificateDetails",
          name = "LdapUrl",
          scope = CertificateDetails.class)
  public JAXBElement<String> createCertificateDetailsLdapUrl(String value) {
    return new JAXBElement<>(
            _CertificateDetailsLdapUrl_QNAME, String.class, CertificateDetails.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CertificateDetails",
          name = "Certificate",
          scope = CertificateDetails.class)
  public JAXBElement<byte[]> createCertificateDetailsCertificate(byte[] value) {
    return new JAXBElement<>(
            _CertificateDetailsCertificate_QNAME, byte[].class, CertificateDetails.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "id",
          scope = SearchById.class)
  public JAXBElement<String> createSearchByIdId(String value) {
    return new JAXBElement<>(_SearchByIdId_QNAME, String.class, SearchById.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "GetCertificateForEncryptionByOrganizationNumberResult",
          scope = GetCertificateForEncryptionByOrganizationNumberResponse.class)
  public JAXBElement<byte[]>
  createGetCertificateForEncryptionByOrganizationNumberResponseGetCertificateForEncryptionByOrganizationNumberResult(
          byte[] value) {
    return new JAXBElement<>(
            _GetCertificateForEncryptionByOrganizationNumberResponseGetCertificateForEncryptionByOrganizationNumberResult_QNAME,
            byte[].class,
            GetCertificateForEncryptionByOrganizationNumberResponse.class,
            value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "Description",
          scope = ServiceCreate.class)
  public JAXBElement<String> createServiceCreateDescription(String value) {
    return new JAXBElement<>(
            _ServiceDescription_QNAME, String.class, ServiceCreate.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Code }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "ServiceCode",
          scope = ServiceCreate.class)
  public JAXBElement<Code> createServiceCreateServiceCode(Code value) {
    return new JAXBElement<>(
            _ServiceCreateServiceCode_QNAME, Code.class, ServiceCreate.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfElectronicAddress }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "ElectronicAddresses",
          scope = ServiceCreate.class)
  public JAXBElement<ArrayOfElectronicAddress> createServiceCreateElectronicAddresses(
          ArrayOfElectronicAddress value) {
    return new JAXBElement<>(
            _OrganizationUpdateElectronicAddresses_QNAME,
            ArrayOfElectronicAddress.class,
            ServiceCreate.class,
            value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "LocationDescription",
          scope = ServiceCreate.class)
  public JAXBElement<String> createServiceCreateLocationDescription(String value) {
    return new JAXBElement<>(
            _ServiceLocationDescription_QNAME, String.class, ServiceCreate.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Period }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "Valid",
          scope = ServiceCreate.class)
  public JAXBElement<Period> createServiceCreateValid(Period value) {
    return new JAXBElement<>(
            _OrganizationUpdateValid_QNAME, Period.class, ServiceCreate.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPhysicalAddress }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "PhysicalAddresses",
          scope = ServiceCreate.class)
  public JAXBElement<ArrayOfPhysicalAddress> createServiceCreatePhysicalAddresses(
          ArrayOfPhysicalAddress value) {
    return new JAXBElement<>(
            _OrganizationUpdatePhysicalAddresses_QNAME,
            ArrayOfPhysicalAddress.class,
            ServiceCreate.class,
            value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCode }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "Properties",
          scope = ServiceCreate.class)
  public JAXBElement<ArrayOfCode> createServiceCreateProperties(ArrayOfCode value) {
    return new JAXBElement<>(
            _ServiceProperties_QNAME, ArrayOfCode.class, ServiceCreate.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSearchResultFacetEntry }{@code
   * >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "Entries",
          scope = SearchFacet.class)
  public JAXBElement<ArrayOfSearchResultFacetEntry> createSearchFacetEntries(
          ArrayOfSearchResultFacetEntry value) {
    return new JAXBElement<ArrayOfSearchResultFacetEntry>(
            _SearchFacetEntries_QNAME, ArrayOfSearchResultFacetEntry.class, SearchFacet.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "CodeValue",
          scope = SearchFacet.class)
  public JAXBElement<String> createSearchFacetCodeValue(String value) {
    return new JAXBElement<>(
            _SearchFacetCodeValue_QNAME, String.class, SearchFacet.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "Name",
          scope = SearchFacet.class)
  public JAXBElement<String> createSearchFacetName(String value) {
    return new JAXBElement<>(
            _CommunicationPartyName_QNAME, String.class, SearchFacet.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCertificateDetails }{@code
   * >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "SearchCertificatesForEncryptionResult",
          scope = SearchCertificatesForEncryptionResponse.class)
  public JAXBElement<ArrayOfCertificateDetails>
  createSearchCertificatesForEncryptionResponseSearchCertificatesForEncryptionResult(
          ArrayOfCertificateDetails value) {
    return new JAXBElement<>(
            _SearchCertificatesForEncryptionResponseSearchCertificatesForEncryptionResult_QNAME,
            ArrayOfCertificateDetails.class,
            SearchCertificatesForEncryptionResponse.class,
            value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAuthorization }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/HPR",
          name = "Authorizations",
          scope = HPRInformation.class)
  public JAXBElement<ArrayOfAuthorization> createHPRInformationAuthorizations(
          ArrayOfAuthorization value) {
    return new JAXBElement<>(
            _HPRInformationAuthorizations_QNAME,
            ArrayOfAuthorization.class,
            HPRInformation.class,
            value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSpecialCompetence }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/HPR",
          name = "SpecialCompetences",
          scope = HPRInformation.class)
  public JAXBElement<ArrayOfSpecialCompetence> createHPRInformationSpecialCompetences(
          ArrayOfSpecialCompetence value) {
    return new JAXBElement<>(
            _HPRInformationSpecialCompetences_QNAME,
            ArrayOfSpecialCompetence.class,
            HPRInformation.class,
            value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/HPR",
          name = "HPRNo",
          scope = HPRInformation.class)
  public JAXBElement<String> createHPRInformationHPRNo(String value) {
    return new JAXBElement<>(
            _HPRInformationHPRNo_QNAME, String.class, HPRInformation.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOrganization }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "GetOrganizationsOwnedByResult",
          scope = GetOrganizationsOwnedByResponse.class)
  public JAXBElement<ArrayOfOrganization>
  createGetOrganizationsOwnedByResponseGetOrganizationsOwnedByResult(
          ArrayOfOrganization value) {
    return new JAXBElement<>(
            _GetOrganizationsOwnedByResponseGetOrganizationsOwnedByResult_QNAME,
            ArrayOfOrganization.class,
            GetOrganizationsOwnedByResponse.class,
            value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDepartment }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "Departments",
          scope = Organization.class)
  public JAXBElement<ArrayOfDepartment> createOrganizationDepartments(ArrayOfDepartment value) {
    return new JAXBElement<>(
            _OrganizationPersonDepartments_QNAME, ArrayOfDepartment.class, Organization.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfService }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "Services",
          scope = Organization.class)
  public JAXBElement<ArrayOfService> createOrganizationServices(ArrayOfService value) {
    return new JAXBElement<>(
            _OrganizationServices_QNAME, ArrayOfService.class, Organization.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCode }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "IndustryCodes",
          scope = Organization.class)
  public JAXBElement<ArrayOfCode> createOrganizationIndustryCodes(ArrayOfCode value) {
    return new JAXBElement<>(
            _DepartmentIndustryCodes_QNAME, ArrayOfCode.class, Organization.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Code }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "BusinessType",
          scope = Organization.class)
  public JAXBElement<Code> createOrganizationBusinessType(Code value) {
    return new JAXBElement<>(
            _OrganizationUpdateBusinessType_QNAME, Code.class, Organization.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOrganizationPerson }{@code
   * >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "People",
          scope = Organization.class)
  public JAXBElement<ArrayOfOrganizationPerson> createOrganizationPeople(
          ArrayOfOrganizationPerson value) {
    return new JAXBElement<ArrayOfOrganizationPerson>(
            _DepartmentPeople_QNAME, ArrayOfOrganizationPerson.class, Organization.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCode }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "Properties",
          scope = Organization.class)
  public JAXBElement<ArrayOfCode> createOrganizationProperties(ArrayOfCode value) {
    return new JAXBElement<>(
            _ServiceProperties_QNAME, ArrayOfCode.class, Organization.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/HPR",
          name = "FirstName",
          scope = Person.class)
  public JAXBElement<String> createPersonFirstName(String value) {
    return new JAXBElement<>(_PersonFirstName_QNAME, String.class, Person.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Code }{@code >}}
   */
  @XmlElementDecl(namespace = "http://register.nhn.no/HPR", name = "Sex", scope = Person.class)
  public JAXBElement<Code> createPersonSex(Code value) {
    return new JAXBElement<>(_PersonSex_QNAME, Code.class, Person.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link CitizenId }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/HPR",
          name = "CitizenId",
          scope = Person.class)
  public JAXBElement<CitizenId> createPersonCitizenId(CitizenId value) {
    return new JAXBElement<CitizenId>(_PersonCitizenId_QNAME, CitizenId.class, Person.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link HPRInformation }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/HPR",
          name = "HPRInformation",
          scope = Person.class)
  public JAXBElement<HPRInformation> createPersonHPRInformation(HPRInformation value) {
    return new JAXBElement<HPRInformation>(
            _HPRInformation_QNAME, HPRInformation.class, Person.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://register.nhn.no/HPR", name = "LastName", scope = Person.class)
  public JAXBElement<String> createPersonLastName(String value) {
    return new JAXBElement<>(_PersonLastName_QNAME, String.class, Person.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/HPR",
          name = "MiddleName",
          scope = Person.class)
  public JAXBElement<String> createPersonMiddleName(String value) {
    return new JAXBElement<>(_PersonMiddleName_QNAME, String.class, Person.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "ldapUrl",
          scope = GetCertificateForEncryptionLdap.class)
  public JAXBElement<String> createGetCertificateForEncryptionLdapLdapUrl(String value) {
    return new JAXBElement<>(
            _GetCertificateForValidatingSignatureLdapLdapUrl_QNAME,
            String.class,
            GetCertificateForEncryptionLdap.class,
            value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Department }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "CreateDepartmentResult",
          scope = CreateDepartmentResponse.class)
  public JAXBElement<Department> createCreateDepartmentResponseCreateDepartmentResult(
          Department value) {
    return new JAXBElement<>(
            _CreateDepartmentResponseCreateDepartmentResult_QNAME,
            Department.class,
            CreateDepartmentResponse.class,
            value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Code }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "code",
          scope = RemoveCustomAttribute.class)
  public JAXBElement<Code> createRemoveCustomAttributeCode(Code value) {
    return new JAXBElement<>(
            _RemoveCustomAttributeCode_QNAME, Code.class, RemoveCustomAttribute.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Code }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "code",
          scope = GetOrganizationsHavingCode.class)
  public JAXBElement<Code> createGetOrganizationsHavingCodeCode(Code value) {
    return new JAXBElement<>(
            _RemoveCustomAttributeCode_QNAME, Code.class, GetOrganizationsHavingCode.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEntityLogEntry }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "GetChangeLogResult",
          scope = GetChangeLogResponse.class)
  public JAXBElement<ArrayOfEntityLogEntry> createGetChangeLogResponseGetChangeLogResult(
          ArrayOfEntityLogEntry value) {
    return new JAXBElement<>(
            _GetChangeLogResponseGetChangeLogResult_QNAME,
            ArrayOfEntityLogEntry.class,
            GetChangeLogResponse.class,
            value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link CertificateDetails }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "GetCertificateDetailsForValidatingSignatureResult",
          scope = GetCertificateDetailsForValidatingSignatureResponse.class)
  public JAXBElement<CertificateDetails>
  createGetCertificateDetailsForValidatingSignatureResponseGetCertificateDetailsForValidatingSignatureResult(
          CertificateDetails value) {
    return new JAXBElement<>(
            _GetCertificateDetailsForValidatingSignatureResponseGetCertificateDetailsForValidatingSignatureResult_QNAME,
            CertificateDetails.class,
            GetCertificateDetailsForValidatingSignatureResponse.class,
            value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link SearchResult }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "SearchResult",
          scope = SearchResponse.class)
  public JAXBElement<SearchResult> createSearchResponseSearchResult(SearchResult value) {
    return new JAXBElement<SearchResult>(
            _SearchResult_QNAME, SearchResult.class, SearchResponse.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCertificateDetails }{@code
   * >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "SearchCertificatesForValidatingSignatureResult",
          scope = SearchCertificatesForValidatingSignatureResponse.class)
  public JAXBElement<ArrayOfCertificateDetails>
  createSearchCertificatesForValidatingSignatureResponseSearchCertificatesForValidatingSignatureResult(
          ArrayOfCertificateDetails value) {
    return new JAXBElement<>(
            _SearchCertificatesForValidatingSignatureResponseSearchCertificatesForValidatingSignatureResult_QNAME,
            ArrayOfCertificateDetails.class,
            SearchCertificatesForValidatingSignatureResponse.class,
            value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "PingResult",
          scope = PingResponse.class)
  public JAXBElement<String> createPingResponsePingResult(String value) {
    return new JAXBElement<>(
            _PingResponsePingResult_QNAME, String.class, PingResponse.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOrganization }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "GetAssosiatedIKSParentOrganizationsResult",
          scope = GetAssosiatedIKSParentOrganizationsResponse.class)
  public JAXBElement<ArrayOfOrganization>
  createGetAssosiatedIKSParentOrganizationsResponseGetAssosiatedIKSParentOrganizationsResult(
          ArrayOfOrganization value) {
    return new JAXBElement<>(
            _GetAssosiatedIKSParentOrganizationsResponseGetAssosiatedIKSParentOrganizationsResult_QNAME,
            ArrayOfOrganization.class,
            GetAssosiatedIKSParentOrganizationsResponse.class,
            value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfElectronicAddress }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "ElectronicAddresses",
          scope = DepartmentUpdate.class)
  public JAXBElement<ArrayOfElectronicAddress> createDepartmentUpdateElectronicAddresses(
          ArrayOfElectronicAddress value) {
    return new JAXBElement<>(
            _OrganizationUpdateElectronicAddresses_QNAME,
            ArrayOfElectronicAddress.class,
            DepartmentUpdate.class,
            value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Period }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "Valid",
          scope = DepartmentUpdate.class)
  public JAXBElement<Period> createDepartmentUpdateValid(Period value) {
    return new JAXBElement<>(
            _OrganizationUpdateValid_QNAME, Period.class, DepartmentUpdate.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Code }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "BusinessType",
          scope = DepartmentUpdate.class)
  public JAXBElement<Code> createDepartmentUpdateBusinessType(Code value) {
    return new JAXBElement<>(
            _OrganizationUpdateBusinessType_QNAME, Code.class, DepartmentUpdate.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "DisplayName",
          scope = DepartmentUpdate.class)
  public JAXBElement<String> createDepartmentUpdateDisplayName(String value) {
    return new JAXBElement<>(
            _OrganizationUpdateDisplayName_QNAME, String.class, DepartmentUpdate.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPhysicalAddress }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "PhysicalAddresses",
          scope = DepartmentUpdate.class)
  public JAXBElement<ArrayOfPhysicalAddress> createDepartmentUpdatePhysicalAddresses(
          ArrayOfPhysicalAddress value) {
    return new JAXBElement<>(
            _OrganizationUpdatePhysicalAddresses_QNAME,
            ArrayOfPhysicalAddress.class,
            DepartmentUpdate.class,
            value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/Common",
          name = "TypeCodeValue",
          scope = PhysicalAddress.class)
  public JAXBElement<String> createPhysicalAddressTypeCodeValue(String value) {
    return new JAXBElement<>(
            _PhysicalAddressTypeCodeValue_QNAME, String.class, PhysicalAddress.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/Common",
          name = "StreetAddress",
          scope = PhysicalAddress.class)
  public JAXBElement<String> createPhysicalAddressStreetAddress(String value) {
    return new JAXBElement<>(
            _PhysicalAddressStreetAddress_QNAME, String.class, PhysicalAddress.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Code }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/Common",
          name = "Type",
          scope = PhysicalAddress.class)
  public JAXBElement<Code> createPhysicalAddressType(Code value) {
    return new JAXBElement<>(
            _PhysicalAddressType_QNAME, Code.class, PhysicalAddress.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/Common",
          name = "Description",
          scope = PhysicalAddress.class)
  public JAXBElement<String> createPhysicalAddressDescription(String value) {
    return new JAXBElement<>(
            _PhysicalAddressDescription_QNAME, String.class, PhysicalAddress.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Code }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/Common",
          name = "Country",
          scope = PhysicalAddress.class)
  public JAXBElement<Code> createPhysicalAddressCountry(Code value) {
    return new JAXBElement<>(
            _PhysicalAddressCountry_QNAME, Code.class, PhysicalAddress.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/Common",
          name = "City",
          scope = PhysicalAddress.class)
  public JAXBElement<String> createPhysicalAddressCity(String value) {
    return new JAXBElement<>(
            _PhysicalAddressCity_QNAME, String.class, PhysicalAddress.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/Common",
          name = "Postbox",
          scope = PhysicalAddress.class)
  public JAXBElement<String> createPhysicalAddressPostbox(String value) {
    return new JAXBElement<>(
            _PhysicalAddressPostbox_QNAME, String.class, PhysicalAddress.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Code }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/Common",
          name = "Sex",
          scope = CitizenId.class)
  public JAXBElement<Code> createCitizenIdSex(Code value) {
    return new JAXBElement<>(_CitizenIdSex_QNAME, Code.class, CitizenId.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://register.nhn.no/Common", name = "Id", scope = CitizenId.class)
  public JAXBElement<String> createCitizenIdId(String value) {
    return new JAXBElement<>(_CitizenIdId_QNAME, String.class, CitizenId.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Code }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "code",
          scope = AddCustomAttribute.class)
  public JAXBElement<Code> createAddCustomAttributeCode(Code value) {
    return new JAXBElement<>(
            _RemoveCustomAttributeCode_QNAME, Code.class, AddCustomAttribute.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "GetCertificateForEncryptionLdapResult",
          scope = GetCertificateForEncryptionLdapResponse.class)
  public JAXBElement<byte[]>
  createGetCertificateForEncryptionLdapResponseGetCertificateForEncryptionLdapResult(
          byte[] value) {
    return new JAXBElement<>(
            _GetCertificateForEncryptionLdapResponseGetCertificateForEncryptionLdapResult_QNAME,
            byte[].class,
            GetCertificateForEncryptionLdapResponse.class,
            value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Code }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/HPR",
          name = "Profession",
          scope = Authorization.class)
  public JAXBElement<Code> createAuthorizationProfession(Code value) {
    return new JAXBElement<>(
            _AuthorizationProfession_QNAME, Code.class, Authorization.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Code }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/HPR",
          name = "Type",
          scope = Authorization.class)
  public JAXBElement<Code> createAuthorizationType(Code value) {
    return new JAXBElement<>(
            _SpecialCompetenceType_QNAME, Code.class, Authorization.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Period }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/HPR",
          name = "Valid",
          scope = Authorization.class)
  public JAXBElement<Period> createAuthorizationValid(Period value) {
    return new JAXBElement<>(
            _SpecialCompetenceValid_QNAME, Period.class, Authorization.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSpeciality }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/HPR",
          name = "Specialities",
          scope = Authorization.class)
  public JAXBElement<ArrayOfSpeciality> createAuthorizationSpecialities(ArrayOfSpeciality value) {
    return new JAXBElement<>(
            _AuthorizationSpecialities_QNAME, ArrayOfSpeciality.class, Authorization.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Requisition }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/HPR",
          name = "Requisition",
          scope = Authorization.class)
  public JAXBElement<Requisition> createAuthorizationRequisition(Requisition value) {
    return new JAXBElement<>(
            _Requisition_QNAME, Requisition.class, Authorization.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/Common",
          name = "OldValue",
          scope = EntityLogEntryData.class)
  public JAXBElement<String> createEntityLogEntryDataOldValue(String value) {
    return new JAXBElement<>(
            _EntityLogEntryDataOldValue_QNAME, String.class, EntityLogEntryData.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/Common",
          name = "NewValue",
          scope = EntityLogEntryData.class)
  public JAXBElement<String> createEntityLogEntryDataNewValue(String value) {
    return new JAXBElement<>(
            _EntityLogEntryDataNewValue_QNAME, String.class, EntityLogEntryData.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/Common",
          name = "Name",
          scope = EntityLogEntryData.class)
  public JAXBElement<String> createEntityLogEntryDataName(String value) {
    return new JAXBElement<>(
            _EntityLogEntryDataName_QNAME, String.class, EntityLogEntryData.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEntityLogEntryData }{@code
   * >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/Common",
          name = "Changes",
          scope = EntityLogEntry.class)
  public JAXBElement<ArrayOfEntityLogEntryData> createEntityLogEntryChanges(
          ArrayOfEntityLogEntryData value) {
    return new JAXBElement<>(
            _EntityLogEntryChanges_QNAME, ArrayOfEntityLogEntryData.class, EntityLogEntry.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/Common",
          name = "ByUser",
          scope = EntityLogEntry.class)
  public JAXBElement<String> createEntityLogEntryByUser(String value) {
    return new JAXBElement<>(
            _EntityLogEntryByUser_QNAME, String.class, EntityLogEntry.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/Common",
          name = "Description",
          scope = EntityLogEntry.class)
  public JAXBElement<String> createEntityLogEntryDescription(String value) {
    return new JAXBElement<>(
            _PhysicalAddressDescription_QNAME, String.class, EntityLogEntry.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "herIds",
          scope = GetCustomAttributes.class)
  public JAXBElement<ArrayOfint> createGetCustomAttributesHerIds(ArrayOfint value) {
    return new JAXBElement<ArrayOfint>(
            _GetCustomAttributesHerIds_QNAME, ArrayOfint.class, GetCustomAttributes.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/Common",
          name = "TypeCodeValue",
          scope = ElectronicAddress.class)
  public JAXBElement<String> createElectronicAddressTypeCodeValue(String value) {
    return new JAXBElement<>(
            _PhysicalAddressTypeCodeValue_QNAME, String.class, ElectronicAddress.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Code }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/Common",
          name = "Type",
          scope = ElectronicAddress.class)
  public JAXBElement<Code> createElectronicAddressType(Code value) {
    return new JAXBElement<>(
            _PhysicalAddressType_QNAME, Code.class, ElectronicAddress.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/Common",
          name = "Address",
          scope = ElectronicAddress.class)
  public JAXBElement<String> createElectronicAddressAddress(String value) {
    return new JAXBElement<>(
            _ElectronicAddressAddress_QNAME, String.class, ElectronicAddress.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfElectronicAddress }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "ElectronicAddresses",
          scope = OrganizationPersonUpdate.class)
  public JAXBElement<ArrayOfElectronicAddress> createOrganizationPersonUpdateElectronicAddresses(
          ArrayOfElectronicAddress value) {
    return new JAXBElement<>(
            _OrganizationUpdateElectronicAddresses_QNAME,
            ArrayOfElectronicAddress.class,
            OrganizationPersonUpdate.class,
            value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Period }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "Valid",
          scope = OrganizationPersonUpdate.class)
  public JAXBElement<Period> createOrganizationPersonUpdateValid(Period value) {
    return new JAXBElement<>(
            _OrganizationUpdateValid_QNAME, Period.class, OrganizationPersonUpdate.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "Specialities",
          scope = OrganizationPersonUpdate.class)
  public JAXBElement<ArrayOfstring> createOrganizationPersonUpdateSpecialities(
          ArrayOfstring value) {
    return new JAXBElement<>(
            _OrganizationPersonCreateSpecialities_QNAME,
            ArrayOfstring.class,
            OrganizationPersonUpdate.class,
            value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "Title",
          scope = OrganizationPersonUpdate.class)
  public JAXBElement<String> createOrganizationPersonUpdateTitle(String value) {
    return new JAXBElement<>(
            _OrganizationPersonCreateTitle_QNAME, String.class, OrganizationPersonUpdate.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPhysicalAddress }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "PhysicalAddresses",
          scope = OrganizationPersonUpdate.class)
  public JAXBElement<ArrayOfPhysicalAddress> createOrganizationPersonUpdatePhysicalAddresses(
          ArrayOfPhysicalAddress value) {
    return new JAXBElement<>(
            _OrganizationUpdatePhysicalAddresses_QNAME,
            ArrayOfPhysicalAddress.class,
            OrganizationPersonUpdate.class,
            value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "Professions",
          scope = OrganizationPersonUpdate.class)
  public JAXBElement<ArrayOfstring> createOrganizationPersonUpdateProfessions(ArrayOfstring value) {
    return new JAXBElement<>(
            _OrganizationPersonCreateProfessions_QNAME,
            ArrayOfstring.class,
            OrganizationPersonUpdate.class,
            value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCode }{@code >}}
   */
  @XmlElementDecl(
          namespace = "http://register.nhn.no/CommunicationParty",
          name = "Properties",
          scope = OrganizationPersonUpdate.class)
  public JAXBElement<ArrayOfCode> createOrganizationPersonUpdateProperties(ArrayOfCode value) {
    return new JAXBElement<>(
            _ServiceProperties_QNAME, ArrayOfCode.class, OrganizationPersonUpdate.class, value);
  }
}
