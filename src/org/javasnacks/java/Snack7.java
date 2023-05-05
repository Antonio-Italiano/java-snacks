package org.javasnacks.java;

import java.util.Random;

public class Snack7 {

	public static void main(String[] args) {
			
		Random rnd = new Random();
		int val = rnd.nextInt(101);
		while (!(val % 15 == 0)) {
			System.out.println(val);	
			val = rnd.nextInt(101);
		}
		System.out.println("trovato" + val);
		}
	}

