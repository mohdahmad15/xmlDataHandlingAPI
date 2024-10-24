package com.datahandle.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import lombok.Data;
@Data
public class CredentialsDTO {

	@JacksonXmlProperty(localName = "Name")
    private String name;
}
