package com.bookcance.dto;

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
public class BoardDto {
	int board_no;
	String userid;
	String board_title;
	String board_content;
	int board_heart;
	String board_img;
	int board_category;
	Date writedate;
}
