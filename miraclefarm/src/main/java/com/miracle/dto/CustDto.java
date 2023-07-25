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
public class CustDto {
	String userid;
	String userpwd;
	String username;
	String tel1, tel2, tel3;
	Date wakeupTime;
	Date joindate;
}
