/** Group7: Francis & Gustavo
* File: BJHand.java
* Description: implement the Phand
* Lessons Learned: this will help us to get the hand size, add the card, get the card remove and get the value to get of A and JQK 
*   
* Instructor's Name: Jeff Light
*
* @author     Jeff Light, Jared Hogan
* @since       05/3/2022
*/
package BlackJack;
import BlackJackBase.*;
import java.util.*;
public class BJHand implements PHand  { //Implements the PHand interface

	private final ArrayList<BJCard> hand;
	public BJHand() {
        hand = new ArrayList<>();
        BJDeck deck = new BJDeck();
        addCard(deck.dealCard());
    }
	@Override
	public int getSize() { /** Returns the number of cards in the hand. */
		// TODO Auto-generated method stub
	    return hand.size();
	}

	@Override
	public void addCard(PCard card) { /** Adds a card to the end of the hand. */
		// TODO Auto-generated method stub
		 hand.add((BJCard) card);
	}

	@Override
	public PCard getCard(int index) { /** Returns a card from the hand (but not removed). */
		// TODO Auto-generated method stub
		 return (PCard) hand.get(index);
	}

	@Override
	public PCard removeCard(int index) { /** Removes and returns the card */
		// TODO Auto-generated method stub
		 return (PCard) hand.remove(index);
	}
	/** Returns the point value of the current hand.
	 *  Basic BlackJack rules apply:
	 *  Ranks 2 - 10 are valued at their face value
	 *  Ranks Jack - King are valued at 10
	 *  Ace is valued at 11 if the total value of all cards in the hand is <= 21
	 *  Otherwise, Ace is valued as 1 
	 */
	@Override
	public int getValue() {
		// TODO Auto-generated method stub
		int total =0;
        int aces =0 ;
        if (hand.isEmpty()) return 0;
        else {
            for(BJCard card : hand) {
                if (((BJCard) card).getRank() >= 10) { //Ranks Jack - King are valued at 10
                	total += 10;
                } else if (((BJCard) card).getRank() == 1) {  
                	total += 11;
                    aces += 1; // Otherwise, Ace is valued as 1 
                } else {
                	total += card.getRank();
                }
                //for loop for the aces
                for(int i = 0; i < aces; i++) { //Ace is valued at 11 if the total value of all cards in the hand is <= 21
                    if(total > 21 && aces >= 1) {
                    	total -= 10;
                        aces -= 1;// Otherwise, Ace is valued as 1 
                    }
                }//end the loop for the aces
            }//end the loop for all cards
        }//end if else, not empty card
        return total; 
	}
	
}
