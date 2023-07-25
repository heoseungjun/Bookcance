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
public class RoutineDto {
	int r_code;
	String userid;
	String r_name;
	String r_explain;
	Date startTime;
	Date endTime;
	Date startDate;
	Date endDate;
	int count;
	char challenge_apply;
}
