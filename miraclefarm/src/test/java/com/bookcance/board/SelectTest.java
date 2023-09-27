package com.bookcance.board;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.bookcance.dto.BoardDto;
import com.bookcance.service.BoardService;

@SpringBootTest
public class SelectTest {
	@Autowired
	BoardService service;
	
	@Test
	void contextLoads() {
		BoardDto board;
		try {
			board = service.choice(100);
			System.out.println(board);
		} catch (Exception e) {
			System.out.println("Fail to choice");
		}
	}
}
