package com.prowings.functions;

public class Student {

	public String name;
	public int marks;
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}
	
	
	
}
