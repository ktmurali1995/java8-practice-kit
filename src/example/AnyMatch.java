package example;

import java.util.Arrays;
import java.util.List;

public class AnyMatch {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(-1, -2, 3, -4, -5);

        boolean anyPositive = numbers.stream()
                .anyMatch(n -> n > 0);

        System.out.println(anyPositive);

        List<Integer> numbersList = Arrays.asList(-1, -2, -3, -4, -5);

        boolean anyPositivetest = numbers.stream()
                .anyMatch(n -> n > 0);

        System.out.println(anyPositivetest); 
    }
}
