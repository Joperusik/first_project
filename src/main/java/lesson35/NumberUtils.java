package lesson35;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumberUtils {

    public List<Integer> getSum(List<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        return Collections.singletonList(sum);
    }

    public List<Integer> multiplyOddNumber(List<Integer> numbers) {
        List<Integer> result = new ArrayList<>();
        for (int number : numbers) {
            if (number % 2 != 0) {
                result.add(number * 2);
            }
        }

        return result;
    }

}
