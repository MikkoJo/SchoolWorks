package java8Tunti;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamOperationsTest {

	private static void modifyList(List<Integer> iList) {
		long count = iList.stream().filter(i -> i >= 100).count();
		System.out.println("Found >= 100: " + count);
		List<Integer> newList = iList.stream().filter(i -> i <= 100).sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());
		System.out.println(newList);
	}

	private static void modifyStrList(List<String> sList) {
		List<String> newList = sList.stream()
				.filter(s -> s.length() > 0 &&
						s.toLowerCase().startsWith("a"))
				.collect(Collectors.toList());
		System.out.println(newList);
		List<String> upList = sList.stream().map(s -> s.toUpperCase())
				.collect(Collectors.toList());
		System.out.println(upList);
		List<Integer> iList = sList.stream().map(s -> s.length())
				.collect(Collectors.toList());
		System.out.println(iList);
		int count = iList.stream().mapToInt(i -> i).sum();
		System.out.println(count);
	}

	public static void main(String[] args) {
		List<Integer> iList = List.of(120, 234, 243, 465, 645, 46, 76, 54);
		List<String> sList = List.of("A", "b", "C", "d", "dee", "cee", "bee", "Aaa", "aaaa");
		iList.forEach(System.out::print);
		System.out.println();
		sList.forEach(System.out::print);
		System.out.println();
		modifyList(iList);
		modifyStrList(sList);

	}

}
