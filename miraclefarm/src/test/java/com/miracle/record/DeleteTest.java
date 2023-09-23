package com.miracle.routine;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.miracle.service.RoutineService;

@SpringBootTest
public class DeleteTest {
	@Autowired
	RoutineService service;
	
	@Test
	void contextLoads() {
		try {
			service.remove(102);
			System.out.println("success");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Fail to delete");
		}
	}
}
