package week10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Harj10_7 {
	public static void main(String[] args) {
		String fileName = "files/tyontekijat.csv";
		FileReader fileReader;
		List<Map<String, String>> values = new ArrayList<>();
		try {
			fileReader = new FileReader(fileName);
			if (fileReader != null) {
				BufferedReader bufferedReader = new BufferedReader(fileReader);
				// First line == headers
				String line = null;
				String[] keys = null;
				if ((line = bufferedReader.readLine()) != null) {
					keys = line.split(",");
				}
				// Add data from CSV, doesn't handle commas in values
				String[] temp = null;
				while ((line = bufferedReader.readLine()) != null) {
					temp = line.split(",");
					Map<String, String> tempMap = new HashMap<>();
					for (int keyIndex = 0; keyIndex < keys.length; keyIndex++) {
						tempMap.put(keys[keyIndex], temp[keyIndex]);
					}
					values.add(tempMap);

				}
				bufferedReader.close();
			}

		} catch (IOException e) {
			System.out.println(e);
		}

//		System.out.println(values);
		List<String> keysToPrint = new ArrayList<>();
		keysToPrint.add("first_name");
		keysToPrint.add("last_name");
		keysToPrint.add("company");
		printCsv(keysToPrint, values);

	}

	// Print values in order
	private static void printCsv(List<String> keysToPrint, List<Map<String, String>> values) {
		StringBuilder output = new StringBuilder();
		for (Map<String, String> value : values) {
			for (String key : keysToPrint) {
				if (key.equals("company")) {
					output.append("works ");
					String comp = value.get(key);
					if (comp.isBlank())
						output.append("Nowhere");
					else
						output.append("in ");
				} 
					output.append(value.get(key) + " ");
			}
			output.append("\n");
		}
		System.out.println(output);
	}
}
