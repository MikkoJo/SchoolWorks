package kesa;

public class LuokanOppilasTest {
	public static void main(String[] args) {
		LuokanOppilas matti = new LuokanOppilas("Matti", true);
		LuokanOppilas pekka = new LuokanOppilas("Pekka", false);
		LuokanOppilas kaarina = new LuokanOppilas("Kaarina", false);
		LuokanOppilas aino = new LuokanOppilas("Aino", false);
		LuokanOppilas annikki = new LuokanOppilas("Annikki", true);
		matti.tulosta();
		pekka.setIstuu(true);
		pekka.tulosta();
		annikki.setIstuu(false);
		aino.tulosta();
		annikki.tulosta();
		System.out.println(matti);
		System.out.println(pekka);
		System.out.println(kaarina);
		// Lis�teht�v�
		System.out.println("Luokassa on oppilaita on yhteens� " + LuokanOppilas.oppilaitaYhteensa() + " kappaletta");

	}

}
