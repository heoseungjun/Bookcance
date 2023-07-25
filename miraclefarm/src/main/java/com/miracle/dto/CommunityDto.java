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
	int write_no;
	String userid;
	String write_title;
	String write_content;
	String write_img;
	Date write_date;
	char open_accept;
}
