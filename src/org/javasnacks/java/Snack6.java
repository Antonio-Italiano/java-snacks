package org.javasnacks.java;

import java.util.Random;
import java.util.Scanner;

public class Snack6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserisci il numero da raggiungere");
		int userVal = sc.nextInt();
		sc.close();
		
		int sumTot = 0;
		
		for(int x = 0; sumTot <= userVal; x++) {
			
		Random rnd = new Random();
		int val = rnd.nextInt(0, userVal > 100 ? 100 : userVal);
		if(sumTot > userVal) {
			sumTot = sumTot - val;
		}
		sumTot += val;
		System.out.println(x +" " + val);
		}
		System.out.println(sumTot);
	}
}
