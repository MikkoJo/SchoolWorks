package week10_tunnit;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestFileReaderDemo {

	public static void main(String[] args) {
		FileReader fileReader = null;
		try {
			fileReader = new FileReader("files/data.txt");
		} catch (IOException e) {
			System.out.println(e);
			System.exit(100);
		}
		System.out.println("Avaaminen onnistui: " + fileReader.getEncoding());
		try {
			String line = null;
			if (fileReader != null) {
				BufferedReader bufferedReader = new BufferedReader(fileReader);
				int rivilaskuri = 1;
				while ((line = bufferedReader.readLine()) != null) {
					System.out.println(rivilaskuri++ + ":" + line);
				}
				bufferedReader.close();
			}
		} catch (IOException e) {
			System.out.println(e);
		}
		try {
			fileReader.close();
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
