package com.miracle.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miracle.dto.ReplyDto;
import com.miracle.mapper.ReplyMapper;

@Service
public class ReplyService implements com.miracle.frame.Service<Integer,ReplyDto> {
	@Autowired
	ReplyMapper mapper;
	
	public void register(ReplyDto v) throws Exception {
		mapper.insert(v);
	}
	public void remove(Integer k) throws Exception {
		mapper.delete(k);
	}
	public void modify(ReplyDto v) throws Exception {
		mapper.update(v);
	}
	public ReplyDto choice(Integer k) throws Exception {
		return mapper.select(k);
	}
	public List<ReplyDto> choiceall() throws Exception {
		return mapper.selectall();
	}
}
