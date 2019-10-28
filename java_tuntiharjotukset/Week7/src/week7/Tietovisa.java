package week7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Tietovisa {

	private List<Kysymys> questions;
	private int right;
	private int wrong;
	private boolean ready;
	private int total;
	private String DefaultFileName = "src/week7/questions.csv";

	public Tietovisa() {
		questions = new ArrayList<Kysymys>();
		right = wrong = total = 0;
		ready = false;
	}

	public boolean initQuestionary() {
		return initQuestionary(DefaultFileName);
	}

	public boolean initQuestionary(String fileName) {
		try (Scanner scanner = new Scanner(new File(fileName));) {
			String[] temp;
			while (scanner.hasNextLine()) {
				temp = scanner.nextLine().split(";");
				questions.add(new Kysymys(temp[0], temp[1]));
			}
			scanner.close();
			shuffle();
			total = questions.size();
			ready = true;
			return true;
		}

		catch (FileNotFoundException e) {
			System.out.println("File not Found");
			return false;
		}
	}

	public Kysymys getNext() {
		return !questions.isEmpty() ? questions.remove(0) : null;
	}
	
	public int questionsLeft() {
		return questions.size();
	}
	
	public void startQuestionary() {

	}

	public void addRight() {
		right++;
	}

	public int getRight() {
		return right;
	}

	public void addWrong() {
		wrong++;
	}

	public int getWrong() {
		return wrong;
	}

	public void shuffle() {
		Collections.shuffle(questions);
	}



}
