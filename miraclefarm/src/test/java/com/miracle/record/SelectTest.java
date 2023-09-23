package com.miracle.routine;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.miracle.dto.RoutineDto;
import com.miracle.service.RoutineService;

@SpringBootTest
public class SelectTest {
	@Autowired
	RoutineService service;
	
	@Test
	void contextLoads() {
		RoutineDto routine;
		try {
			routine = service.choice(100);
			System.out.println(routine);
		} catch (Exception e) {
			System.out.println("Fail to choice");
		}
	}
}
