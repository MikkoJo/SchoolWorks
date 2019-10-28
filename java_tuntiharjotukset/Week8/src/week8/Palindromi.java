package week8;

public class Palindromi {

	public static void main(String[] args) {

		String[] words = {"AnnA", "test", "pilipali", "saippuakauppias"};
		
		for(String word: words) {
			if(PalindromiCheck.isPalindomi(word)) {
				System.out.println(word + " on palidromi");
			}
			else {
				System.out.println(word + " ei ole palindromi");
			}
			
		}
	}

}
