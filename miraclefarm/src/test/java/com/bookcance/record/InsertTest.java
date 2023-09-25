package com.bookcance.record;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.bookcance.dto.LectureDto;
import com.bookcance.dto.RecordDto;
import com.bookcance.service.RecordService;

@SpringBootTest
public class InsertTest {
	@Autowired
	RecordService service;
	
	@Test
	void contextLoads() {
		RecordDto record = new RecordDto(0,"tmdwns","뤼트허르 브레흐만","인플루엔셜","휴먼카인드","성악설과 관련된 여러 이론 및 실험들을 반박해내는 책","인간은 선한 본성에 압도된다","성선설이라는 새로운 시각을 경험해볼 수 있었다","성선설에 기반한 책이라는 점이 신선해서","2023-10-27","2023-11-15",null,null);
		try {
			service.register(record);
			System.out.println(record);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Fail to insert");
		}
	}
}
