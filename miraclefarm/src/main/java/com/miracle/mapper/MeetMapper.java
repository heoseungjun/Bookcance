package com.miracle.mapper;

import org.springframework.stereotype.Repository;

import com.miracle.dto.MeetDto;
import com.miracle.frame.Mapper;

@Repository
@org.apache.ibatis.annotations.Mapper
public interface MeetMapper extends Mapper<Integer, MeetDto>{
	
}
