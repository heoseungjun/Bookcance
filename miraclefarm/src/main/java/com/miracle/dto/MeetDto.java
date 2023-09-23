package com.miracle.dto;

import java.util.Date;

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
public class MeetDto {
	int meet_no;
	String userid;
	String meet_title;
	String meet_content;
	int meet_heart;
	String meet_result;
	String meet_img;
	Date writedate;
}
