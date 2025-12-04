package homework30;

import homework30.Interface.Exceptions.StackEmptyException;
import homework30.Interface.Exceptions.StackFullException;
import homework30.Interface.Stack;

public class Main {
    static void main() {
        Stack stack = new Stack(5);
        
        try {
            stack.addToStack(1);
            stack.addToStack(2);
            stack.addToStack(3);
            stack.addToStack(4);
            stack.addToStack(5);
            stack.addToStack(6);
        } catch (StackFullException e) {
            System.out.println(e.getMessage());
        }
//        System.out.println("Stack is Full: " + stack.stackIsFull());
//        System.out.println("Stack is Empty: " + stack.stackIsEmpty());
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
