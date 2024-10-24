package com.datahandle.serviceImpl;
import com.datahandle.entity.PayloadData;
import com.datahandle.repository.FileRepository;
import com.datahandle.service.FileService;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Optional;

@Service
public class FileServiceImp implements FileService {

    @Autowired
    private FileRepository fileRepository;

    @Override
	public PayloadData savefile(PayloadData payloadData) {
		return fileRepository.save(payloadData);
	}
	@Override
	public Optional<PayloadData> getfile(Long id) {
		return fileRepository.findById(id);
	}
}
