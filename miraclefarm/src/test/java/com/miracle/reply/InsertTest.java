package com.miracle.reply;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.miracle.dto.ReplyDto;
import com.miracle.service.ReplyService;

@SpringBootTest
public class InsertTest {
	@Autowired
	ReplyService service;
	
	@Test
	void contextLoads() {
		ReplyDto reply = new ReplyDto(0,"seohyeon",1002,"환영합니다!",null);
		try {
			service.register(reply);
			System.out.println(reply);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Fail to insert");
		}
	}
}
