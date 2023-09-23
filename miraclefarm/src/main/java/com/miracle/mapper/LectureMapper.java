package com.miracle.mapper;

import org.springframework.stereotype.Repository;

import com.miracle.dto.LectureDto;
import com.miracle.frame.Mapper;

@Repository
@org.apache.ibatis.annotations.Mapper
public interface LectureMapper extends Mapper<Integer, LectureDto>{
	
}
