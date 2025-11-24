package homework30;
import homework30.Interface.Stack;
import homework30.Interface.Exceptions.StackEmptyException;
import homework30.Interface.Exceptions.StackFullException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testStackFullException() {
        Stack stack = new Stack(2);
        stack.addToStack(1);
        stack.addToStack(2);
        assertThrows(StackFullException.class, () -> stack.addToStack(3));
    }

    @Test
    void testStackEmptyExceptionOnRemove() {
        Stack stack = new Stack(2);
        assertThrows(StackEmptyException.class, stack::removeFromStack);
    }

    @Test
    void testStackEmptyExceptionOnPeek() {
        Stack stack = new Stack(2);
        assertThrows(StackEmptyException.class, stack::displayUpperStack);
    }

}