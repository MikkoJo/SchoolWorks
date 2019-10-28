package java8Tunti;

// Vioi käyttää valmiita funktionaalisia rajapintoja
import java.util.function.IntFunction;
import java.util.function.Function;
public class J8FunctionDemo {
	static IntFunction<Double> calcPI = i -> i * Math.PI;  
	static IntFunction<String> convertString = i -> i + "€";  
	static IntFunction<Integer> doubling = i -> i * i;  

	static Function<String, Integer> countLength = str -> str.length();
	static Function<String, String> toUpper = str -> str.toUpperCase();
	static Function<String, String> toLower = str -> str.toLowerCase();
	
	public static void main(String[] args) {

		System.out.println(doubling.apply(25));
		System.out.println(calcPI.apply(5));
		System.out.println(convertString.apply(25));

		System.out.println(countLength.apply("Mikko"));
		System.out.println(toUpper.apply("ÄäkköÖsetÄ^å"));
		System.out.println(toLower.apply(toUpper.apply("ÄäkköÖsetÄ^å")));
	}

}
