package org.javasnacks.java;

import java.util.Scanner;

public class Snack11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserisci valore");
		int val = sc.nextInt();
		sc.close();
		
		for (int i = 1; i <= val; i++) {
		    if (val % i == 0) {
		        System.out.println(i + " è un divisore ");
		    }
		}
	}
}
