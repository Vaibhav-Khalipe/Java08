package com.prowings.defaultandstaticmethods;

public class TestB  implements B{
	
	public static void m1()
	{
		System.out.println("static Method of TestB class");
	}
	
	public static void main(String[] args) {
		
		B.m1();
		
	//	TestB b= new TestB();
	//	b.m1();

	}

}
