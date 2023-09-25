package com.bookcance.user;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.bookcance.dto.UserDto;
import com.bookcance.service.UserService;

@SpringBootTest
public class InsertTest {
	@Autowired
	UserService service;
	
	@Test
	void contextLoads() {
		UserDto user = new UserDto("rlfehd","8888","홍길동",null);
		try {
			service.register(user);
			System.out.println(user);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Fail to insert");
		}
	}
}
