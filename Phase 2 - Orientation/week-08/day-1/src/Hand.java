import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hand {

    public Hand() {
    }

    public List<Card> generateDeck() {
        List<Card> deck = new ArrayList<>();

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

    public List<Card> getHand(List<Card> deck) {
        List<Card> hand = new ArrayList<>();
        int[] numbers = randNumbers(deck.size());

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

    public String inspectHand(List<Card> hand){

        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < hand.size(); i++) {
            if (hand.get(i).number > 12 && hand.get(i).number < 26){
                hand.get(i).number -= 13;
            } else if (hand.get(i).number > 25 && hand.get(i).number < 39){
                hand.get(i).number -= 26;
            } else if (hand.get(i).number > 38){
                hand.get(i).number -= 39;
            }
            numbers.add(hand.get(i).number);
        }

        Collections.sort(numbers);


        return "High Card: " + numbers.get(numbers.size() - 1);
    }

}