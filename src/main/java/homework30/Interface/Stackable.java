package homework30.Interface;

public interface Stackable {

    boolean stackIsEmpty();

    boolean stackIsFull();

    void addToStack(int element);

    int removeFromStack();

    int displayUpperStack();
}
