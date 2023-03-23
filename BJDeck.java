/** Group7: Francis & Gustavo
* File: BJDeck.java
* Description: 
* Lessons Learned: 
*   
* Instructor's Name: Jeff Light
*
* @author     Jeff Light, Jared Hogan
* @since       05/3/2022
*/
package BlackJack;
import java.util.*;
import BlackJackBase.*;


public class BJDeck implements PDeck{
	ArrayList<BJCard> cards;
	
	public BJDeck() {
		cards = new ArrayList<BJCard>();
		for(int b = 1;b<=14;b++) {
			for(int j = 1;j<=4;j++) {			
			cards.add (new BJCard(b,j));
			
			}
		}
	}
	@Override
	public void shuffle() { /** Randomizes the deck. */
		// TODO Auto-generated method stub
		 Collections.shuffle(cards);
	}

	@Override
	public void addCard(PCard card) { /** Adds a card to the end of the deck. */
		// TODO Auto-generated method stub
		cards.add((BJCard) card);
	}

	@Override
	public PCard dealCard() { 	/** Removes a card from the end of the deck. Returns Null if the deck is empty.*/
		// TODO Auto-generated method stub
		if(cards.isEmpty()) {
			return null;	
		}
		else {
			return cards.remove(cards.size()-1);	
			}
	}	


	@Override
	public PCard dealHiddenCard() { /** Removes a card from the end of the deck and marks it as hidden. Returns Null if the deck is empty.*/
		// TODO Auto-generated method stub
		if(cards.isEmpty()) { //(cards.size() != 0) 
			return null;
		}
		else {
			BJCard card = cards.remove(cards.size()-1);
			card.hideCard();
			return card;
		}
	}

	@Override
	public int cardCount() { /** Returns the number of cards in the deck. */
		// TODO Auto-generated method stub
		return cards.size();
	}

}