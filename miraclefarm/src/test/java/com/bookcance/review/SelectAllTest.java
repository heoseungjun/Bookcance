package com.bookcance.review;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.bookcance.dto.ReviewDto;
import com.bookcance.service.ReviewService;

@SpringBootTest
public class SelectAllTest {
	@Autowired
	ReviewService service;
	
	@Test
	void contextLoads() {
		List<ReviewDto> list;
		try {
			list = service.choiceall();
			for(int i=0;i<list.size();i++) System.out.println(list.get(i));
		} catch (Exception e) {
			System.out.println("Fail to choice");
		}
	}
}
