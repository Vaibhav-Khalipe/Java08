package com.prowings.predefinedfunctionalinterfaces;

public class Employee {

	public int salary;
	public String name;
	public boolean isHavingGf;
	
	
	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public boolean isHavingGf() {
		return isHavingGf;
	}


	public void setHavingGf(boolean isHavingGf) {
		this.isHavingGf = isHavingGf;
	}




	public String toString() {
		return "Employee [salary=" + salary + ", name=" + name + ", isHavingGf=" + isHavingGf + "]";
	}


	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Employee(int salary, String name, boolean isHavingGf) {
		super();
		this.salary = salary;
		this.name = name;
		this.isHavingGf = isHavingGf;
	}
	
	
	
	
	
	
	
	
}
