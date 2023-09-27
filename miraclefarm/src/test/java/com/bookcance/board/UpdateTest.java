package com.bookcance.board;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.bookcance.dto.BoardDto;
import com.bookcance.service.BoardService;

@SpringBootTest
public class UpdateTest {
	@Autowired
	BoardService service;
	
	@Test
	void contextLoads() {
		BoardDto review = new BoardDto(103,"wjdgk","5초의 법칙을 읽고 나서","이 책을 읽고 아침에 일찍 곧바로 일어나는 습관을 들이게 되었어요!",0,null,2,null);
		try {
			service.modify(review);
			System.out.println("success");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Fail to update");
		}
	}
}
