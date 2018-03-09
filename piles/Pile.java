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
public class Pile {
    ArrayList<Card> cards;
    int value;
    public Pile(Card card) {
        this.cards = new ArrayList<Card>();
        cards.add(card);
        this.value = 0;
    }
    
    public void add(Card card) {
        this.cards.add(card);
        this.value += card.rank;
    }
    
}

