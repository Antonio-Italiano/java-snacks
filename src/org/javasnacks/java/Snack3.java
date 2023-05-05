package org.javasnacks.java;

public class Snack3 {

	public static void main(String[] args) {
		String[] numberList = {"1","2", "3", "4", "5", "6", "7"};
		int sum = 0;
		for(int x = 1; x <= numberList.length; x+=2) {
			
			int number = x;
			sum += number;
			System.out.println("number " + number);
			
		}
		System.out.println("sum " + sum);
	}
}
