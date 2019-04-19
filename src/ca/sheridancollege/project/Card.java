/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

enum Rank {
    ACE(1),
    Jack(11),
    Queen(12),
    King(13),
    Two(2),
    Three(3),
    Four(4),
    Five(5),
    Six(6),
    Seven(7),
    Eight(8),
    Nine(9),
    Ten(10);
    private int value;
    Rank ( int value){
        this.value = value;
    }
    public int getValue() {
			return value;
		}
    
}

enum Suit{
    Hearts,
    Spades,
    Clubs,
    Diamonds;
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

