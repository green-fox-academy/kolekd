import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Exercise2 {
    public static void main(String[] args) {

        // Write a Stream Expression to get the average value of the odd numbers from the following array:

        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));

        List <Integer> numbersOdd = numbers.stream().filter(n -> n % 2 == 1 ||
                n % 2 == -1).collect(Collectors.toList());
        System.out.println(numbersOdd);

        OptionalDouble value = numbers.stream().filter(n -> n % 2 == 1 || n % 2 == -1)
                .mapToInt(Integer::intValue)
                .average();

        if (value.isPresent()) {
            System.out.println(Math.round(value.getAsDouble()));
        }

    }
}
