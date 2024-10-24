package com.datahandle.service;

import java.io.IOException;

import com.datahandle.dto.ServiceRequestDTO;

public interface IlcPoc2Service {

	//convert XML to JSON
	public ServiceRequestDTO convertXmlToJson(String xmlData) throws IOException;
}
