package com.miracle.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miracle.dto.RecordDto;
import com.miracle.mapper.RecordMapper;

@Service
public class RecordService implements com.miracle.frame.Service<Integer,RecordDto> {
	@Autowired
	RecordMapper mapper;
	
	public void register(RecordDto v) throws Exception {
		mapper.insert(v);
	}
	public void remove(Integer k) throws Exception {
		mapper.delete(k);
	}
	public void modify(RecordDto v) throws Exception {
		mapper.update(v);
	}
	public RecordDto choice(Integer k) throws Exception {
		return mapper.select(k);
	}
	public List<RecordDto> choiceall() throws Exception {
		return mapper.selectall();
	}
}
