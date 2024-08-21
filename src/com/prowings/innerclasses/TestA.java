package com.prowings.innerclasses;

public class TestA {

	public static void main(String[] args) {

		A a = new A() {
			public void m1() {
				System.out.println("m1 method () of A interface");
			}

			public void m2() {
				System.out.println("m2 method () of A interface");
			}
		};

		a.m1();
		a.m2();
	}
}
