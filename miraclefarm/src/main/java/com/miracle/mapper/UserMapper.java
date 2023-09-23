package com.miracle.mapper;

import org.springframework.stereotype.Repository;

import com.miracle.dto.UserDto;
import com.miracle.frame.Mapper;

@Repository
@org.apache.ibatis.annotations.Mapper
public interface UserMapper extends Mapper<String, UserDto>{
	
}
