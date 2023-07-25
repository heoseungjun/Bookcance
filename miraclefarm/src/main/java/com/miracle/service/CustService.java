package com.miracle.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miracle.dto.CustDto;
import com.miracle.mapper.CustMapper;

@Service
public class CustService implements com.miracle.frame.Service<String, CustDto> {
	@Autowired
	CustMapper mapper;
	
	public void register(CustDto v) throws Exception {
		mapper.insert(v);
	}
	public void remove(String k) throws Exception {
		mapper.delete(k);
	}
	public void modify(CustDto v) throws Exception {
		mapper.update(v);
	}
	public CustDto choice(String k) throws Exception {
		return mapper.select(k);
	}
	public List<CustDto> choiceall() throws Exception {
		return mapper.selectall();
	}
}
