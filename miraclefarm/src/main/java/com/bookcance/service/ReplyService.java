package com.bookcance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookcance.dto.ReplyDto;
import com.bookcance.mapper.ReplyMapper;

@Service
public class ReplyService implements com.bookcance.frame.Service<Integer,ReplyDto> {
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
