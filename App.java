package com.java.join.zensar.preparation;

/**
 * alt+shift+j
 * @author Ratnadip Kokate
 *  check same array arguments
 */
public class App {
	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4, 5, 6 };
		int[] arr2 = { 3, 6, 8, 9, 7, 0 };
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					System.out.println(" " + arr1[i]);
				}
			}
		}
		System.out.println("Hello World!");
	}
	
}
