package com.miracle.routine;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.miracle.dto.CustDto;
import com.miracle.service.CustService;

@SpringBootTest
public class InsertTest {
	@Autowired
	CustService service;
	
	@Test
	void contextLoads() {
		CustDto cust = new CustDto("user04","pwd04","유저","010","9999","8888",null,null);
		try {
			service.register(cust);
			System.out.println(cust);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Fail to choice");
		}
	}
}
