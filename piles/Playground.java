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
public class Playground {
    Player playerOne;
    Player playerTwo;
    Pile pileOne;
    Pile pileTwo;
    Pile pileThree;
    Pile pileFour;
    Deck deck;
    
    public Playground() throws Exception {
        this.deck = new Deck();
        
        this.playerOne = new Player(1, deck.draw(), deck.draw(), 
                deck.draw(), deck.draw());
        this.playerTwo = new Player(2, deck.draw(), deck.draw(),
                deck.draw(), deck.draw());
        this.pileOne = new Pile(deck.draw());
        this.pileTwo = new Pile(deck.draw());
        this.pileThree = new Pile(deck.draw());
        this.pileFour = new Pile(deck.draw());
        
        
    }
}

