package com.datahandle.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.datahandle.entity.PayloadData;

public interface FileRepository extends JpaRepository<PayloadData,Long>{

}
