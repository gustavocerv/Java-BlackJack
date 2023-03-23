/** Group7: Francis & Gustavo
* File: BJCard.java
* Description: 
* Lessons Learned: 
*   
* Instructor's Name: Jeff Light
*
* @author     Jeff Light, Jared Hogan
* @since       05/3/2022
*/
package BlackJack;
import BlackJackBase.PCard;
import java.awt.*;
public class BJCard extends PCard {
	//Attributes
	int rank;
    int suit;
    boolean hidden = true;
    
    //Rank
    public static final int ACE = 1;
    public static final int TWO = 2;
    public static final int THREE = 3;
    public static final int FOUR = 4;
    public static final int FIVE = 5;
    public static final int SIX = 6;
    public static final int SEVEN = 7;
    public static final int EIGHT = 8;
    public static final int NINE = 9;
    public static final int TEN = 10;
    public static final int JACK = 11;
    public static final int KNIGHT = 12;
    public static final int QUEEN = 13;
    public static final int KING = 14;
    //Suit
    public static final int CLUB = 1;
    public static final int DIAMOND = 2;
    public static final int HEART = 3;
    public static final int SPADE = 4;
    
    //Method
    public BJCard(int rank, int suit) {
        
        hidden = false;
        this.rank = rank;
        this.suit = suit;
    }
    // Getter and Setter
    
	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public int getSuit() {
		return suit;
	}

	public void setSuit(int suit) {
		this.suit = suit;
	}
	
	//Override PCard

	@Override
	public void hideCard() {
		// TODO Auto-generated method stub
		hidden = true;
		
	}

	@Override
	public void showCard() {
		// TODO Auto-generated method stub
		 hidden = false;
		
	}

	@Override
	public boolean isHidden() {
		// TODO Auto-generated method stub
		
		 return hidden;
	}

	@Override
	public String getText() {
		// TODO Auto-generated method stub
		String r = "";  //rank
		String s = ""; //suit
		switch (rank) {
		case ACE :
			r = "A";
			break;
		case TWO :
			r = "2";
			break;
		case THREE :
			r = "3";
			break;
		case FOUR : 
			r = "4";
			break;
		case FIVE :
			r = "5";
			break;
		case SIX :
			r = "6";
			break;
		case SEVEN :
			r = "7";
			break;
		case EIGHT :
			r = "8";
			break;
		case NINE :
			r = "9";
			break;
		case TEN :
			r = "10";
			break;
		case JACK :
			r = "J";
			break;
		case KNIGHT :
			r = "Kn";
			break;
		case QUEEN :
			r = "Q";
			break;
		case KING :
			r = "K";
			break;
		}		
		switch (suit) {
		case SPADE :
			s = "\u2660"; //SPADE
			break;
		case HEART :
			s = "\u2665"; // HEART
			break;
		case DIAMOND :
			s = "\u2666"; // DIAMOND
			break;
		case CLUB :
			s = "\u2663"; //CLUB
			break;
		}
		return r+s;
	}

	@Override
	public Color getBorderColor() {
		// TODO Auto-generated method stub
		Color color = null;
		if(rank==BJCard.ACE) {
			color = Color.blue;
		}
		else {
			color = Color.blue;
		}
		return color;
	
	}

	@Override
	public Color getFontColor() {
		// TODO Auto-generated method stub
		Color color = null;
		if(suit==BJCard.HEART||suit==BJCard.DIAMOND) {
			color = Color.red;
		}
		else {
			color = Color.black;
		}
		return color;
	}

	
	
	
	}