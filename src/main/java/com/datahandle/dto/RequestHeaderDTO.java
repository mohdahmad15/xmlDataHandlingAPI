package com.datahandle.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import lombok.Data;

@Data
//@XmlAccessorType(XmlAccessType.FIELD)
public class RequestHeaderDTO {

	 @JacksonXmlProperty(localName = "Service")
	    private String service;

	    @JacksonXmlProperty(localName = "Operation")
	    private String operation;

	    @JacksonXmlProperty(localName = "Credentials")
	    private CredentialsDTO credentials;

	    @JacksonXmlProperty(localName = "ReplyFormat")
	    private String replyFormat;

	    @JacksonXmlProperty(localName = "TargetSystem")
	    private String targetSystem;

	    @JacksonXmlProperty(localName = "SourceSystem")
	    private String sourceSystem;

	    @JacksonXmlProperty(localName = "NoRepair")
	    private String noRepair;

	    @JacksonXmlProperty(localName = "NoOverride")
	    private String noOverride;

	    @JacksonXmlProperty(localName = "CorrelationId")
	    private String correlationId;

	    @JacksonXmlProperty(localName = "TransactionControl")
	    private String transactionControl;

	    @JacksonXmlProperty(localName = "CreationDate")
	    private String creationDate;
}
