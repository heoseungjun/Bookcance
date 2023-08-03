package com.miracle.community;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.miracle.dto.CommunityDto;
import com.miracle.service.CommunityService;

@SpringBootTest
public class SelectTest {
	@Autowired
	CommunityService service;
	
	@Test
	void contextLoads() {
		CommunityDto community;
		try {
			community = service.choice(1001);
			System.out.println(community);
		} catch (Exception e) {
			System.out.println("Fail to choice");
		}
	}
}
