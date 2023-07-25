package com.miracle.mapper;

import org.springframework.stereotype.Repository;

import com.miracle.dto.CommunityDto;
import com.miracle.frame.Mapper;

@Repository
@org.apache.ibatis.annotations.Mapper
public interface CommunityMapper extends Mapper<Integer, CommunityDto>{
	
}
