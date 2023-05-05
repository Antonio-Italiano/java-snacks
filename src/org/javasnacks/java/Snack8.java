package org.javasnacks.java;

import java.util.Arrays;
import java.util.Random;

public class Snack8 {

	public static void main(String[] args) {
		
		Random random = new Random();
        
        Integer[] numeriPari = new Integer[10];
        Integer[] numeriDispari = new Integer[10];
        int p = 0;
        int d = 0;
        for (int i = 0; i < 10; i++) {
            int val = random.nextInt(101);
            if (val % 2 == 0) {
                numeriPari[p++] = val;
            } else {
                numeriDispari[d++] = val;
            }
        }
        
        System.out.println(Arrays.asList(numeriPari));        
        System.out.println(Arrays.asList(numeriDispari));
        
		
	}
}
