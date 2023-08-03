package com.miracle.community;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.miracle.dto.CommunityDto;
import com.miracle.service.CommunityService;

@SpringBootTest
public class InsertTest {
	@Autowired
	CommunityService service;
	
	@Test
	void contextLoads() {
		CommunityDto community = new CommunityDto(0,"seungjun","미라클 모닝으로 인생을 바꾼 사람","미라클모닝을 꾸준히 하고 있는 김유진 변호사님을 소개합니다.","","",null);
		try {
			service.register(community);
			System.out.println(community);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Fail to insert");
		}
	}
}
