import java.util.ArrayList;
import java.util.Collections;

public class Hand {

    Card card = new Card();
    ArrayList<Card> cards = new ArrayList();

    public Hand(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public Hand() {

    }

    public ArrayList<Card> generateDeck() {
        ArrayList<Card> deck = new ArrayList<>();

        for (int i = 0; i < 52; i++) {
            if (i < 13) {
                deck.add(i, new Card(i, "spades"));
            } else if (i > 12 && i < 26) {
                deck.add(i, new Card(i, "hearts"));
            } else if (i > 25 && i < 39) {
                deck.add(i, new Card(i, "diamonds"));
            } else if (i > 38) {
                deck.add(i, new Card(i, "clubs"));
            }
        }
        return deck;
    }

    public ArrayList<Card> getHand(ArrayList<Card> deck) {
        ArrayList<Card> hand = new ArrayList<>();
        int[] numbers = randNumbers(deck.size() - 1);

        for (int i = 0; i < numbers.length; i++) {
            hand.add(deck.get(numbers[i]));
            deck.remove(hand.get(i));
        }

        return hand;
    }

    public int[] randNumbers(int number) {
        int[] numbers = new int[5];

        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < number; i++) {
            list.add(new Integer(i));
        }
        Collections.shuffle(list);
        for (int i = 0; i < 4; i++) {
            numbers[i] = list.get(i);
        }
        return numbers;
    }
}