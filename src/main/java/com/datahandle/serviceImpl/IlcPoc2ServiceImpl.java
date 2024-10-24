package com.datahandle.serviceImpl;

import java.io.IOException;

import org.springframework.stereotype.Service;

import com.datahandle.dto.ServiceRequestDTO;
import com.datahandle.service.IlcPoc2Service;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

@Service
public class IlcPoc2ServiceImpl implements IlcPoc2Service{

	@Override
	public ServiceRequestDTO convertXmlToJson(String xmlData) throws IOException{
		XmlMapper xmlMapper=new XmlMapper();
		return xmlMapper.readValue(xmlData,ServiceRequestDTO.class);
	}
	

}
