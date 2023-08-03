package com.miracle.diary;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.miracle.dto.DiaryDto;
import com.miracle.service.DiaryService;

@SpringBootTest
public class InsertTest {
	@Autowired
	DiaryService service;
	
	@Test
	void contextLoads() {
		DiaryDto diary = new DiaryDto(0,"seungjun","8월 3일 인증","명상, 턱걸이, 독서 성공","","",null);
		try {
			service.register(diary);
			System.out.println(diary);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Fail to insert");
		}
	}
}
