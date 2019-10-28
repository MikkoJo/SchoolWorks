package week3;

public class Harj3_1 {

	public static void main(String[] args) {
		
		// Main loop
		for (int i = 0; i < 10; i++) {
			//First column
			for (int j = 0; j < 10 - i; j++) {
				System.out.print("*");
			}
			//print(10 - i, '*');
			//print(10, ' ');
			for (int l = 0; l < 10; l++ ) {
				System.out.print(" ");
			}
			//second column
			for (int k = 0; k < i + 1; k++ ) {
				System.out.print("*");
			}
			if (i < 5) {
				for (int l = 0; l < 10 - i; l++ ) {
					System.out.print(" ");
				}
				for (int k = 0; k < 2 * i + 1; k++) {
					System.out.print("*");
				}			}
			else {
				for (int l = 0; l < i + 1; l++ ) {
					System.out.print(" ");
				}
				for (int k = 0; k < 10 - (i - 5) * 2 - 1; k++) {
					System.out.print("*");
				}			}
//			print(i + 1, '*');
//			print(10, ' ');
			//Third column
			
			System.out.print("\n");
		}
	}

	private static void print(int count, char c) {
		for (int i = 0; i < count; i++) {
			System.out.print(c);
		}
	}
}
/*
 **********                  *               *

 *********                 **              ***

 ********                 ***             *****

 *******                 ****            *******

 ******                 *****           *********

 *****                 ******           *********

 ****                 *******            *******

 ***                 ********             *****

 **                 *********              ***

 *                 **********               *
*/