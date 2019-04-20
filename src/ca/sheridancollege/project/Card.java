/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

enum Rank {
    ACE(1),
    JACK(11),
    QUEEN(12),
    KING(13),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10);
    private int value;
    Rank ( int value){
        this.value = value;
    }
    public int getValue() {
			return value;
		}
    
}

enum Suit{
    HEARTS,
    SPACES,
    CLUBS,
    DIAMONDS;
}



/**
 * A class to be used as the base Card class for the project. Must be general
 * enough to be instantiated for any Card game. Students wishing to add to the code 
 * should remember to add themselves as a modifier.
 * @author dancye, 2018
 */
public abstract class Card 
{
    private Rank rank;
    private Suit suit;
    
    public Card(){}
    public Card ( Rank rank, Suit suit){
        this.rank= rank;
        this.suit = suit;
    }   

    public Rank getRank() {
        return rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }
    

    //default modifier for child classes       
    /**
     * Students should implement this method for their specific children classes 
     * @return a String representation of a card. Could be an UNO card, a regular playing card etc.
     */    
    @Override
    public abstract String toString();

}

