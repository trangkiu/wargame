/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class gameChild extends Game {

    public gameChild(String givenName) {
        super(givenName);
    }

    @Override
    public void setPlayers(ArrayList<Player> players) {
        boolean flag = true;
        do {
            try {

                Scanner input = new Scanner(System.in);
                System.out.println("Enter the name for first player : ");
                String playerName1 = input.nextLine();
                if (playerName1.length() == 0) {
                    throw new Exception();
                }
                Player player1 = new playerChild(playerName1);

                System.out.println("Enter the name for second player : ");
                String playerName2 = input.nextLine();
                if (playerName2.length() == 0) {
                    throw new Exception();
                }
                Player player2 = new playerChild(playerName2);

                players.add(player1);
                players.add(player2);
                flag = false;
            } catch (Exception e) {
                System.out.println("Please enter your name");
            }
        } while (flag);
        super.setPlayers(players);
    }

    @Override
    public void play() {

    }

//    @Override
    public static void declareWinner(Player player1, Player player2) {
        if (player1.getDeck().size() > player2.getDeck().size()) {
            System.out.println(player1.getPlayerID() + " win");
        } else if (player2.getDeck().size() > player1.getDeck().size()) {
            System.out.println(player2.getPlayerID() + " win");
        } else {
            System.out.println("Even ");
        }

    }

    public static void drawADeck(ArrayList<Card> deck) {
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                deck.add(new cards(rank, suit));
            }
        }

    }

    public static void draw(ArrayList<Card> list1, ArrayList<Card> list2) {
        System.out.println("Player 1 draw : " + list1.get(0));
        System.out.println("Player 2 draw : " + list2.get(0));

        if (list1.get(0).getRank().getValue() > list2.get(0).getRank().getValue()) {
            list1.add(list2.get(0));
            list1.add(list1.get(0));
            list1.remove(list1.get(0));
            list2.remove(list2.get(0));
            System.out.println("Player 1 win");

        } else if (list1.get(0).getRank().getValue() < list2.get(0).getRank().getValue()) {
            list2.add(list1.get(0));
            list2.add(list2.get(0));
            list2.remove(list2.get(0));
            list1.remove(list1.get(0));
            System.out.println("Player 2 win");
        } else {
            System.out.println("war");
            war(list1, list2);

        }
        System.out.println("Player 1 has : " + list1.size() + "cards");
        System.out.println("Player 2 has : " + list2.size() + "cards");
    }

    public static void war(ArrayList<Card> list1, ArrayList<Card> list2) {
        ArrayList<Card> pile = new ArrayList<>();
        pile.add(list1.get(0));
        pile.add(list1.get(1));
        pile.add(list2.get(0));
        pile.add(list2.get(1));

        list1.remove(list1.get(0));
        list1.remove(list1.get(0));
        list2.remove(list2.get(0));
        list2.remove(list2.get(0));

        System.out.println("Player 1 draw : " + list1.get(0));
        System.out.println("Player 2 draw : " + list2.get(0));
        if (list1.get(0).getRank().getValue() > list2.get(0).getRank().getValue()) {
            list1.addAll(pile);
            list1.add(list2.get(0));
            list2.remove(list2.get(0));
            System.out.println("Player 1 win");
        } else if (list1.get(0).getRank().getValue() < list2.get(0).getRank().getValue()) {
            list2.addAll(pile);
            list2.add(list1.get(0));
            list1.remove(list1.get(0));
            System.out.println("Player 2 win");
        } else {
            war(list1, list2);
        }

    }

    public static void SplitCard(ArrayList<Card> list1, ArrayList<Card> list2, ArrayList<Card> deck) {

        for (int x = 0; x < deck.size() / 2; x++) {
            list1.add(deck.get(x));
        }
        for (int x = deck.size() / 2; x < deck.size(); x++) {
            list2.add(deck.get(x));
        }

    }

    @Override
    public void declareWinner() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
