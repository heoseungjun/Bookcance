package com.miracle.cust;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.miracle.dto.CustDto;
import com.miracle.service.CustService;

@SpringBootTest
public class DeleteTest {
	@Autowired
	CustService service;
	
	@Test
	void contextLoads() {
		try {
			service.remove("user04");
			System.out.println("success");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Fail to choice");
		}
	}
}
