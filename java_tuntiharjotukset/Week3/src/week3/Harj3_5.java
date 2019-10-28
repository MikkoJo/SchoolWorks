package week3;

import java.util.Scanner;

public class Harj3_5 {
	public static void main(String[] args) {
		
		int[] grades = {0,0,0,0,0,1,1,2,2,2,2,2,2,2,2,2,3,3,3,3,3,3,3,4,4,4,5,5,5,5,5};
		int[] count = new int[6];
		
		for (int i = 0; i < grades.length; i++) {
			count[grades[i]]++;
		}
		
		System.out.println("*** Tulostetaan löydet luvut***");
		for (int j = 0; j < count.length; j++) {
			System.out.print(j + ":" + count[j] + " | ");
			for (int k= 0 ; k < count[j]; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
