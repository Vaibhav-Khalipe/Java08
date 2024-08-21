package com.prowings.constructorreferenejava08;

public class Message {

	public Message(String msg) {
		super();
		System.out.println(msg);// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		Messagable messagable=Message::new;
		messagable.getMessage("Hello Vaibhav Khalipe Welcome to MNC");
	}
	
}
