package week10;

import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Harj10_4 {
	
	public static void main(String[] args) {
		String fileName = "harjoitus10.txt";
		String[] data = {"What is Lorem Ipsum?",
				"Lorem Ipsum is simply dummy text of the printing and typesetting industry."};
		String inData[] = new String[2];
		
		try {
//			FileWriter outFile = new FileWriter(fileName);
//			PrintWriter output = new PrintWriter(outFile);
			PrintWriter output = new PrintWriter(fileName);
			for(String line: data) {
				output.println(line);
			}
			output.close();
//			outFile.close();
			
			FileReader inFile = new FileReader(fileName);
			BufferedReader inputData = new BufferedReader(inFile);
			int i = 0;
			String line;
			while((line = inputData.readLine()) != null) {
				inData[i] = line;
				i++;
			}
			
			printArray(data);
			printArray(inData);
			inputData.close();
			inFile.close();
			
			
		} catch (IOException e) {
			System.out.println("Something wrong with opening file.");
		}
	}

	public static void printArray(String[] arr) {
		for(String s: arr) {
			System.out.println(s);
		}
	}
}
