package com.bookcance.mapper;

import org.springframework.stereotype.Repository;

import com.bookcance.dto.ReviewDto;
import com.bookcance.frame.Mapper;

@Repository
@org.apache.ibatis.annotations.Mapper
public interface ReviewMapper extends Mapper<Integer, ReviewDto>{
	
}
