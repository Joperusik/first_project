package lesson38Lambda;

public class Operation implements Operationable {

    @Override
    public int calculate(int x, int y) {
        return x + y;
    }
}
