package com.prowings.comparablecomparator;

public class Employee {

	public String name;
	public int id;
	
	
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	
	
	
}
