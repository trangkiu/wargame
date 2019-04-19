
package ca.sheridancollege.project;

public class cards extends Card{
    public cards (Rank rank, Suit suit){
        super (rank,suit);
    }

    @Override
    public String toString() {
        return super.getRank()+ " " +super.getSuit();
    }    
    
}
