package week10;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class Harj10_6 {

	public static void main(String[] args) {
		String fileName1 = ".";
		String fileName2 = "files/harjoitus10_6.txt";
		File file1 = new File(fileName1);
		File file2 = new File(fileName2);

		if (file1.exists() && file1.canRead() && file2.exists() && file2.canRead()) {
			try {
				if (file1.isDirectory()) {
					System.out.println("Directory: " + file1.getCanonicalPath());
					for (String name : file1.list())
						System.out.println(name);
				}

				BufferedReader reader = new BufferedReader(new FileReader(file2));
				String line = null;
				while ((line = reader.readLine()) != null) {
					System.out.println(line);
				}
				reader.close();
			} catch (IOException e) {
				System.out.println(e);
			}

		}

	}
}
