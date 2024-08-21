package com.prowings.optionalclassjava;

import java.util.Optional;

public class GetMethodDemo {

	public static void main(String[] args) {
		
		Optional<String> optional = Optional.of("Vaibhav");
		System.out.println(optional.get());
		
		System.out.println("=======================================");
		Optional<Object> ofNullable = Optional.ofNullable(null);
		System.out.println(ofNullable.get());
	}
}
