package com.datahandle.service;

import java.util.Optional;

import com.datahandle.entity.PayloadData;

public interface FileService {

	public PayloadData savefile(PayloadData payloadData);
	
	public Optional<PayloadData> getfile(Long id);
}
