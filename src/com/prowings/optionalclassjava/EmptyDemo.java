package com.prowings.optionalclassjava;

import java.util.Optional;

public class EmptyDemo {

	public static void main(String[] args) {
		
		Optional<Object> optional = Optional.empty();
		System.out.println(optional.isEmpty());
		
	}
}
