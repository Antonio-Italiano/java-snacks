package org.javasnacks.java;

import java.util.Random;

public class Snack8 {

	public static void main(String[] args) {
		
		Random random = new Random();
        
        int[] numeriPari = new int[10];
        int[] numeriDispari = new int[10];
        
       
        for (int i = 0; i < 10; i++) {
            int val = random.nextInt(101);
            if (val % 2 == 0) {
                numeriPari[i] = val;
            } else {
                numeriDispari[i] = val;
            }
        }
        
        System.out.println("\nNumeri dispari: ");
        for (int x = 0; x < numeriPari.length; x++) {
                System.out.print(numeriPari[x]);
        }
        
        System.out.println("\nNumeri dispari: ");
        for (int x = 0; x < numeriDispari.length; x++) {
                System.out.print(numeriDispari[x]);
        }
		
	}
}
