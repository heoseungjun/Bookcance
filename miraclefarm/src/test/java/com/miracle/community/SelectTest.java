package com.miracle.community;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.miracle.dto.CustDto;
import com.miracle.service.CustService;

@SpringBootTest
public class SelectTest {
	@Autowired
	CustService service;
	
	@Test
	void contextLoads() {
		CustDto cust;
		try {
			cust = service.choice("seungjun");
			System.out.println(cust);
		} catch (Exception e) {
			System.out.println("Fail to choice");
		}
	}
}
