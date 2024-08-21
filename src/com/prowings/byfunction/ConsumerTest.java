package com.prowings.byfunction;

import java.util.Date;
import java.util.function.Consumer;

public class ConsumerTest {

	public static void main(String[] args) {
		
		
		Consumer<String> consumer=i->System.out.println(i);
	consumer.accept(new Date().toString());
	
	
	}
}
