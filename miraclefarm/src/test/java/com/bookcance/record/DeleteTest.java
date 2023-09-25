package com.bookcance.record;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.bookcance.service.RecordService;

@SpringBootTest
public class DeleteTest {
	@Autowired
	RecordService service;
	
	@Test
	void contextLoads() {
		try {
			service.remove(1);
			System.out.println("success");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Fail to delete");
		}
	}
}
