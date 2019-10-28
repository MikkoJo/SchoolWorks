package week5;

import java.util.Random;

public class Harj5_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kortti card1 = new Kortti();
		Kortti card2 = new Kortti();
		Kortti card3 = new Kortti();
		
		Random rand = new Random();
		Kortti.setTrump(rand.nextInt(4) + 1);
		System.out.println(card1.getTrump());
		if(card1.onSuurempi(card2)) {
			System.out.println(card1 + " on suurempi kuin " + card2);
		}
		else {
			System.out.println(card1 + " on pienempi kuin " + card2);
		}

		if(card2.onSuurempi(card3)) {
			System.out.println(card2 + " on suurempi kuin " + card3);
		}
		else {
			System.out.println(card2 + " on pienempi kuin " + card3);
		}
		if(card1.onSuurempi(card3)) {
			System.out.println(card1 + " on suurempi kuin " + card3);
		}
		else {
			System.out.println(card1 + " on pienempi kuin " + card3);
		}
	}

}
