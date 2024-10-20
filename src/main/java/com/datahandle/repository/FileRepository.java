package com.datahandle.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.datahandle.entity.PayloadData;

public interface FileRepository extends JpaRepository<PayloadData,Long>{

}
