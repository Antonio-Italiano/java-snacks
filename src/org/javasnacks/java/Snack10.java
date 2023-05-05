package org.javasnacks.java;

import java.util.Scanner;

public class Snack10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserisci valore raggio");
		int raggio = sc.nextInt();
		
		sc.close();
		
		double area = ((raggio * raggio) * 3.14);
		double perimetro =  ((2 * raggio) * 3.14);
		System.out.println("valore area: " + area);
		System.out.println("valore perimetro: " + perimetro);
	}
}
