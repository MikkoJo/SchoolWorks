package kesa;

public class TietovisaTaulu {
	// T�nne kysymykset
	static final String kysymykset[][] = {{"Javan yritysversio?", "Java SE", "Java EE"},
			{"Uusi Java versio?", "Java SE 8", "Java SE 12"},
			{"Kuuluisa IDE?", "Eclipse", "Sun"},
			{"Javan kehitti alunperin yritys?", "Moon", "Sun", "Star"},
			{"Javasta vastaa nykyisin?", "IBM", "Oracle"}};
	static final int vastaukset[] = {1, 2, 2, 1, 2};
	
	public static void tulostaKysymykset() { 
	  // tulostaa kysymykset ja oikeat vastaukset
		for (int i = 0; i < kysymykset.length; i++) {
			System.out.println(kysymykset[i][0]);
			for (int j = 1; j < kysymykset[i].length; j++) {
				System.out.println("..... " + j + ") " + kysymykset[i][j]);
			}
			System.out.println("..... Oikea vastaus: " + vastaukset[i] + "..." +
							kysymykset[i][vastaukset[i]]);
		}
		
	}
	
	public static void main(String[] args) {
       tulostaKysymykset();
	}

}
