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

    public List<Integer> cardsToNumbers (List <Card> cards){
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < cards.size(); i++) {
            if (cards.get(i).number > 12 && cards.get(i).number < 26){
                cards.get(i).number -= 13;
            } else if (cards.get(i).number > 25 && cards.get(i).number < 39){
                cards.get(i).number -= 26;
            } else if (cards.get(i).number > 38){
                cards.get(i).number -= 39;
            }
            numbers.add(cards.get(i).number);
        }
        return numbers;
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
        List<Integer> numbers = cardsToNumbers(hand);

        Collections.sort(numbers);

        return "High Card: " + numbers.get(numbers.size() - 1);
    }

    public String pair (List <Card> hand){
        List<Integer> numbers = cardsToNumbers(hand);
        int matchCount = 0;
        int match1 = 0;
        int match2 = 0;

        for (int i = 0; i < numbers.size(); i++) {
            for (int j = 0; j < i; j++) {
                if (i != j && numbers.get(i).equals(numbers.get(j))){
                    match1 = numbers.get(i);
                    match2 = numbers.get(j);
                    matchCount++;
                }
            }
        }
        if (matchCount > 0){
            return "Pair: " + match1 + " " + match2;
        } else {
            return "Fuck you.";
        }
    }
}