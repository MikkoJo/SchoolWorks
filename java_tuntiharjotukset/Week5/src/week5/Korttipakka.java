package week5;

import java.util.Collections;
import java.util.Stack;

public class Korttipakka {
	private Stack<Kortti> deck = new Stack<>();
	
	public Korttipakka() {
		// Initialize card deck
		for (int suit  = 1; suit <= 4; suit++) {
			for (int number = 2; number <=14; number++) {
				deck.add(new Kortti(suit, number));
			}
		}
		// Add 2 jokers
		deck.add(new Kortti(5, 15));
		deck.add(new Kortti(5, 15));
		Collections.shuffle(deck);
	}
	
	public Kortti[] draw(int count) {
		if (deck.size() < count) {
			return null;
		}
		
		Kortti[] cards = new Kortti[count];
		for (int i = 0; i < cards.length; i++) {
			cards[i] = deck.pop();
		}
		return cards;
		
	}
	
	public void reShuffleDeck() {
		Collections.shuffle(deck);
	}
	
	public int cardsInDeck() {
		return deck.size();
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (Kortti card: deck) {
			sb.append(card.toString() + " ");
		}
		return sb.toString();
	}

}
