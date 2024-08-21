package com.prowings.defaultandstaticmethods;

public class TestLeftRight implements Left, Right {

	public void m1() {
		Left.super.m1();
	}

	public static void main(String[] args) {

		TestLeftRight t = new TestLeftRight();
		t.m1();

	}
}
