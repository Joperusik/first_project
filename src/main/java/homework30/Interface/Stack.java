package homework30.Interface;

import homework30.Interface.Exceptions.StackEmptyException;
import homework30.Interface.Exceptions.StackFullException;

import java.util.Optional;

public class Stack implements Stackable {
    private int maxSize;
    private int top;
    private int[] stackArray;

    public Optional<Integer> getOptional() {
        if (stackIsEmpty()) {
            return Optional.empty();
        }
        return Optional.of(removeFromStack());
    }

    public Stack(int maxSize) {
        this.maxSize = maxSize;
        stackArray = new int[maxSize];
        top = -1;
    }

    @Override
    public boolean stackIsEmpty() {
        return top == -1;
    }

    @Override
    public boolean stackIsFull() {
        return top == maxSize - 1;
    }

    @Override
    public void addToStack(int element) {
        if (stackIsFull()) throw new StackFullException("Stack is full");
        stackArray[++top] = element;
    }

    @Override
    public int removeFromStack() {
        if (stackIsEmpty()) throw new StackEmptyException("Stack is empty");
        return stackArray[top--];
    }

    @Override
    public int displayUpperStack() {
        if (stackIsEmpty()) throw new StackEmptyException("Stack is empty");
        return stackArray[top];
    }
}
