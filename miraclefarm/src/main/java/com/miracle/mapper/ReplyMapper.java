package com.miracle.mapper;

import org.springframework.stereotype.Repository;

import com.miracle.dto.ReplyDto;
import com.miracle.frame.Mapper;

@Repository
@org.apache.ibatis.annotations.Mapper
public interface ReplyMapper extends Mapper<Integer, ReplyDto>{
	
}
