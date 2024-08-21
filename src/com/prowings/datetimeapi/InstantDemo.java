package com.prowings.datetimeapi;

import java.time.Instant;

public class InstantDemo {

	public static void main(String[] args) {
		
		
		long currentTimeMillis = System.currentTimeMillis();
		
		System.out.println(currentTimeMillis);
		
		Instant now = Instant.now();
		System.out.println(now);
		
	}
	
}
