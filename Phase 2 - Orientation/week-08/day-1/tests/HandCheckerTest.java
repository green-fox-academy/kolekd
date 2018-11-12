import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class HandCheckerTest {
    HandChecker checker = new HandChecker();
    Hand hand = new Hand();
    Card card = new Card();

    @Test
    public void checkWinningHandTest() {

        assertEquals(checker.checkWinningHand("Black: 2H 3D 5S 9C KD White: 2C 3H 4S 8C AH")
                                        , "White wins! - (High card: Ace)");
    }
    @Test
    public void generateDeckTest(){

        assertEquals(hand.generateDeck().get(0).type,"spades");
        assertEquals(hand.generateDeck().get(0).id,0);

        assertEquals(hand.generateDeck().get(hand.generateDeck().size() - 1).type,"clubs");
        assertEquals(hand.generateDeck().get(hand.generateDeck().size() - 1).id,51);

    }

    @Test
    public void getHandTest(){

        List<Card> deck = hand.generateDeck();
        System.out.println(deck.size());

        List<Card> hand1 = hand.getHand(deck);
        System.out.println(deck.size());

        List<Card> hand2 = hand.getHand(deck);
        System.out.println(deck.size());

        for (int i = 0; i < hand1.size(); i++) {
            System.out.println("value: " + hand1.get(i).id + "  type: " + hand1.get(i).type);
            System.out.println("value: " + hand2.get(i).id + "  type: " + hand2.get(i).type);
        }

        assertEquals(hand1.size(), 5);
        assertEquals(hand2.size(), 5);
    }
    @Test
    public void inspectHandTest(){

       List<Card> cards = new ArrayList<>();
       cards.add(new Card(42,"diamonds"));
       cards.add(new Card(18,"hearts"));
       cards.add(new Card(9,"spades"));
       cards.add(new Card(39,"clubs"));
       cards.add(new Card(47,"diamonds"));

        assertEquals(hand.inspectHand(cards), "High Card: " + cards.get(2).id);
    }

    @Test
    public void pairTest(){

        List<Card> cards = new ArrayList<>();

        cards.add(new Card(26,"diamonds"));
        cards.add(new Card(13,"hearts"));
        cards.add(new Card(9,"spades"));
        cards.add(new Card(38+13,"clubs"));
        cards.add(new Card(38,"diamonds"));

        List<Integer> numbers = hand.cardsToNumbers(cards);


        System.out.println("Pair of A:  " + card.getNameOfCard(numbers.get(3)) + " of " + cards.get(3).type
                            + " and " + card.getNameOfCard(numbers.get(4)) + " of " + cards.get(4).type);
        assertEquals(hand.pair(cards), "Pair of A:  " + cards.get(3).id + " " + cards.get(4).id);
    }
}