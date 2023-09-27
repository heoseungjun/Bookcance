package com.bookcance.reply;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.bookcance.dto.ReplyDto;
import com.bookcance.dto.UserDto;
import com.bookcance.service.ReplyService;
import com.bookcance.service.UserService;

@SpringBootTest
public class SelectTest {
	@Autowired
	ReplyService service;
	
	@Test
	void contextLoads() {
		ReplyDto reply;
		try {
			reply = service.choice(1000);
			System.out.println(reply);
		} catch (Exception e) {
			System.out.println("Fail to choice");
		}
	}
}
