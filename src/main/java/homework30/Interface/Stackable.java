package homework30.Interface;

import java.util.Optional;

public interface Stackable {

    boolean stackIsEmpty();

    boolean stackIsFull();

    void addToStack(int element);

    int removeFromStack();

    int displayUpperStack();

    Optional<Integer> getOptional();
}
