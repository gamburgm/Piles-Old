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
        this.cards = new ArrayList<>();
        
        this.cards.add(cardOne);
        this.cards.add(cardTwo);
        this.cards.add(cardThree);
        this.cards.add(cardFour);
    }
    
    
    public void inHand(int playerId) throws Exception {
        
        for (Card card : this.cards) {
            if (playerId == 1)
                card.playerOneSeen = true;
            else if (playerId == 2)
                card.playerTwoSeen = true;
            else
                ;
        }
    }
    
    public Card chooseCard(int card) {
        if (card < cards.size() && card >= 1) {
            return cards.get(card - 1);
        }
        else {
            return null;
        }
    }
    
    public void removeCard(int card) {
        this.cards.remove(card - 1);
    }
}

