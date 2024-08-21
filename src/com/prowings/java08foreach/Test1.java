package com.prowings.java08foreach;

import java.util.HashMap;

public class Test1 {

	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("Vaibhav", 123);
		map.put("Khalipe", 456);
		map.put("Java", 789);
		map.put("FullStack", 143);
		map.put("Developer", 183);
		map.put("MNC", 193);
		
		map.forEach((name,age)->System.out.println(name+"\t"+age));
	}
}
