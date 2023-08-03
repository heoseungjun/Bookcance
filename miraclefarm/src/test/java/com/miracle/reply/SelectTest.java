package com.miracle.reply;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.miracle.dto.CustDto;
import com.miracle.dto.ReplyDto;
import com.miracle.service.CustService;
import com.miracle.service.ReplyService;

@SpringBootTest
public class SelectTest {
	@Autowired
	ReplyService service;
	
	@Test
	void contextLoads() {
		ReplyDto reply;
		try {
			reply = service.choice(10000);
			System.out.println(reply);
		} catch (Exception e) {
			System.out.println("Fail to choice");
		}
	}
}
