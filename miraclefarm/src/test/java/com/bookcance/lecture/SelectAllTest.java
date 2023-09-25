package com.bookcance.lecture;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.bookcance.dto.LectureDto;
import com.bookcance.service.LectureService;

@SpringBootTest
public class SelectAllTest {
	@Autowired
	LectureService service;
	
	@Test
	void contextLoads() {
		List<LectureDto> list;
		try {
			list = service.choiceall();
			for(int i=0;i<list.size();i++) System.out.println(list.get(i));
		} catch (Exception e) {
			System.out.println("Fail to choice");
		}
	}
}
