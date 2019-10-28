package week10;

public class Harj10_1 {


	public static void main(String[] args) throws NumeerinenRajaPoikkeus {

		int arvo = 22;
		
		//Tarkistus.tarkastaRajat(arvo);
		try {
			Tarkistus.tarkastaRajat(arvo);
		}

		catch (NumeerinenRajaPoikkeus ex) {
			System.out.println(ex);
			System.out.println(ex.getMessage());
		}

		finally {
			System.out.println("Lohko suoritetaan aina.");
		}

	}

}

class Tarkistus {
	public static void tarkastaRajat(int arvo) throws NumeerinenRajaPoikkeus {
		final int MAX = 20;
		final int MIN = 0;
		
		if(arvo < MIN || arvo  > MAX) {
			throw new NumeerinenRajaPoikkeus("Luku " + arvo + " on alueen ulkopuolella");
		}
	}

}
