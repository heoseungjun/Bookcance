package com.miracle.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miracle.mapper.LectureMapper;
import com.miracle.dto.LectureDto;

@Service
public class LectureService implements com.miracle.frame.Service<Integer,LectureDto> {
	@Autowired
	LectureMapper mapper;
	
	public void register(LectureDto v) throws Exception {
		mapper.insert(v);
	}
	public void remove(Integer k) throws Exception {
		mapper.delete(k);
	}
	public void modify(LectureDto v) throws Exception {
		mapper.update(v);
	}
	public LectureDto choice(Integer k) throws Exception {
		return mapper.select(k);
	}
	public List<LectureDto> choiceall() throws Exception {
		return mapper.selectall();
	}
}
