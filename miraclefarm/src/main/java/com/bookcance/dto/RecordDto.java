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
public class RecordDto {
	int book_no;
	String userid;
	String author;
	String publish;
	String book_title;
	String book_content;
	String book_memory;
	String book_feel;
	String book_reason;
	String book_img;
	String read_start;
	String read_end;
	Date writedate;
}
