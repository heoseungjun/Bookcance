package com.miracle.reply;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.miracle.dto.ReplyDto;
import com.miracle.service.ReplyService;

@SpringBootTest
public class SelectAllTest {
	@Autowired
	ReplyService service;
	
	@Test
	void contextLoads() {
		List<ReplyDto> list;
		try {
			list = service.choiceall();
			for(int i=0;i<list.size();i++) System.out.println(list.get(i));
		} catch (Exception e) {
			System.out.println("Fail to choice");
		}
	}
}
