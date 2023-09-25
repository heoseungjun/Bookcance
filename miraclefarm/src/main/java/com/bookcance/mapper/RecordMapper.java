package com.bookcance.mapper;

import org.springframework.stereotype.Repository;

import com.bookcance.dto.RecordDto;
import com.bookcance.frame.Mapper;

@Repository
@org.apache.ibatis.annotations.Mapper
public interface RecordMapper extends Mapper<Integer, RecordDto>{
	
}
