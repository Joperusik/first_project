package homework30.Interface;

public class Stack implements Stackable {
    private int maxSize;
    private int top;
    private int[] stackArray;

    public Stack(int maxSize) {
        this.maxSize = maxSize;
        stackArray = new int[maxSize];
        top = -1;
    }


    @Override
    public boolean stackIsEmpty() {
        return (top == -1);
    }

    @Override
    public boolean stackIsFull() {
        return (top == maxSize - 1);
    }

    @Override
    public void addToStack(int element) {
        if (stackIsFull()) {
            System.out.println("Stack is Full");
        } else {
            stackArray[++top] = element;
        }
    }

    @Override
    public int removeFromStack() {
        if (stackIsEmpty()) {
            System.out.println("Stack is Empty");
        } else {
            return stackArray[top--];
        }
        return -1;
    }

    @Override
    public int displayUpperStack() {
        return stackArray[top];
    }
}
