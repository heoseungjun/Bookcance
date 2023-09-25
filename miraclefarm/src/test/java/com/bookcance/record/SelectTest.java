package com.bookcance.record;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.bookcance.dto.RecordDto;
import com.bookcance.service.RecordService;

@SpringBootTest
public class SelectTest {
	@Autowired
	RecordService service;
	
	@Test
	void contextLoads() {
		RecordDto record;
		try {
			record = service.choice(2);
			System.out.println(record);
		} catch (Exception e) {
			System.out.println("Fail to choice");
		}
	}
}
