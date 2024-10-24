package com.datahandle.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import lombok.Data;
@Data
//@XmlAccessorType(XmlAccessType.FIELD)
public class CredentialsDTO {

	@JacksonXmlProperty(localName = "Name")
    private String name;
}
