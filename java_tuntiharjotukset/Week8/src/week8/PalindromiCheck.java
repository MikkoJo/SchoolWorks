package week8;

import java.util.Stack;

public class PalindromiCheck {

	public static boolean isPalindomi(String word) {
		Stack<Character> characters = new Stack<>();
		
		char[] c = word.toCharArray();
		for (int i = 0; i < c.length; i++) {
			characters.push(c[i]);
		}

		boolean isPalindromi = false;
		for (int i = 0; i < c.length; i++) {
			if (characters.pop() != c[i]) {
				isPalindromi = false;
				break;
			} else
				isPalindromi = true;
		}
		return isPalindromi;
	}

}
