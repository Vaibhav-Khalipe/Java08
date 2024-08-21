package com.prowings.lambdaexpresions;

public class HelloWorld {

	
	public static void main(String[] args) {
		Runnable runnable=()->{System.out.println("hello ::");};
		
		runnable.run();
		}
	}


