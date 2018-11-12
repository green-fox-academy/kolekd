import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class HandCheckerTest {
    HandChecker checker = new HandChecker();
    Hand hand = new Hand();

    @Test
    public void checkWinningHandTest() {

        assertEquals(checker.checkWinningHand("Black: 2H 3D 5S 9C KD White: 2C 3H 4S 8C AH")
                                        , "White wins! - (High card: Ace)");
    }
    @Test
    public void generateDeckTest(){

        assertEquals(hand.generateDeck().get(0).type,"spades");
        assertEquals(hand.generateDeck().get(0).number,0);

        assertEquals(hand.generateDeck().get(hand.generateDeck().size() - 1).type,"clubs");
        assertEquals(hand.generateDeck().get(hand.generateDeck().size() - 1).number,51);

    }

    @Test
    public void getHandTest(){

        ArrayList<Card> deck = hand.generateDeck();
        System.out.println(deck.size());

        ArrayList<Card> hand1 = hand.getHand(deck);
        System.out.println(deck.size());

        ArrayList<Card> hand2 = hand.getHand(deck);
        System.out.println(deck.size());

        for (int i = 0; i < hand1.size(); i++) {
            System.out.println("value: " + hand1.get(i).number + "  type: " + hand1.get(i).type);
            System.out.println("value: " + hand2.get(i).number + "  type: " + hand2.get(i).type);
        }

//        assertEquals(hand.getHand().size(), 5);
    }
}