package com.miracle.routine;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.miracle.dto.RoutineDto;
import com.miracle.service.RoutineService;

@SpringBootTest
public class InsertTest {
	@Autowired
	RoutineService service;
	
	@Test
	void contextLoads() {
		String startTime = "07:00:00", endTime = "07:15:00", startDate = "2023-08-01", endDate = "2023-08-31";
		Date sTime = new Date();
		Date eTime = new Date();
		Date sDate = new Date();
		Date eDate = new Date();
		
		SimpleDateFormat set_time = new SimpleDateFormat("HH:mm:ss");
		SimpleDateFormat set_date = new SimpleDateFormat("yyyy-MM-dd");
		
		try {
			sTime = set_time.parse(startTime);
			eTime = set_time.parse(endTime);
			sDate = set_date.parse(startDate);
			eDate = set_date.parse(endDate);
		} catch (ParseException e1) {
			System.out.println("Date Format Error");
			e1.printStackTrace();
		}
		
		RoutineDto Routine = new RoutineDto(0,"seungjun","독서","책상 앞에 앉아 15분 독서",sTime,eTime,sDate,eDate,0,'N');
		try {
			service.register(Routine);
			System.out.println(Routine);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Fail to insert");
		}
	}
}
