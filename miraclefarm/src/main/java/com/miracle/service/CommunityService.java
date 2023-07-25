package com.miracle.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miracle.dto.CommunityDto;
import com.miracle.mapper.CommunityMapper;

@Service
public class CommunityService implements com.miracle.frame.Service<Integer,CommunityDto> {
	@Autowired
	CommunityMapper mapper;
	
	public void register(CommunityDto v) throws Exception {
		mapper.insert(v);
	}
	public void remove(Integer k) throws Exception {
		mapper.delete(k);
	}
	public void modify(CommunityDto v) throws Exception {
		mapper.update(v);
	}
	public CommunityDto choice(Integer k) throws Exception {
		return mapper.select(k);
	}
	public List<CommunityDto> choiceall() throws Exception {
		return mapper.selectall();
	}
}
