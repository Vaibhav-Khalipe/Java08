package com.prowinngs.strreamapi;

import java.util.Arrays;

public class Test7 {

	public static void main(String[] args) {
		
		Integer[]numbers= {1,2,3,4,5,6,7,8,9,10} ;
		int sum=Arrays.stream(numbers).filter(i->-i%2!=0).mapToInt(Integer::intValue).sum();
		System.out.println(sum);
	}
}
