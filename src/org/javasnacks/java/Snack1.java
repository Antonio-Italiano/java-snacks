package org.javasnacks.java;

import java.util.Scanner;

public class Snack1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserisci un numero");
		int val = sc.nextInt();
		sc.close();
		
		if(val % 2 == 0) {
			System.out.println("Il numero " + val + " è pari");
		} else {
			val = val + 1;
			System.out.println("numero pari più vicino: " + val);
		}
	}
}
