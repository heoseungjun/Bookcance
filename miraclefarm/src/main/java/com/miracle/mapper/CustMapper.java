package com.miracle.mapper;

import org.springframework.stereotype.Repository;

import com.miracle.dto.CustDto;
import com.miracle.frame.Mapper;

@Repository
@org.apache.ibatis.annotations.Mapper
public interface CustMapper extends Mapper<String, CustDto>{
	
}
