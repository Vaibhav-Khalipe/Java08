package com.prowings.constructorreferenejava08;

import java.util.function.Supplier;

public class PersonConstructorReferenceExample {

	public static void main(String[] args) {
		
		Supplier<Person> personSupplier=Person::new;
		Person person=personSupplier.get();
		System.out.println(person.getName());
	}
}
