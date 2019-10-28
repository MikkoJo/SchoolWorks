package basic.functional;

import java.util.function.BiFunction;
@FunctionalInterface
interface MyBiFunction<T, U, R> {
	public R apply(T a, U b);
}


public class StaticMethodsFunctionalDemo {

	static final BiFunction<Integer, Integer, Integer> sum = (n1, n2) -> n1 + n2;
	static final MyBiFunction<Integer, Integer, Integer> sumInt = (n1, n2) -> n1 + n2;

	public static void main(String args[]) {
		System.out.println(sum.apply(10, 20));
		System.out.println(sum.apply(11, 22));
		System.out.println(sum.apply(30, 40));
		System.out.println(sum.apply(30, 40));

		System.out.println(sumInt.apply(10, 20));
		System.out.println(sumInt.apply(11, 22));
		System.out.println(sumInt.apply(30, 40));
		System.out.println(sumInt.apply(30, 40));
	}
}
