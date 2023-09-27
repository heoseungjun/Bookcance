package com.bookcance.mapper;

import org.springframework.stereotype.Repository;

import com.bookcance.dto.BoardDto;
import com.bookcance.frame.Mapper;

@Repository
@org.apache.ibatis.annotations.Mapper
public interface BoardMapper extends Mapper<Integer, BoardDto>{
	
}
