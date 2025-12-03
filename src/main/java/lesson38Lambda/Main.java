package lesson38Lambda;

import java.util.function.Predicate;

public class Main {
    static void main() {

        Operationable operationable = ( x, y) -> x * y;

        Calculator calculator = new Calculator();

        System.out.println(calculator.performOperationOn(5,7, operationable));

        Predicate<Integer> predicate = x -> x > 5;
        System.out.println(predicate.test(5));

    }
}
