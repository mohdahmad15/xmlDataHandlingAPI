package com.datahandle.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import lombok.Data;

@Data
@XmlRootElement(name = "ServiceRequest", namespace = "urn:control.services.tiplus2.misys.com")
@XmlAccessorType(XmlAccessType.FIELD)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ServiceRequestDTO {

	@JacksonXmlProperty(localName = "RequestHeader")
    private RequestHeaderDTO requestHeader;

    @JacksonXmlProperty(localName = "ilc-poc2")
    private IlcPoc2 ilcPoc2;
}
