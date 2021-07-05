package com.cards;

public class DeckOfCards {
	public static void main(String[] args) {
		
		System.out.println("Welcome to Deck of Cards Workshop");
		
//		Take array for cards
		
		String[] suit = {"Clubs", "Diamonds", "Hearts", "Spades"};
		String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
		
		String[] cards = new String[52];
		
		for (int i=0; i<cards.length; i++) {
			cards [i] = rank [i%13] + suit[i/13];
			 
			System.out.println(i);
			System.out.println(cards[i]);
	}

}
}
