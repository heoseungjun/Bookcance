package com.bookcance.reply;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.bookcance.service.ReplyService;

@SpringBootTest
public class DeleteTest {
	@Autowired
	ReplyService service;
	
	@Test
	void contextLoads() {
		try {
			service.remove(1001);
			System.out.println("success");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Fail to choice");
		}
	}
}
