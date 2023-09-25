package com.bookcance.lecture;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.bookcance.service.LectureService;

@SpringBootTest
public class DeleteTest {
	@Autowired
	LectureService service;
	
	@Test
	void contextLoads() {
		try {
			service.remove(15);
			System.out.println("success");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Fail to delete");
		}
	}
}
