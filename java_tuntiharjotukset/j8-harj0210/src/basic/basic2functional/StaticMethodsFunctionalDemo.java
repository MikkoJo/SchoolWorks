package basic.basic2functional;

import java.util.function.BiFunction; // Valmis funktionaalinen rajapinta

public class StaticMethodsFunctionalDemo {

	// Funktion määrittelyvaihe
	// Kaksi input-argumenttiä (Integer, Integer => return Integer)
	// Viimeinen on siis palautettavan tulokset tietotyyppi (return Integer)
	static final BiFunction<Integer, Integer, Integer> sum = (a, b) -> a + b;

	@SuppressWarnings("static-access")
	public static void main(String args[]) {
		// Tässä vaiheessa vasta suoritetaan funktiokutsu apply()-metodilla
		System.out.println(sum.apply(10, 20));
		System.out.println(StaticMethodsFunctionalDemo.sum.apply(11, 22));
		{
			StaticMethodsFunctionalDemo s1 = new StaticMethodsFunctionalDemo();
			System.out.println(s1.sum.apply(30, 40));
			StaticMethodsFunctionalDemo s2 = new StaticMethodsFunctionalDemo();
			System.out.println(s2.sum.apply(30, 40));
		}

	}
}
