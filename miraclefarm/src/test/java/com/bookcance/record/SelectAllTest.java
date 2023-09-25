package com.bookcance.record;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.bookcance.dto.RecordDto;
import com.bookcance.service.RecordService;

@SpringBootTest
public class SelectAllTest {
	@Autowired
	RecordService service;
	
	@Test
	void contextLoads() {
		List<RecordDto> list;
		try {
			list = service.choiceall();
			for(int i=0;i<list.size();i++) System.out.println(list.get(i));
		} catch (Exception e) {
			System.out.println("Fail to choice");
		}
	}
}
