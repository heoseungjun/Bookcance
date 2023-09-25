package com.bookcance.user;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.bookcance.dto.UserDto;
import com.bookcance.service.UserService;

@SpringBootTest
public class UpdateTest {
	@Autowired
	UserService service;
	
	@Test
	void contextLoads() {
		UserDto user = new UserDto("tmdwns","1111","허승준",null);
		try {
			service.modify(user);
			System.out.println("success");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Fail to update");
		}
	}
}
