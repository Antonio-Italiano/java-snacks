package org.javasnacks.java;

import java.util.Scanner;

public class Snack9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserisci valore base");
		int base = sc.nextInt();
		System.out.println("Inserisci valore altezza");
		int altezza = sc.nextInt();
		sc.close();
		
		int area = base * altezza;
		int perimetro = 2 * base + 2 * altezza;
		System.out.println("valore area: " + area);
		System.out.println("valore perimetro: " + perimetro);
	}
}
