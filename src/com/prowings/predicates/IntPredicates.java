package com.prowings.predicates;

import java.util.function.IntPredicate;

public class IntPredicates {

	
	public static void main(String[] args) {
		int[]x= {0,5,10,15,20,25,30,40};
		
		IntPredicate p=i->i%2==0;
		
		for(int x1:x)
		{
			if(p.test(x1))
			{
				System.out.println(x1);
			}
		}
	}
}
