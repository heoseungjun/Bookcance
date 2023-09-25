package com.bookcance.lecture;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.bookcance.dto.LectureDto;
import com.bookcance.service.LectureService;

@SpringBootTest
public class UpdateTest {
	@Autowired
	LectureService service;
	
	@Test
	void contextLoads() {
		LectureDto lecture = new LectureDto(14, "독서 경험 공유해보기","최승필", 27, 0, 0, "독서 경험을 타인과 공유했을 때 얻을 수 있는 것들에 대하여", null);
		try {
			service.modify(lecture);
			System.out.println("success");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Fail to update");
		}
	}
}
