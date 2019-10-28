package week7;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;
public class TietovisaUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tietovisa visa = new Tietovisa();
//		File test = new java.io.File("src/week7");
//		System.out.println(Arrays.deepToString(test.list()));
		Scanner in = new Scanner(System.in);
		String answer;
		Kysymys currentQuestion;
		boolean test = visa.initQuestionary();
//		if(test != true); {
//			System.out.println("Problem");
//			System.exit(1);
//			
//		}
//		
		System.out.println("***** Tietovisailu - Vastaa yhdellä sanalla *****");
		while(visa.questionsLeft() > 0) {
			currentQuestion = visa.getNext();
			System.out.println(currentQuestion.getKysymys() + "? ");
			answer = in.next();
			if(answer == currentQuestion.getVastaus()) {
				System.out.println("Oikein!");
				visa.addRight();
			}
			else {
				System.out.println("Väärin!!!!!");
				visa.addWrong();
			}
		}
		System.out.println("***** Tietovisailun Tulokset *****");
		System.out.println("\tOikeat vastaukset: " + visa.getRight());
		System.out.println("\tVäärät vastaukset: " + visa.getWrong());
	}

}
