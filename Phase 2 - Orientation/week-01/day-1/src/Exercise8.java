import java.util.*;
import java.util.stream.Collectors;

public class Exercise8 {
    public static void main(String[] args) {

        // Write a Stream Expression to find the frequency of numbers in the following array:

        ArrayList<Integer> numbers =
                new ArrayList<>(Arrays.asList(5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2));

        List<Integer> numbersUnique = numbers.stream()
                .distinct()
                .collect(Collectors.toList());

        List<Integer> numbersOccurencies = numbers.stream()
                .distinct()
                .map(n -> Collections.frequency(numbers, n))
                .collect(Collectors.toList());

        System.out.println("Numbers:\t\t" + numbersUnique);
        System.out.println("Occurencies:\t" + numbersOccurencies);

    }
}
