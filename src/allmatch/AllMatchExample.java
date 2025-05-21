package allmatch;

import java.util.Arrays;
import java.util.List;

public class AllMatchExample {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        boolean allPositive = numbers.stream()
                .allMatch(n -> n > 0);
        System.out.println(allPositive);
        List<Integer> numbersList = Arrays.asList(2, 4, 6, 8, 10);

        boolean allEven = numbersList.stream()
                .allMatch(n -> n % 2 == 0);

        System.out.println(allEven);
    }

}
