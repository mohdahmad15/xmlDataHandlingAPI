package com.datahandle.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import lombok.Data;


@Data
public class IlcPoc2 {

	 @JacksonXmlProperty(localName = "BeneficiaryLine1")
	    private String beneficiaryLine1;

	    @JacksonXmlProperty(localName = "BeneficiaryLine2")
	    private String beneficiaryLine2;

	    @JacksonXmlProperty(localName = "BeneficiaryLine3")
	    private String beneficiaryLine3;

	    @JacksonXmlProperty(localName = "BeneficiaryLine4")
	    private String beneficiaryLine4;

	    @JacksonXmlProperty(localName = "BeneficiaryLine5")
	    private String beneficiaryLine5;

	    @JacksonXmlProperty(localName = "ApplicantLine1")
	    private String applicantLine1;

	    @JacksonXmlProperty(localName = "ApplicantLine2")
	    private String applicantLine2;

	    @JacksonXmlProperty(localName = "ApplicantLine3")
	    private String applicantLine3;

	    @JacksonXmlProperty(localName = "ApplicantLine4")
	    private String applicantLine4;

	    @JacksonXmlProperty(localName = "ApplicantLine5")
	    private String applicantLine5;

	    @JacksonXmlProperty(localName = "ApplicantThirdPartyLine1")
	    private String applicantThirdPartyLine1;

	    @JacksonXmlProperty(localName = "ApplicantThirdPartyLine2")
	    private String applicantThirdPartyLine2;

	    @JacksonXmlProperty(localName = "ApplicantThirdPartyLine3")
	    private String applicantThirdPartyLine3;

	    @JacksonXmlProperty(localName = "ApplicantThirdPartyLine4")
	    private String applicantThirdPartyLine4;

	    @JacksonXmlProperty(localName = "ApplicantThirdPartyLine5")
	    private String applicantThirdPartyLine5;

	    @JacksonXmlProperty(localName = "PresentingBankLine1")
	    private String presentingBankLine1;

	    @JacksonXmlProperty(localName = "PresentingBankLine2")
	    private String presentingBankLine2;

	    @JacksonXmlProperty(localName = "PresentingBankLine3")
	    private String presentingBankLine3;

	    @JacksonXmlProperty(localName = "PresentingBankLine4")
	    private String presentingBankLine4;

	    @JacksonXmlProperty(localName = "PresentingBankLine5")
	    private String presentingBankLine5;

	    @JacksonXmlProperty(localName = "ManufacturerProducerOnCO")
	    private String manufacturerProducerOnCO;

	    @JacksonXmlProperty(localName = "ExporterOnCO")
	    private String exporterOnCO;

	    @JacksonXmlProperty(localName = "IssuerOfBLAWBTCNFCR")
	    private String issuerOfBLAWBTCNFCR;

	    @JacksonXmlProperty(localName = "CarrierAgentMasterNameOnTransportDocument")
	    private String carrierAgentMasterNameOnTransportDocument;

	    @JacksonXmlProperty(localName = "VesselNameAndIMONumber")
	    private String vesselNameAndIMONumber;

	    @JacksonXmlProperty(localName = "PartyResponsibleToHandleShipmentInKSAAgentAtDestination")
	    private String partyResponsibleToHandleShipmentInKSAAgentAtDestination;

	    @JacksonXmlProperty(localName = "ShipperInBLAWB")
	    private String shipperInBLAWB;

	    @JacksonXmlProperty(localName = "IssuerOfAppendedDeclarationToBLAWBCarrierAgent")
	    private String issuerOfAppendedDeclarationToBLAWBCarrierAgent;

	    @JacksonXmlProperty(localName = "OwnerOfTheVesselOwnerOfThePlaneOwnerOfTheTruck")
	    private String ownerOfTheVesselOwnerOfThePlaneOwnerOfTheTruck;

	    @JacksonXmlProperty(localName = "IssuerOfInsurancePolicy")
	    private String issuerOfInsurancePolicy;

	    @JacksonXmlProperty(localName = "InsuranceCoAgentInKSA")
	    private String insuranceCoAgentInKSA;

	    @JacksonXmlProperty(localName = "IssuerOfAnyOtherDocumentIssuedByThirdParty")
	    private String issuerOfAnyOtherDocumentIssuedByThirdParty;

	    @JacksonXmlProperty(localName = "PortOfLoading")
	    private String portOfLoading;

	    @JacksonXmlProperty(localName = "PortOfDischarge")
	    private String portOfDischarge;

	    @JacksonXmlProperty(localName = "PlaceOfLoading")
	    private String placeOfLoading;

	    @JacksonXmlProperty(localName = "PlaceOfDischarge")
	    private String placeOfDischarge;

	    @JacksonXmlProperty(localName = "GoodsOrigin")
	    private String goodsOrigin;

	    @JacksonXmlProperty(localName = "HSCode")
	    private String hSCode;

	    @JacksonXmlProperty(localName = "MasterReference")
	    private String masterReference;

	    @JacksonXmlProperty(localName = "EventReference")
	    private String eventReference;

	    @JacksonXmlProperty(localName = "BehalfOfBranch")
	    private String behalfOfBranch;

}