package week5;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Kortti {
	private final int suit; // 1-4
	private final int number; // 2-14
	static private int trumpCard = 0;
	
	private Map<Integer, String> suitToString = new HashMap<>();
	private Map<Integer, String> numberToString = new HashMap<>();
	
	public Kortti() {
		Random rand = new Random();
		this.suit = rand.nextInt(5) + 1;
		if (this.suit == 5) {
			this.number = 15; // Joker
		}
		else {
			this.number = rand.nextInt(13) + 2;
		}
		populateMaps();
	}
	private void populateMaps() {
		// Populate maps
		suitToString.put(1, "Hertta");
		suitToString.put(2, "Ruutu");
		suitToString.put(3, "Risti");
		suitToString.put(4, "Pata");
		suitToString.put(5, "Jokeri");
		
		numberToString.put(2, "Kakkonen");
		numberToString.put(3, "Kolmonen");
		numberToString.put(4, "Nelonen");
		numberToString.put(5, "Vitonen");
		numberToString.put(6, "Kutonen");
		numberToString.put(7, "Seiska");
		numberToString.put(8, "Kasi");
		numberToString.put(9, "Ysi");
		numberToString.put(10, "Kymppi");
		numberToString.put(11, "Jätkä");
		numberToString.put(12, "Rouva");
		numberToString.put(13, "Kuningas");
		numberToString.put(14, "Ässä");
		numberToString.put(15, "");
	}
	
	public Kortti(int suit, int number) {
		this.suit = suit;
		this.number = number;
		populateMaps();
	}
	
/*	public Kortti(String suit, int number) {
		populateMaps();
		this.suit = suit;
		this.number = number;
	}
*/
	public static void setTrump(int suit) {
		if (suit >= 1 && suit <= 4 ) {
			trumpCard = suit;
		}
	}
	
	public String getTrump() {
		return "Valtti on " + suitToString.get(trumpCard);
	}
	public int getNumber() {
		return number;
	}
	
	public String getNumberString() {
		return numberToString.get(number);
	}

	public int getSuit() {
		return suit;
	}

	public String getSuiString() {
		return suitToString.get(suit);
	}
	
	
	public static boolean onSuurempi(Kortti kortti1, Kortti kortti2) {
		if (kortti1.getSuit() == trumpCard && kortti2.getSuit() == trumpCard) {
			return kortti1.getNumber() > kortti2.getNumber();
		}
		else if (kortti1.getSuit() == trumpCard && kortti2.getSuit() != trumpCard) {
			return true;
		}
		else {
			return false;
		}
	}

	public boolean onSuurempi(Kortti kortti2) {
		// TODO If numbers are equal check suite
		if (this.suit == trumpCard && kortti2.getSuit() == trumpCard) {
			return this.number > kortti2.getNumber();
		}
		else if (this.suit == trumpCard && kortti2.getSuit() != trumpCard) {
			return true;
		}
		else if (this.suit != trumpCard && kortti2.getSuit() == trumpCard) {
			return false;
		}
		else {
			return this.number > kortti2.getNumber();
		}
	}

	public String toString() {
		return getSuiString() + " " + getNumberString();
	}
	
}
