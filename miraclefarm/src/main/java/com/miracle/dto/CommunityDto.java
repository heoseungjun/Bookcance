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
public class CommunityDto {
	int comm_no;
	String userid;
	String comm_title;
	String comm_content;
	String comm_img;
	String comm_video;
	Date comm_date;
}
