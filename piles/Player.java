package piles;
import java.util.*;

/**
 *
 * @author Mitch
 */
public class Player {
    final boolean isPlayerOne;
    Hand hand;
    Scanner command;
    
    public Player(boolean player, Card one, Card two, Card three, Card four) 
            throws Exception {
        
        this.isPlayerOne = player;
        this.hand =  new Hand(one, two, three, four);
        this.command = new Scanner(System.in);
        
        this.hand.inHand(this.isPlayerOne);
    }
    
    public int selectPilePrompt() {
        return 1;
    }
    
    public Card selectCardPrompt() {
        int cardNum = 1;
    
        return this.hand.selectCard(cardNum);
    }
    
    //can be made more efficient: make outside else case
    //can also abstract away which bool field probably
    public void viewPile(Pile p) {
        for (Card c : p.cards) {
            if (this.isPlayerOne) {
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

