package java8Tunti;

import java.util.function.Consumer;

public class J8Hello {

	// Consumer - funktio ottaa parametrin, muttei palauta mitään

	public static void printHelloJ8(Consumer<String> c, String str) {
		c.accept("Mitä nyt? " + str);
	}

	public static void printHello(String s) {
		System.out.println(s);
	}

	public static void main(String[] args) {

		printHello("Hello old school Hello");
		// Pyritään kirjoittamaan lambda-lausekkeita:
		Consumer<String> cs = (s) -> {s += s; System.out.println(s);};
		printHelloJ8(cs, "Hello new functional Java.");
		Consumer<String> cs2 = (s) -> System.out.println("koira");
		printHelloJ8(cs2, "Hello new functional Java.");
		Consumer<String> cs3 = System.out::println;
		printHelloJ8(cs3, "Hello new functional Java.");
		cs.accept("Miten tämä toimii");
	}

}
