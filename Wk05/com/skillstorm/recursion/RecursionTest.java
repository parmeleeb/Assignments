package com.skillstorm.recursion;

public class RecursionTest {

	public static void main(String[] args) {
		System.out.println(Recursion.sum(3));
		
		System.out.println(Recursion.containsLargerThan100(new int[]{69, 88, 101, 5, -5, 100, 55, 3}));
		
		System.out.println(Recursion.evenSum(-9, 11));
		
		System.out.println(Recursion.containsLargerThanN(new int[]{69, 88, 101, 5, -5, 100, 55, 3}, 101));
	}
}
