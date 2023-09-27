package com.bookcance.reply;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.bookcance.dto.ReplyDto;
import com.bookcance.service.ReplyService;

@SpringBootTest
public class InsertTest {
	@Autowired
	ReplyService service;
	
	@Test
	void contextLoads() {
		ReplyDto reply = new ReplyDto(0, "qhsan", 101, "혹시 모임 장소는 어떻게 될까요?", null);
		try {
			service.register(reply);
			System.out.println(reply);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Fail to insert");
		}
	}
}
