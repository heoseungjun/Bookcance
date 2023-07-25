package com.miracle.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miracle.dto.RoutineDto;
import com.miracle.mapper.RoutineMapper;

@Service
public class RoutineService implements com.miracle.frame.Service<Integer,RoutineDto> {
	@Autowired
	RoutineMapper mapper;
	
	public void register(RoutineDto v) throws Exception {
		mapper.insert(v);
	}
	public void remove(Integer k) throws Exception {
		mapper.delete(k);
	}
	public void modify(RoutineDto v) throws Exception {
		mapper.update(v);
	}
	public RoutineDto choice(Integer k) throws Exception {
		return mapper.select(k);
	}
	public List<RoutineDto> choiceall() throws Exception {
		return mapper.selectall();
	}
}
