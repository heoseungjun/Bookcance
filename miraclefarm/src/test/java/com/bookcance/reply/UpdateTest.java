package com.bookcance.reply;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.bookcance.dto.ReplyDto;
import com.bookcance.service.ReplyService;

@SpringBootTest
public class UpdateTest {
	@Autowired
	ReplyService service;
	
	@Test
	void contextLoads() {
		ReplyDto reply = new ReplyDto(1000, "dbfla", 100, "안녕하세요! 참여 희망합니다", null);
		try {
			service.modify(reply);
			System.out.println("success");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Fail to update");
		}
	}
}
