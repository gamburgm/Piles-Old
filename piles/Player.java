package piles;
import java.util.*;

/**
 *
 * @author Mitch
 */
public class Player {
    final int id;
    Hand hand;
    Scanner command;
    
    public Player(int id, Card one, Card two, Card three, Card four) 
            throws Exception {
        
        this.id = id;
        this.hand =  new Hand(one, two, three, four);
        this.command = new Scanner(System.in);
        
        this.hand.inHand(this.id);
    }
    
    public int selectPile() {
        return 1;
    }
    
    public void viewPile(Pile p) {
        for (Card c : p.cards) {
            if (this.id == 1) {
                c.playerOneSeen = true;
            }
            else {
                c.playerTwoSeen = true;
            }  
        }
    }
    
    public void addToPile(Pile p) {
        
        p.add(this.chooseCard());
        
    }
    
    public Card chooseCard() {
        return this.hand.chooseCard(1);
    }
}

