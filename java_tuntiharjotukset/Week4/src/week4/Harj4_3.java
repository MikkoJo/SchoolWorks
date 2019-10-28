package week4;

public class Harj4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CD cd1 = new CD("Iron Maiden", "Powerslave", 3048, 8);
	    CD cd2 = new CD("Tom Petty");

	    cd2.biiseja = 12;
	    cd2.nimi = "Full Moon Fever";
	    cd2.pituus = 2398;

	    CD cd3 = new CD("Paula Koivuniemi", "Luotan Sydämen Ääneen", 2850, 12);
	    
	    System.out.println(cd1);
	    System.out.println(cd2);
	    System.out.println(cd3);
	 

	}

}

