package lesson39;

import com.sun.source.tree.BinaryTree;

import java.util.function.BinaryOperator;

public class Main {
    static void main() {

        BinaryOperator<Long> glueNumbersOperator = (x, y) -> {
            String a = x.toString();//long to String
            String b = y.toString();//long to String

            String resultString = a + b;//String

            return (Long) Long.parseLong(resultString);
        };

        BinaryOperator<Long> glueNumbersOperatorShort = (x, y) ->
            Long.parseLong(x.toString() + y.toString());

        long result = glueNumbersOperator.apply(20L, 50L);

        System.out.println("Result -> " + result);
        System.out.println("Result -> " + glueNumbersOperatorShort.apply(11L, 26L));

    }
}
