package com.bookcance.mapper;

import org.springframework.stereotype.Repository;

import com.bookcance.dto.LectureDto;
import com.bookcance.frame.Mapper;

@Repository
@org.apache.ibatis.annotations.Mapper
public interface LectureMapper extends Mapper<Integer, LectureDto>{
	
}
