package com.miracle.community;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.miracle.service.CommunityService;

@SpringBootTest
public class DeleteTest {
	@Autowired
	CommunityService service;
	
	@Test
	void contextLoads() {
		try {
			service.remove(1000);
			System.out.println("success");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Fail to delete");
		}
	}
}
