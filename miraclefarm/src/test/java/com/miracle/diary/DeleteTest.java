package com.miracle.diary;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.miracle.service.DiaryService;

@SpringBootTest
public class DeleteTest {
	@Autowired
	DiaryService service;
	
	@Test
	void contextLoads() {
		try {
			service.remove(3);
			System.out.println("success");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Fail to choice");
		}
	}
}
