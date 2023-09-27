package com.bookcance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookcance.dto.BoardDto;
import com.bookcance.mapper.BoardMapper;

@Service
public class BoardService implements com.bookcance.frame.Service<Integer,BoardDto> {
	@Autowired
	BoardMapper mapper;
	
	public void register(BoardDto v) throws Exception {
		mapper.insert(v);
	}
	public void remove(Integer k) throws Exception {
		mapper.delete(k);
	}
	public void modify(BoardDto v) throws Exception {
		mapper.update(v);
	}
	public BoardDto choice(Integer k) throws Exception {
		return mapper.select(k);
	}
	public List<BoardDto> choiceall() throws Exception {
		return mapper.selectall();
	}
}
