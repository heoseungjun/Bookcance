package com.miracle.mapper;

import org.springframework.stereotype.Repository;

import com.miracle.dto.ReviewDto;
import com.miracle.frame.Mapper;

@Repository
@org.apache.ibatis.annotations.Mapper
public interface ReviewMapper extends Mapper<Integer, ReviewDto>{
	
}
