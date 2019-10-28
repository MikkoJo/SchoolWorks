package week7;

public class KalenteriTapahtumaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KalenteriTapahtuma koulutus = new KalenteriTapahtuma(17, 6, 2015, 9, "Koulutus");

		KalenteriTapahtuma ruokailu = new KalenteriTapahtuma(17, 6, 2015, 11, "Ruokailu");

		KalenteriTapahtuma palaveri = new KalenteriTapahtuma(17, 6, 2015, 14, "Palaveri");
		
		System.out.println(koulutus);
System.out.println(koulutus.getKalenteri().getTime());
	}

}
