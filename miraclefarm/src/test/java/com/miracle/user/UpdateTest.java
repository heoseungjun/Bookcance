package com.miracle.cust;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.miracle.dto.CustDto;
import com.miracle.service.CustService;

@SpringBootTest
public class UpdateTest {
	@Autowired
	CustService service;
	
	@Test
	void contextLoads() {
		CustDto cust = new CustDto("seungjun","jun0815","허승준","010","9967","7774",null,null);
		try {
			service.modify(cust);
			System.out.println("success");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Fail to update");
		}
	}
}
