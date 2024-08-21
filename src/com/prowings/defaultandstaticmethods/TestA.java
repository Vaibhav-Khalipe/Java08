package com.prowings.defaultandstaticmethods;

public class TestA {

	public void m1()
	{
		System.out.println("Overriding Version of Default Method");
	}
	
	public static void main(String[] args) {
		
		
		TestA a= new TestA();
		a.m1();
		
		 
	}
}
