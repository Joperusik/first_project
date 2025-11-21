package homework30;

import homework30.Interface.Stack;

public class Main {
    static void main() {
        Stack stack = new Stack(5);
        stack.addToStack(1); //low
        stack.addToStack(2);
        stack.addToStack(3);
        stack.addToStack(4);
        stack.addToStack(5); // top

        System.out.println("Stack is Full: " + stack.stackIsFull());
        System.out.println("Stack is Empty: " + stack.stackIsEmpty());
        System.out.println("Upper element: " + stack.displayUpperStack());

        System.out.print("Наш стек: "); //from top ro low
        while (!stack.stackIsEmpty()) {
            int value = stack.removeFromStack();
            System.out.print(value);
            System.out.print(" ");
        }
        System.out.println("");
    }
}
