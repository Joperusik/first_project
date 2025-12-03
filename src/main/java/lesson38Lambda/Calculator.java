package lesson38Lambda;

public class Calculator {

    public double performOperationOn(int x, int y, Operationable operationable) {
        return operationable.calculate(x, y);
    }
}
