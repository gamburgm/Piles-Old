package piles;
import java.util.*;

/**
 *
 * @author Mitch
 */
public class Player {
    int id;
    Hand hand;
    Scanner command;
    
    public Player(int id, Card one, Card two, Card three, Card four) {
        
        this.id = id;
        this.hand =  new Hand(one, two, three, four);
        this.command = new Scanner(System.in);
        
    }
}

