package harjoitukset;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;

public class ArrayFunctionalTest {
	final static List<Integer> numbers = Arrays.asList(5, 10, 15, 20, 11, 16, 21, 26, 25, 3);

	@Test
	public void collectEvenNumbers() {
	
		List<Integer> evenNumbers = numbers.stream()
				.filter(i -> i % 2 == 0)
				.collect(Collectors.toList());
	  // TODO: Kerätään vain parilliset luvut
	  assertEquals((Integer)evenNumbers.size(), (Integer)4);

	}
	
	@Test
	public void collectOddNumbers() {
	
		List<Integer> oddNumbers = numbers.stream()
				.filter(i -> i % 2 != 0)
				.collect(Collectors.toList());
	  // TODO: Kerätään vain parittomat luvut
	  assertEquals((Integer)oddNumbers.size(), (Integer)6);

	}
	
	@Test
	public void sortArray() {
		List<Integer> testNumbers = Arrays.asList(3, 5, 10, 11, 15, 16, 20, 21, 25, 26);
		List<Integer> sorted = numbers.stream().sorted().collect(Collectors.toList());
		assertEquals(testNumbers, sorted);
	}

	@Test
	public void multiplyArray() {
		List<Integer> testNumbers = Arrays.asList(25, 100, 225, 400, 121, 256, 441, 676, 625, 9);
		List<Integer> multiplied = numbers.stream()
				.map(i -> i*i)
				.collect(Collectors.toList());
		assertEquals(testNumbers, multiplied);
		
	}
	
	@Test
	public void sumArray() {
		int sum = numbers.stream().reduce(0, (a, b) -> a + b);
//		System.out.println(sum);
		assertEquals(152, sum);
	}
	
	@Test
	public void arrayToString() {
		String str = numbers.stream()
				.map(i -> i.toString())
				.reduce("", (a, b) -> a + ", " + b);
		System.out.println(str);
		
	}
}
