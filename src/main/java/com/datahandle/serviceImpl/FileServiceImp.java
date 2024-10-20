package com.datahandle.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.datahandle.entity.PayloadData;
import com.datahandle.repository.FileRepository;
import com.datahandle.service.FileService;

@Service
public class FileServiceImp implements FileService {

	@Autowired
	FileRepository fileRepository;
	@Override
	public PayloadData savefile(PayloadData payloadData) {
		return fileRepository.save(payloadData);
	}
	@Override
	public Optional<PayloadData> getfile(Long id) {
		return fileRepository.findById(id);
	}

}
