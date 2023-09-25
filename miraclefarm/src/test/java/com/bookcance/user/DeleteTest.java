package com.bookcance.user;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.bookcance.service.UserService;

@SpringBootTest
public class DeleteTest {
	@Autowired
	UserService service;
	
	@Test
	void contextLoads() {
		try {
			service.remove("rlfehd");
			System.out.println("success");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Fail to delete");
		}
	}
}
