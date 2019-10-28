package week5;

public class Harj5_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Korttipakka deck = new Korttipakka();
		
		System.out.println("Cards in deck: " + deck.cardsInDeck());
		Kortti[] hand = deck.draw(6);
		if(hand != null) {
			for (Kortti card: hand) {
				System.out.println(card);
			}
		}
		else {
			System.out.println("Not enough cards in deck");
		}
		System.out.println("Cards in deck: " + deck.cardsInDeck());

		hand = deck.draw(66);
		if(hand != null) {
			for (Kortti card: hand) {
				System.out.println(card);
			}
		}
		else {
			System.out.println("Not enough cards in deck");
		}
		System.out.println("Cards in deck: " + deck.cardsInDeck());
		//System.out.println("Print deck:\n" + deck);
		
		deck.reShuffleDeck();
		//System.out.println("After shuffle deck:\n" + deck);

		hand = deck.draw(5);
		if(hand != null) {
			for (Kortti card: hand) {
				System.out.println(card);
			}
		}
		else {
			System.out.println("Not enough cards in deck");
		}
		System.out.println("Cards in deck: " + deck.cardsInDeck());
		//System.out.println("Print deck:\n" + deck);
	}

}
