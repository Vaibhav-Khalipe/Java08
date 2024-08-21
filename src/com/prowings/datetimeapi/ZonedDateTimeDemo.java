package com.prowings.datetimeapi;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class ZonedDateTimeDemo {

	public static void main(String[] args) {
		
		ZonedDateTime now = ZonedDateTime.now();
		System.out.println(now);
		ZonedDateTime zonedDateTime = ZonedDateTime.of(2000, 10, 10, 01, 50, 50, 50,ZoneId.of("Asia/Calcutta"));
		System.out.println(zonedDateTime);
		
		Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
		System.out.println("available zone id :"+availableZoneIds);
	}
}
