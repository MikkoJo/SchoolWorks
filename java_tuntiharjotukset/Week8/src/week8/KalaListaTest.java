package week8;

public class KalaListaTest {

	public static void main(String[] args) {

		Kalalista kalat = new Kalalista();
		
		Kala kala1 = new Kala("Särki", "Mikko", 400, 30);
		Kala kala2 = new Kala("Hauki", "Mikko", 1400, 30);
		kalat.lisaa(kala2);
		kalat.lisaa(kala1);
		
		kalat.lisaa("Lohi", "Urho", 5000, 80);
		kalat.lisaa("Lohi", "Urho", 2000, 80);
		kalat.lisaa("Lohi", "Mikko", 3000, 70);
		
		System.out.println(kalat);
		
		System.out.println("*".repeat(60));
		kalat.jarjesta();
		System.out.println(kalat);
		
		System.out.println("*".repeat(60));
		kalat.poista(1);
		System.out.println(kalat);

		System.out.println("*".repeat(60));
		kalat.jarjesta();
		System.out.println(kalat);
}

}
