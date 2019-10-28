package kesa;

public class OmenaKoriTest {

	public static void main(String[] args) {
		Omena omppu1 = new Omena("Aino", 120);
		Omena omppu2 = new Omena("Amorosa", 80);
		Omena omppu3 = new Omena("Ola", 420);
		Kori omenakori = new Kori("P�rekori");
		omenakori.lisaaOmena(omppu1);
		omenakori.lisaaOmena(omppu2);
		omenakori.lisaaOmena(omppu3);
		omenakori.lisaaOmena(new Omena("Raike", 210));
		
		omenakori.lisaaOmena(new Omena("Valkea kuulas", 120));
		omenakori.lisaaOmena(new Omena("�kero", 120));

		System.out.println(omenakori);
	}
	
}
