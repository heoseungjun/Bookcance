package com.miracle.community;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.miracle.dto.CustDto;
import com.miracle.service.CustService;

@SpringBootTest
public class SelectAllTest {
	@Autowired
	CustService service;
	
	@Test
	void contextLoads() {
		List<CustDto> list;
		try {
			list = service.choiceall();
			for(int i=0;i<list.size();i++) System.out.println(list.get(i));
		} catch (Exception e) {
			System.out.println("Fail to choice");
		}
	}
}
