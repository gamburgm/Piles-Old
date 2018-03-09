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
public class Deck {
    
    Random rand;
    public ArrayList<Card> cards;
    
    public Deck() throws Exception {
        this.rand = new Random();
        this.cards = new ArrayList<>();
        initDeck(); 
    }
    
    private void initDeck() throws Exception {
        
            for (int i = 0; i < 4; i++) {
            
            Suit suit;
            
            switch(i) {
                case 0:
                    suit = Suit.SPADES;
                    break;
                case 1:
                    suit = Suit.CLUBS;
                    break;
                case 2:
                    suit = Suit.DIAMONDS;
                    break;
                default:
                    suit = Suit.HEARTS;
                    break;
            }
        
            for (int j = 1; j <= 13; j++) {
                    cards.add(new Card(j, suit, false, false));
                
            }
        }
        
    }
    
    public Card draw() {
        int index = rand.nextInt(this.cards.size());
        
        Card drawnCard = this.cards.get(index);
        
        this.cards.remove(index);
        
        return drawnCard;
    }
  
  
}

