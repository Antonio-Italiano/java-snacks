package org.javasnacks.java;

import java.util.Scanner;

public class Snack4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserisci una parola");
		String word = sc.nextLine().toLowerCase();
		sc.close();
		
		StringBuilder strb = new StringBuilder(word);
		String reversedWord = strb.reverse().toString().toLowerCase();
		
		if(word.equals(reversedWord)) {
			System.out.println("La parola è palindroma");
		} else {
			System.out.println("La parola non è palindroma");
		}
			
	}
}
