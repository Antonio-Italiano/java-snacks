package org.javasnacks.java;

public class Snack3 {

	public static void main(String[] args) {
		String[] numberList = {"1","2", "3", "4", "5", "6", "7"};
		int sum = 0;
		for(int x = 0; x <= numberList.length; x++) {
			
			int number = x;
			if(number % 2 != 0) {
				sum += number;
				System.out.println("number " + number);
			}
		}
		System.out.println("sum " + sum);
	}
}
