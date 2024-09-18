/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//Vishal Mahalingam
//Student #: 991696319
package card;
import java.util.Random;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Random cards = new Random();
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(cards.nextInt(13) + 1);
            c.setSuit(Card.SUITS[cards.nextInt(4)]);
            magicHand[i] = c;
        }

        Card luckyCard = new Card();
        luckyCard.setValue(3);
        luckyCard.setSUIT(Card.SUITS[3]);
        
        System.out.println("Pick a card, any card!");
        System.out.println("Enter a (card) value between 1-13:");
        int userCard = scanner.nextInt();
        System.out.println("Enter a value between 0-3 to determine the suit:");
        int userSuit = scanner.nextInt();
        
        boolean magicCard = false;
        for (Card c:magicHand){
            if (c.getValue() == userCard && c.getSuit() == Card.SUITS[userSuit]){
                magicCard = true;
            }
        }
        
        if (magicCard){
            System.out.println("Your card is in the magic hand!");
        }
        
        else{
            System.out.println("Sorry! Your card was not in the magic hand!");
        }
    }
    
}
