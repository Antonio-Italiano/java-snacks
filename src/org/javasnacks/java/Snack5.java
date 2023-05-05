package org.javasnacks.java;

import java.util.Random;
import java.util.Scanner;

public class Snack5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserisci un numero");
		int max = sc.nextInt();
		sc.close();
		
		int sumTot = 0;
		int sumPari = 0;
		int sumDispari = 0;
		int minTot = 100;
		int maxTot = 0;
		
		for(int x = 0; x < max; x++) {
			
		Random rnd = new Random();
		int val = rnd.nextInt(0, 101);
		sumTot += val;
		System.out.println(x +" " + val);
		
		if(val < minTot) {
			minTot = val;
		} 
		if(val > maxTot){
			maxTot = val;
		}
		
		if(val % 2 == 0) {
			sumPari += val;
		} else {
			sumDispari += val;
		}
		}
		
		System.out.println("Somma di tutti i valori: " + sumTot);
		System.out.println("Somma dei valori pari: " + sumPari);
		System.out.println("Somma dei valori dispari: " + sumDispari);
		System.out.println("Media di tutti i valori: " + sumTot / 2);
		System.out.println("Media dei valori dispari: " + sumDispari / 2);
		System.out.println("valore più basso: " + minTot);
		System.out.println("valore piu alto: " + maxTot);
	}
}
