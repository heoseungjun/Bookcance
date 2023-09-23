package com.miracle.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class LectureDto {
	int course_no;
	String userid;
	String course_title;
	String instructor;
	int totaltime;
	int learnTime;
	int process;
	String course_info;
	String instructor_info;
}
