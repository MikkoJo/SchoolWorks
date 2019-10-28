package week7;

public class Harj7_2Test {

	public static void main(String[] args) {
		
		Reaalilukutaulu taulu = new Reaalilukutaulu();
		
		taulu.lisaa(45.45);
		taulu.lisaa(35.45);
		taulu.lisaa(565.45);
		taulu.lisaa(48865.45);
		taulu.lisaa(4435.45);
		taulu.lisaa(4555.45);
		taulu.lisaa(45.453355);
		taulu.lisaa(43535355.453535353535335);
		taulu.lisaa(45.4535);
		taulu.lisaa(45335355.455353);
		taulu.lisaa(4335.499995);
		taulu.lisaa(497975.4997975);
		taulu.lisaa(497975.497979794345);
		taulu.lisaa(4444445.441199195);
		
		taulu.tulosta();

		taulu.poista();
		taulu.poista();
		taulu.poista();
		taulu.poista();
		taulu.poista();
		taulu.poista();
		taulu.poista();
		taulu.poista();
		taulu.poista();
		taulu.poista();
		System.out.println("Poistettu kamaa");
		taulu.tulosta();

	}

}
