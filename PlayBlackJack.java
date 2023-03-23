/** Group7: Francis & Gustavo
* File: PlayBlackJack.java
* Description: run pgmae and change values of colors
* Lessons Learned: this will help us to execute the GUI from PGame, and chnage the values of color from the guy to have the same the result like the example:
*   
* Instructor's Name: Jeff Light
*
* @author     Jeff Light, Jared Hogan
* @since       05/3/2022
*/
package BlackJackTest;
import java.awt.Color;
//import java.awt.Graphics;

import BlackJack.*;
import BlackJackBase.*;

//import javax.swing.JFrame;
//import javax.swing.JPanel;

public class PlayBlackJack  {
	public static void main(String[] args) {
	
		//HandTest.run(new BJDeck(), new BJHand());
		

		Color Dark_Green = new Color(0,102,0); //Darkgreen
		
		
		//Modify in PCard.java for the 1-5 requirements.
		PGame.setBackgroundColor(Dark_Green); //Game’s background color is not light gray.
		PGame.setBannerColor(Color.DARK_GRAY); //Game’s banner color is not white.
		PGame.setBannerTextColor(Color.white);  //Game’s banner text color is not green.
		PGame.setStatusTextColor(Color.BLACK); //Game’s status text color is not green.
		PGame.setButtonColor(Color.LIGHT_GRAY); //Game’s button color is not blue.
		PGame.setButtonHighlightColor(Color.RED); //Game’s button highlight color is not cyan.
		PGame.setButtonTextColor(Color.BLACK); //Game’s button text color is not green.
					//Modify in PCard.java	  //Card’s Stripe color is not light gray (while hidden).
		PGame.setFont("TimesNewRoman"); //Game’s font is not Sans Serif
		
		PGame.run( new BJDeck(), new BJHand(),new BJHand()); //deck, dealer, player
	
		
	/*	BJCard b1 = new BJCard(BJCard.ACE, BJCard.SPADE);
        CardTest.run(b1);
				
        BJCard b2 = new BJCard(BJCard.SIX, BJCard.HEART);
        CardTest.run(b2);
        
        BJCard b3 = new BJCard(BJCard.JACK, BJCard.SPADE);
        CardTest.run(b3);
        
        BJCard b4 = new BJCard(BJCard.KNIGHT, BJCard.HEART);
        CardTest.run(b4);
        
        BJCard b5 = new BJCard(BJCard.QUEEN, BJCard.DIAMOND);
        CardTest.run(b5);
        
        BJCard b6 = new BJCard(BJCard.KING, BJCard.CLUB);
        CardTest.run(b6); */
}
}