package com.miracle.reply;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.miracle.dto.ReplyDto;
import com.miracle.service.ReplyService;

@SpringBootTest
public class UpdateTest {
	@Autowired
	ReplyService service;
	
	@Test
	void contextLoads() {
		ReplyDto reply = new ReplyDto(10002,"seohyeon",1002,"저도 잘 부탁드려요!",null);
		try {
			service.modify(reply);
			System.out.println("success");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Fail to update");
		}
	}
}
