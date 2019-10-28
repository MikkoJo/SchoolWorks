package harjoitukset;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Before;
import org.junit.Test;

public class StreamAPITest {

	List<String> ducks;
	
	@Before
	public void setUp() {
		ducks = Arrays.asList("Duck, Donald", "Mouse, Mickey",
				"", "Goofy", "", "Black, Pete", "McDuck, Scrooge",
				"Duck, Louie", "Duck, Huey", "Duck, Dewey",
				"Duck, Daisy", "Gander, Gladstone");
	}
	
	@Test
	public void emptyStringTest() {
		long count = ducks.stream().filter((s) -> s.isEmpty()).count();
		System.out.println("List has " + count + " empty strings");
		assertEquals(2, count);
	}

	@Test
	public void longStringTest() {
		long count = ducks.stream().filter((s) -> s.length() > 10).count();
		System.out.println("List has " + count + " strings of length more than 10");
		assertEquals(8, count);
	}

	@Test
	public void stringStartsDTest() {
		long count = ducks.stream().filter((s) -> s.startsWith("D")).count();
		System.out.println("List has " + count + " strings which starts letter 'D'");
		assertEquals(5, count);
	}

	@Test
	public void removeEmptyTest() {
		List<String> testList = Arrays.asList("Duck, Donald", "Mouse, Mickey",
		"Goofy", "Black, Pete", "McDuck, Scrooge",
		"Duck, Louie", "Duck, Huey", "Duck, Dewey",
		"Duck, Daisy", "Gander, Gladstone");
		List<String> noEmpty = ducks
				.stream()
				.filter((s) -> !s.isEmpty())
				.collect(Collectors.toList());
		System.out.println("Filtered List without Empty Strings : " + noEmpty);
		assertEquals(testList, noEmpty);
	}

	@Test
	public void toUpperTest() {
//		List<String> testList = Arrays.asList();
		List<String> upperDUCKS = ducks
				.stream()
				.map((s) -> s.toUpperCase().replace(",", ""))
				.collect(Collectors.toList());
		System.out.print("Only ducks: ");
		System.out.println(upperDUCKS.stream()
				.filter((s) -> s.contains("DUCK"))
				.collect(Collectors.joining(", ")));
//		upperDUCKS.stream().filter((s) -> s.contains("DUCK"))
//				.forEach((s) -> System.out.print(s + ", "));
//		assertEquals(testList, noEmpty);
	}

}
