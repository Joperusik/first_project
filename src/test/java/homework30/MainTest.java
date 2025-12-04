package homework30;
import homework30.Interface.Stack;
import homework30.Interface.Exceptions.StackEmptyException;
import homework30.Interface.Exceptions.StackFullException;
import homework30.Interface.Stackable;
import org.junit.jupiter.api.Test;

import java.util.Optional;

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

    @Test
    void testGetOptionalWhenNotEmpty() {
        Stackable stack = new Stack(3);
        stack.addToStack(10);

        Optional<Integer> result = stack.getOptional();

        assertTrue(result.isPresent());
        assertEquals(10, result.get());
    }

    @Test
    void testGetOptionalWhenEmpty() {
        Stackable stack = new Stack(3);

        Optional<Integer> result = stack.getOptional();

        assertFalse(result.isPresent());
    }
}