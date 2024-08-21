package com.prowings.byfunction;

public class Employee1 {

	public String name;
	public double salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee1 [name=" + name + ", salary=" + salary + "]";
	}
	
	public Employee1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee1(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	
	
	
	
}
