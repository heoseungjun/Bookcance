package com.miracle.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miracle.dto.MeetDto;
import com.miracle.mapper.MeetMapper;

@Service
public class MeetService implements com.miracle.frame.Service<Integer,MeetDto> {
	@Autowired
	MeetMapper mapper;
	
	public void register(MeetDto v) throws Exception {
		mapper.insert(v);
	}
	public void remove(Integer k) throws Exception {
		mapper.delete(k);
	}
	public void modify(MeetDto v) throws Exception {
		mapper.update(v);
	}
	public MeetDto choice(Integer k) throws Exception {
		return mapper.select(k);
	}
	public List<MeetDto> choiceall() throws Exception {
		return mapper.selectall();
	}
}
