package week4;

public class Harj4_3b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CD[] CdTaulu = new CD[3];
		CdTaulu[0] = new CD("Iron Maiden", "Powerslave", 3048, 8);
		CdTaulu[1] = new CD("Tom Petty");

		CdTaulu[1].biiseja = 12;
		CdTaulu[1].nimi = "Full Moon Fever";
		CdTaulu[1].pituus = 2398;

		CdTaulu[2] = new CD("Paula Koivuniemi", "Luotan Sydämen Ääneen", 2850, 12);
	    
		for (int i = 0; i < CdTaulu.length; i++) {
			System.out.println(CdTaulu[i]);
		}
	 

	}

}
