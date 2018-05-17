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
    boolean playerOnesTurn;
    
    /**
     *
     */
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
        
        this.playerOnesTurn = true;
    }
    
    public void seePile() {
        int pileNum;
        Player p;
        
        if (playerOnesTurn) {
            p = playerOne;
        }
        else {
            p = playerTwo;
        }
        
        pileNum = p.selectPile();
        p.viewPile(this.choosePile(pileNum));
    }
    
    public void addCard() {
        int pileNum;
        Player p;
        
        if (playerOnesTurn) {
            p = playerOne;
        }
        else {
            p = playerTwo;
        }
        
        pileNum = p.selectPile();
        p.addToPile(this.choosePile(pileNum));
    }
    
    
    public Pile choosePile(int pileNum) {
        switch(pileNum) {
            case 1:
                return pileOne;
            case 2:
                return pileTwo;
            case 3:
                return pileThree;
            case 4:
                return pileFour;
            default:
                return pileOne;
        }
    }
    
    
    //fix error checking
    //figure out how to remove card from hand when it's selected
    //add to github
}

