/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piles;
import java.util.*;

/**
 *
 * @author Mitch
 */
public class Hand {
    ArrayList<Card> cards;
    
    public Hand(Card cardOne, Card cardTwo, Card cardThree, Card cardFour) {
        cards.add(cardOne);
        cards.add(cardTwo);
        cards.add(cardThree);
        cards.add(cardFour);
    }
    
    
    public Hand inHand(int playerId) throws Exception {
        
        ArrayList<Card> newHand = new ArrayList<Card>();
        
        for (Card card : this.cards) {
            if (playerId == 1)
                newHand.add(new Card(card.rank, card.suit, true, false));
            else if (playerId == 2)
                newHand.add(new Card(card.rank, card.suit, false, true));
            else
                newHand.add(new Card(card.rank, card.suit, false, false));
        }
           
        this.cards = newHand;
        
        return this;
    }
}

