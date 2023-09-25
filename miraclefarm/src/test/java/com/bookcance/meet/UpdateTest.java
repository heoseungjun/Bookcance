package com.bookcance.meet;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.bookcance.dto.MeetDto;
import com.bookcance.service.MeetService;

@SpringBootTest
public class UpdateTest {
	@Autowired
	MeetService service;
	
	@Test
	void contextLoads() {
		MeetDto meet = new MeetDto(100, "dbfla","12/1 <휴먼카인드> 독서 모임", "12/1 건국대학교 상허연구관에서 <휴먼카인드> 독서 모임을 개최합니다. 관심 있으신 분들은 댓글 부탁드려요!", 0, null, null, null);
		try {
			service.modify(meet);
			System.out.println("success");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Fail to update");
		}
	}
}
