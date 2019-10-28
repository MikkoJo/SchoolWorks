package harjoitukset;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileReaderFilterTest {

	public static void main(String[] args) {

		String fileName = "koe.txt";
		List<String> javaList = new ArrayList<>();
		
		Path path = Paths.get(fileName);
		try ( Stream<String> lines = Files.lines(path)) {
			javaList = lines
					.filter(s -> s.toLowerCase().contains("java"))
					.collect(Collectors.toList());
			
			System.out.println("Printing lines of text file including word 'java':");
			javaList.forEach(System.out::println);
			System.out.println("Lines found: " + javaList.size());
		}
		
		catch (IOException e) {
			System.out.println(e.getStackTrace());
		}
	}

}
