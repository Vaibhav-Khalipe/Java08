package com.prowings.datetimeapi;

import java.time.LocalTime;

public class LocalTimeDemo {

	public static void main(String[] args) {
		
		LocalTime nowTime = LocalTime.now();
		LocalTime before = LocalTime.of(20, 50);
		System.out.println("now Time :"+nowTime);
		System.out.println("Before :"+before);
		
	}
}
