package com.bookcance.user;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.bookcance.dto.UserDto;
import com.bookcance.service.UserService;

@SpringBootTest
public class SelectTest {
	@Autowired
	UserService service;
	
	@Test
	void contextLoads() {
		UserDto user;
		try {
			user = service.choice("tmdwns");
			System.out.println(user);
		} catch (Exception e) {
			System.out.println("Fail to choice");
		}
	}
}
