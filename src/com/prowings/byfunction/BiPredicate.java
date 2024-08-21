package com.prowings.byfunction;
public class BiPredicate {

    public static void main(String[] args) {
    	java.util.function.BiPredicate<Integer, Integer> isSumEven = (a, b) -> (a + b) % 2 == 0;

        System.out.println(isSumEven.test(2, 4)); // true, because 2 + 4 = 6 which is even
        System.out.println(isSumEven.test(3, 4)); // false, because 3 + 4 = 7 which is odd
    }
}


//The Output of the program is not showing
