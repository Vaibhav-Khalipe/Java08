package com.prowings.byfunction;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierTest2 {

	public static void main(String[] args) {
		
		Supplier<String> supplier=()->"Hello World";
        System.out.println(supplier.get());
	}
}
