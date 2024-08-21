package com.prowings.datetimeapi;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterDemo {

	public static void main(String[] args) {
		
		LocalDate localDate = LocalDate.now();
		
		System.out.println(localDate);
		
		DateTimeFormatter myFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		String format = localDate.format(myFormatter);
		System.out.println(format);
		
		
	}
}
