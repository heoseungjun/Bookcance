package com.miracle.mapper;

import org.springframework.stereotype.Repository;

import com.miracle.dto.RoutineDto;
import com.miracle.frame.Mapper;

@Repository
@org.apache.ibatis.annotations.Mapper
public interface RoutineMapper extends Mapper<Integer, RoutineDto>{
	
}
