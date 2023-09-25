package com.bookcance.meet;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.bookcance.service.MeetService;

@SpringBootTest
public class DeleteTest {
	@Autowired
	MeetService service;
	
	@Test
	void contextLoads() {
		try {
			service.remove(103);
			System.out.println("success");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Fail to choice");
		}
	}
}
