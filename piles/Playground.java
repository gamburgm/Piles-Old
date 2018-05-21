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
    Player currentPlayer;
    Pile pileOne;
    Pile pileTwo;
    Pile pileThree;
    Pile pileFour;
    Deck deck;
//       
    /**
     *
     */
    public Playground() throws Exception {
        this.deck = new Deck();
        
        this.playerOne = new Player(true, deck.draw(), deck.draw(), 
                deck.draw(), deck.draw());
        this.playerTwo = new Player(false, deck.draw(), deck.draw(),
                deck.draw(), deck.draw());
        this.pileOne = new Pile(deck.draw());
        this.pileTwo = new Pile(deck.draw());
        this.pileThree = new Pile(deck.draw());
        this.pileFour = new Pile(deck.draw());
        
        this.currentPlayer = playerOne;
    }
    
    //select
    public void viewCommand() {
        int pileNum = currentPlayer.selectPilePrompt();
        currentPlayer.viewPile(this.selectPile(pileNum));
    }
    
    public void addCard() {
        int pileNum = currentPlayer.selectPilePrompt();
        this.selectPile(pileNum).add(currentPlayer.selectCardPrompt());
    }
    
    
    private Pile selectPile(int pileNum) {
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

