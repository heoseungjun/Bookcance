package com.bookcance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookcance.dto.ReviewDto;
import com.bookcance.mapper.ReviewMapper;

@Service
public class ReviewService implements com.bookcance.frame.Service<Integer,ReviewDto> {
	@Autowired
	ReviewMapper mapper;
	
	public void register(ReviewDto v) throws Exception {
		mapper.insert(v);
	}
	public void remove(Integer k) throws Exception {
		mapper.delete(k);
	}
	public void modify(ReviewDto v) throws Exception {
		mapper.update(v);
	}
	public ReviewDto choice(Integer k) throws Exception {
		return mapper.select(k);
	}
	public List<ReviewDto> choiceall() throws Exception {
		return mapper.selectall();
	}
}
