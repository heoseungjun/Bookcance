package com.miracle.diary;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.miracle.dto.DiaryDto;
import com.miracle.service.DiaryService;

@SpringBootTest
public class SelectTest {
	@Autowired
	DiaryService service;
	
	@Test
	void contextLoads() {
		DiaryDto diary;
		try {
			diary = service.choice(1);
			System.out.println(diary);
		} catch (Exception e) {
			System.out.println("Fail to choice");
		}
	}
}
