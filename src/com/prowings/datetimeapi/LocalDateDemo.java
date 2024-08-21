package com.prowings.datetimeapi;

import java.time.LocalDate;

public class LocalDateDemo {

	public static void main(String[] args) {
		
		LocalDate now = LocalDate.now();
		System.out.println("Current Date Is :"+now);
		
		LocalDate customDate = LocalDate.of(1997, 07, 18);
		System.out.println("Custom date is :"+customDate);
		
		int dayOfMonth = now.getDayOfMonth();
		int month = now.getMonthValue();
		int year = now.getYear();
		
		System.out.println(dayOfMonth);
		System.out.println(month);
		System.out.println(year);
	}
	
}
