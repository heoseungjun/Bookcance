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
public class DiaryDto {
	int diary_no;
	String userid;
	String diary_title;
	String diary_content;
	String diary_img;
	String diary_video;
	Date diary_date;
}
