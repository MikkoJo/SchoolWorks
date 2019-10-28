package basic.basic2functional;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class Int2DArraySortFunctionalDemo {

	public static void main(String args[]) {
		int[][] a2d = { { 10, 20 }, { 33, 7 }, { 30, 10 }, { 40, 12 }, { 15, 30 }, { 15, 31 } };
		int[][] a2d2 = { { 10, 20 }, { 33, 7 }, { 30, 10 }, { 40, 12 }, { 15, 30 }, { 15, 31 } };

		Arrays.sort(a2d, new Comparator<int[]>() {

			@Override
			public int compare(int[] a, int[] b) {
				return (b[0] - a[0]);
			}
		});

		System.out.println(Arrays.deepToString(a2d));
//		Stream<int[]> test = Stream.of(a2d2).sorted((a, b) -> b[0] - a[0]);
//		test.forEach(System.out::print);
//		Stream.of(a2d2).sorted((a, b) -> b[0] - a[0]).forEach(c -> System.out.print(Arrays.toString(c)));

		/*
		 * Ei toimi, näköjään pakko laitaa (int [] a) jos ketjuttaa????
		 * Stream.of(a2d2).sorted(Comparator.comparingInt((a) ->
		 * -a[0]).thenComparing((a) -> -a[1])) .forEach(c ->
		 * System.out.print(Arrays.toString(c)));
		 * 
		 */

		Arrays.sort(a2d2, (a,b) -> b[0] - a[0]);
		Stream.of(a2d2).sorted(Comparator.comparingInt((int[] a) -> -a[0])
				.thenComparing((a) -> -a[1]))
				.forEach(c -> System.out.print(Arrays.toString(c)));

		System.out.println();

		Comparator<int[]> cmp = Comparator.comparingInt((int[] a) -> -a[0]).thenComparing((b) -> -b[1]);
        Stream.of(a2d2).sorted(cmp).forEach(c -> System.out.print(Arrays.toString(c)));

	}
}
