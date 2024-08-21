package com.prowings.datetimeapi;

import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class DurationDemo {

	public static void main(String[] args) {
		
		
		Instant now = Instant.now();
		
		Instant end=Instant.now();
		Duration between = Duration.between(now, end);
		System.out.println(between);
		Duration of = Duration.of(1, ChronoUnit.MILLIS);
		System.out.println(of);
		
	}
}
