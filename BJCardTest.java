/** Group7: Francis & Gustavo
* File: BJCardTest.java
* Description: 
* Lessons Learned: 
*   
* Instructor's Name: Jeff Light
*
* @author     Jeff Light, Jared Hogan
* @since       05/3/2022
*/
package BlackJack;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BJCardTest {

	  @Test
	    void getRankSuit() {
	        BJCard b1 = new BJCard(BJCard.ACE, BJCard.SPADE);
	        assertEquals(b1.getRank(), BJCard.ACE);
	        assertEquals(b1.getSuit(), BJCard.SPADE);
	    }

	    @Test
	    void setRankSuit() {
	        BJCard b1 = new BJCard(BJCard.ACE, BJCard.SPADE);
	        b1.setRank(BJCard.KING);
	        assertEquals(b1.getRank(), BJCard.KING);
	        b1.setSuit(BJCard.HEART);
	        assertEquals(b1.getSuit(), BJCard.HEART);
	        
	    }

	    }