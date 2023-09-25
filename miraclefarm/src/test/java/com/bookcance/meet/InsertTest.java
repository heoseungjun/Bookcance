package com.bookcance.meet;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.bookcance.dto.MeetDto;
import com.bookcance.dto.RecordDto;
import com.bookcance.service.MeetService;

@SpringBootTest
public class InsertTest {
	@Autowired
	MeetService service;
	
	@Test
	void contextLoads() {
		MeetDto diary = new MeetDto(0, "wjdgk","oo", "xx", 0, null, null, null);
		try {
			service.register(diary);
			System.out.println(diary);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Fail to insert");
		}
	}
}
