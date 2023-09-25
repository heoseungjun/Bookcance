package com.bookcance.mapper;

import org.springframework.stereotype.Repository;

import com.bookcance.dto.ReplyDto;
import com.bookcance.frame.Mapper;

@Repository
@org.apache.ibatis.annotations.Mapper
public interface ReplyMapper extends Mapper<Integer, ReplyDto>{
	
}
