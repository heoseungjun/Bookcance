package com.miracle.mapper;

import org.springframework.stereotype.Repository;

import com.miracle.dto.RecordDto;
import com.miracle.frame.Mapper;

@Repository
@org.apache.ibatis.annotations.Mapper
public interface RecordMapper extends Mapper<Integer, RecordDto>{
	
}
