package com.prowings.methodreferenejava08;

public class MethodReference2 {

	public  void threadStatus()
	{
		System.out.println("Method Reference 2");
	}
	public static void main(String[] args) {
		
		Thread t=new Thread( new MethodReference2()::threadStatus);
		t.start();
	}
}
