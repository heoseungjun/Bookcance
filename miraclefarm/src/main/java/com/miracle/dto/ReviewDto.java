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
public class ReviewDto {
	int review_no;
	String userid;
	String review_title;
	String review_content;
	int review_heart;
	String review_img;
	Date writedate;
}
