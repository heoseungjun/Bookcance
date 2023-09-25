package com.bookcance.lecture;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.bookcance.dto.LectureDto;
import com.bookcance.service.LectureService;

@SpringBootTest
public class SelectTest {
	@Autowired
	LectureService service;
	
	@Test
	void contextLoads() {
		LectureDto lecture;
		try {
			lecture = service.choice(10);
			System.out.println(lecture);
		} catch (Exception e) {
			System.out.println("Fail to choice");
		}
	}
}
