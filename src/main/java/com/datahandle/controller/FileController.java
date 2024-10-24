package com.datahandle.controller;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.datahandle.dto.ServiceRequestDTO;
import com.datahandle.entity.PayloadData;
import com.datahandle.service.FileService;
import com.datahandle.service.IlcPoc2Service;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

@RestController
@RequestMapping("/api")
public class FileController {

	@Autowired
	private FileService fileService;
	
	@Autowired
	private IlcPoc2Service ilcPoc2Service;
	
	@PostMapping(value = "/upload", consumes = "multipart/form-data")
	public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile file) {
	    try {
	        PayloadData payloadData = new PayloadData();
	        payloadData.setName(file.getOriginalFilename());
	        payloadData.setData(file.getBytes());
	        fileService.savefile(payloadData);
	        return ResponseEntity.status(HttpStatus.CREATED).body("File uploaded successfully!");
	    } catch (IOException e) {
	        e.printStackTrace(); // Log the error
	        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("An error occurred during file upload.");
	    } catch (Exception e) {
	        e.printStackTrace(); // Log the error
	        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("An unexpected error occurred.");
	    }
	}

	// Get file
	@GetMapping("/file/{id}")
	public ResponseEntity<String> getFileAsJson(@PathVariable Long id) {
	    try {
	        Optional<PayloadData> optionalData = fileService.getfile(id);
	        if (optionalData.isPresent()) {
	            PayloadData payloadData = optionalData.get();
	            
	            // Convert byte array to XML string
	            String xmlContentString = new String(payloadData.getData(), StandardCharsets.UTF_8);
	            
	            // Convert XML into JSON
	            XmlMapper xmlMapper = new XmlMapper();
	            ObjectMapper objectMapper = new ObjectMapper();
	            
	            // Convert XML string into JSON
	            JsonNode jsonNode = xmlMapper.readTree(xmlContentString);
	            String jsonContentString = objectMapper.writeValueAsString(jsonNode);
	            
	            return ResponseEntity.ok(jsonContentString);
	        } else {
	            return ResponseEntity.notFound().build();
	        }
	    } catch (IOException e) {
	        e.printStackTrace(); // Log the error
	        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("An error occurred while retrieving the file.");
	    } catch (Exception e) {
	        e.printStackTrace(); // Log the error
	        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("An unexpected error occurred.");
	    }
	       
	}
	
	
	//Data covert API XML to JSON 
	@PostMapping(value = "/postxml", consumes = MediaType.APPLICATION_XML_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> convertXmlToJson(@RequestBody String xmlData){
		
		try {
			ServiceRequestDTO serviceRequestDTO=ilcPoc2Service.convertXmlToJson(xmlData);
			return ResponseEntity.ok(serviceRequestDTO);
		} catch (IOException e) {	
			e.printStackTrace();
			return ResponseEntity.badRequest().body("Invalid xml format");
		}
	}
}
