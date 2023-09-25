package com.bookcance.mapper;

import org.springframework.stereotype.Repository;

import com.bookcance.dto.UserDto;
import com.bookcance.frame.Mapper;

@Repository
@org.apache.ibatis.annotations.Mapper
public interface UserMapper extends Mapper<String, UserDto>{
	
}
