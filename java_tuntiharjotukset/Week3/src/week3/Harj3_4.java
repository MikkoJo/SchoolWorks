package week3;

import java.util.Scanner;

public class Harj3_4 {

	public static void main(String[] args) {

		String test = "123j4kdaksjdjaksk33%&/()!#¤42423jkjjkj323k-233232-ffdfd-fd";
		Scanner sc = new Scanner(test);
		sc.useDelimiter("");
		StringBuilder sb = new StringBuilder();

		while (sc.hasNext()) {
			try {
				sb.append(sc.nextInt());
			}
			
			catch (Exception e) {
				sc.next();
			}
		}
		String[] intString = sb.toString().split("");
		int[] intTable = new int[intString.length];

		for (int i = 0; i < intString.length; i++) {
			intTable[i] = Integer.parseInt(intString[i]);
		}
		
		for (int j = 0; j < intTable.length; j++) {
			System.out.println(intTable[j]);
		}
		
		sc.close();
	}

}
