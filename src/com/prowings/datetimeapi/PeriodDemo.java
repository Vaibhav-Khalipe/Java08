package com.prowings.datetimeapi;

import java.time.LocalDate;
import java.time.Period;

public class PeriodDemo {

	public static void main(String[] args) {
		
		LocalDate now = LocalDate.now();
		LocalDate of = LocalDate.of(1997, 07, 18);
		Period between = Period.between(now, of);
		
		System.out.println(between);
	}
}
