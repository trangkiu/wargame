/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author nguye
 */
public class gameChildTest {
    
    public gameChildTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

   

    /**
     * Test of draw method, of class gameChild.
     */
    @Test
    public void testDraw() {
        System.out.println("testDraw");
        ArrayList <Card> deck1 = new ArrayList();
        ArrayList <Card> deck2 = new ArrayList();
        deck1.add(new cards(Rank.TEN, Suit.HEARTS));
        deck2.add(new cards(Rank.TWO, Suit.HEARTS));

        gameChild.draw(deck1, deck2);

        boolean expResult = true;
        boolean result = false;

        if(deck1.size() == 2){
            result = true;
        }

        assertEquals(expResult, result);
    }

    /**
     * Test of war method, of class gameChild.
     */
    @Test
    public void testWar() {
       System.out.println("testDraw");
        ArrayList <Card> deck1 = new ArrayList();
        ArrayList <Card> deck2 = new ArrayList();
        deck1.add(new cards(Rank.NINE, Suit.HEARTS));
        deck1.add(new cards(Rank.EIGHT, Suit.HEARTS));
        deck1.add(new cards(Rank.SEVEN, Suit.HEARTS));
        deck2.add(new cards(Rank.NINE, Suit.HEARTS));
        deck2.add(new cards(Rank.TEN, Suit.HEARTS));
        deck2.add(new cards(Rank.JACK, Suit.HEARTS));

        gameChild.war(deck1, deck2);

        boolean expResult = true;
        boolean result = false;

        if(deck2.size() == 6){
            result = true;
        }

        assertEquals(expResult, result);
    }

}
