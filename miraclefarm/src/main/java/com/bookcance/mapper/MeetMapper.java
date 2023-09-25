package com.bookcance.mapper;

import org.springframework.stereotype.Repository;

import com.bookcance.dto.MeetDto;
import com.bookcance.frame.Mapper;

@Repository
@org.apache.ibatis.annotations.Mapper
public interface MeetMapper extends Mapper<Integer, MeetDto>{
	
}
