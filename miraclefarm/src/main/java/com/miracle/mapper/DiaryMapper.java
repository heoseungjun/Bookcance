package com.miracle.mapper;

import org.springframework.stereotype.Repository;

import com.miracle.dto.DiaryDto;
import com.miracle.frame.Mapper;

@Repository
@org.apache.ibatis.annotations.Mapper
public interface DiaryMapper extends Mapper<Integer, DiaryDto>{
	
}
