package com.miracle.diary;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.miracle.dto.DiaryDto;
import com.miracle.service.DiaryService;

@SpringBootTest
public class UpdateTest {
	@Autowired
	DiaryService service;
	
	@Test
	void contextLoads() {
		DiaryDto diary = new DiaryDto(5,"seungjun","오늘 컨디션 문제로 건너뜀","내일 다시 해보자!","","",null);
		try {
			service.modify(diary);
			System.out.println("success");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Fail to update");
		}
	}
}
