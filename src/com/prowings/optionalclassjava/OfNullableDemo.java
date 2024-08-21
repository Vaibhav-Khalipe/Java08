package com.prowings.optionalclassjava;

import java.util.Optional;

public class OfNullableDemo {

	public static void main(String[] args) {
		
		Optional<String> ofNullable = Optional.ofNullable("Hello");
		System.out.println(ofNullable.isPresent());
		
		System.out.println("=========================================");
		Optional<Object> nullable = Optional.ofNullable(null);
		System.out.println(nullable.isEmpty());
		System.out.println(nullable.isPresent());
	}
}
