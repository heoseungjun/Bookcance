package com.bookcance.board;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.bookcance.service.BoardService;

@SpringBootTest
public class DeleteTest {
	@Autowired
	BoardService service;
	
	@Test
	void contextLoads() {
		try {
			service.remove(104);
			System.out.println("success");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Fail to delete");
		}
	}
}
