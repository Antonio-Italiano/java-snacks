package org.javasnacks.java;

import java.util.Random;

public class Snack2 {

	public static void main(String[] args) {
		String[] nameList = { "Dua", "Paris", "Manuel", "Francesco", "Ilary", "Bebe", "Pardis", "Martina", "Rachel"};	
		String[] surnameList = { "Lipa", "Hilton", "Agnelli", "Totti", "Blasi", "Vio", "Zarei", "Maccherone", "Zeilic"};
		
		for(int x = 0; x <= nameList.length; x++) {
			
			Random rnd = new Random();
			int val = rnd.nextInt(nameList.length);
			int val2 = rnd.nextInt(surnameList.length);
			System.out.println(nameList[val] + " " + surnameList[val2]);
		}
	}
}
