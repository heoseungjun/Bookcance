package com.bookcance.user;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.bookcance.dto.UserDto;
import com.bookcance.service.UserService;

@SpringBootTest
public class SelectAllTest {
	@Autowired
	UserService service;
	
	@Test
	void contextLoads() {
		List<UserDto> list;
		try {
			list = service.choiceall();
			for(int i=0;i<list.size();i++) System.out.println(list.get(i));
		} catch (Exception e) {
			System.out.println("Fail to choice");
		}
	}
}
