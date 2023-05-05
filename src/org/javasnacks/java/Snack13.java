package org.javasnacks.java;

import java.util.Arrays;

public class Snack13 {

	public static void main(String[] args) {
		Integer[] arr1 = { 1, 2, 3, 4, 5 };
		Integer[] arr2 = { 34, 35, 36, 37, 38 };
		
		Integer[] copyArr1 = new Integer[arr1.length];
		Integer[] copyArr2 = new Integer[arr2.length];
		
		for (int i = 0; i < arr1.length; i++) { 
			if(copyArr1[0] != arr2[0]) {				
				copyArr1[0] = arr2[0];
			} else {				
			copyArr1[i] = arr1[i];		
			}
		}
		for (int i = 0; i < arr2.length; i++) {  
			if(copyArr2[0] != arr1[0]) {				
				copyArr2[0] = arr1[0];	
			} else {				
				copyArr2[i] = arr2[i];	
			}
			
				
			
			
		}
		
		System.out.println(Arrays.asList(copyArr1));
		System.out.println(Arrays.asList(copyArr2));
	}
}
