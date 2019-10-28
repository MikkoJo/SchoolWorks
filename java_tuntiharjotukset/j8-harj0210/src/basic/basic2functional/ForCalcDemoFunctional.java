package basic.basic2functional;

import java.util.stream.*;

public class ForCalcDemoFunctional {

	public static int countSum(int begin, int end) {
		// begin, begin + 1, .... , end
		// return IntStream.rangeClosed(begin, end).reduce(0, (x, y) -> x + y);
		return IntStream.rangeClosed(begin, end).sum();
	}

	public static int multiply(int begin, int end) {
		return IntStream.rangeClosed(begin, end).reduce(1, (x, y) -> x * y);
	}

	public static void main(String args[]) {

		int sum = countSum(1, 10);
		int res = multiply(1, 10);

		System.out.println("sum 1-10 = " + sum);
		System.out.println("multiply 1-10 = " + res);

	}
}
