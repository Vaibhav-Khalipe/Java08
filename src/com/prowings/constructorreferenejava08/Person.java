package com.prowings.constructorreferenejava08;

public class Person {

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = "Default Name";
	}

	private String name;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(String name) {
		super();
		this.name = name;
	}
	
	
}
