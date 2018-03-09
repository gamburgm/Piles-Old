/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piles;

/**
 *
 * @author Mitch
 */
public class Card {
  int rank;
  Suit suit;
  boolean playerOneSeen;
  boolean playerTwoSeen;

  Card(int rank, Suit suit, boolean playerOneSeen, boolean playerTwoSeen) 
          throws Exception {
      
    if (rank > 13 || rank < 1) {
        throw new Exception("invalid rank");
    }
    
    this.rank = rank;
    this.suit = suit;
    this.playerOneSeen = playerOneSeen;
    this.playerTwoSeen = playerTwoSeen;
  }


}
