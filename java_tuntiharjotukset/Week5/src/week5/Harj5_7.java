package week5;

import java.util.ArrayList;
import java.util.Collections;

public class Harj5_7 {

	public static void main(String[] args) {

		ArrayList<Integer> myList = new ArrayList<>();
		
		// Populate myList
		for (int i = 0; i <= 100; i += 5) {
			myList.add(i);
		}
		
		System.out.println("Original myList:");

		for (Integer i: myList) {
			System.out.print(i + " ");
		}
		Collections.shuffle(myList);
		
		System.out.println("\n\nAfter randomize myList:");
		for (Integer i: myList) {
			System.out.print(i + " ");
		}

	}

}
