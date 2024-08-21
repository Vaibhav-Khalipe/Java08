package com.prowings.datetimeapi;

import java.time.LocalDate;

public class LocalDateDemo1 {

	public static void main(String[] args) {
		
		LocalDate today = LocalDate.now();
		LocalDate customDate = LocalDate.of(1997, 07, 18);
		
		System.out.println("today :"+today);
		System.out.println("Custom date :"+customDate);
		
		LocalDate minusDaysDate = today.minusDays(100);
		System.out.println("minusDaysDate :"+minusDaysDate);
		
		LocalDate minusMonthsDate = today.minusMonths(120);
		System.out.println("minusMonthsDate :"+minusMonthsDate);
		
	}
}
