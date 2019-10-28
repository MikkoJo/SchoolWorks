package week10;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Harj10_8 {

	public static void main(String[] args) {
		String fileName = "files/harjoitus10_6.txt";
		try {
			FileReader fr = new FileReader(fileName);
			Scanner sc = new Scanner(fr);
			sc.useDelimiter("\\s+");
			while(sc.hasNext()) {
				System.out.println(sc.next());
			}
			sc.close();
			fr.close();
		} catch (IOException e) {
			System.out.println(e);
		}
		
	}

}
