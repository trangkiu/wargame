
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class testGame {
    public static void main (String [] args){
        gameChild newGame = new gameChild("war");
        ArrayList <Player> players = new ArrayList<>();
        
        newGame.setPlayers(players);
        
        ArrayList <Card> deck = new ArrayList();  
        
        newGame.drawADeck(deck);
        Collections.shuffle(deck);

        
        newGame.SplitCard(players.get(0).getDeck(),players.get(1).getDeck(), deck);
           
        Scanner enter = new Scanner (System.in);
        boolean play = true;
        
        do{
            try{
        for(int x=0; x< 10 ; x++){
        newGame.draw(players.get(0).getDeck(),players.get(1).getDeck());
        
        String input = enter.nextLine();
        }
            }catch(Exception e){
                System.out.println("Out of card");
                newGame.declareWinner(players.get(0),players.get(1));
            }

        newGame.declareWinner(players.get(0),players.get(1));
        System.out.println("Do you want to play another round? (Y/N)");
            
        boolean conf = true;
        do{
        try{
            String answer = enter.nextLine();
        if(answer.charAt(0)== 'Y' || answer.charAt(0)== 'y')
            play = true;
        else 
            play = false;
        
        conf = false;
        }catch(Exception ex){
                System.out.println("Please input Y or N");  
                
        }
        }while(conf);
        
        }while(play);
                
        
    }
}
