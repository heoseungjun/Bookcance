package com.miracle.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miracle.dto.DiaryDto;
import com.miracle.mapper.DiaryMapper;

@Service
public class DiaryService implements com.miracle.frame.Service<Integer,DiaryDto> {
	@Autowired
	DiaryMapper mapper;
	
	public void register(DiaryDto v) throws Exception {
		mapper.insert(v);
	}
	public void remove(Integer k) throws Exception {
		mapper.delete(k);
	}
	public void modify(DiaryDto v) throws Exception {
		mapper.update(v);
	}
	public DiaryDto choice(Integer k) throws Exception {
		return mapper.select(k);
	}
	public List<DiaryDto> choiceall() throws Exception {
		return mapper.selectall();
	}
}
