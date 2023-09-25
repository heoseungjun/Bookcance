package com.bookcance.meet;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.bookcance.dto.MeetDto;
import com.bookcance.service.MeetService;

@SpringBootTest
public class SelectTest {
	@Autowired
	MeetService service;
	
	@Test
	void contextLoads() {
		MeetDto meet;
		try {
			meet = service.choice(100);
			System.out.println(meet);
		} catch (Exception e) {
			System.out.println("Fail to choice");
		}
	}
}
