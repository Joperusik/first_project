package homeworkShapes.shapes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void calculateArea() {
        //give
        Rectangle square = new Square(5);
        //when
        double result = square.calculateArea();
        //then
        Assertions.assertEquals(result, 25);
    }

    @Test
    void calculatePerimeter() {
        Rectangle square = new Square(5);

        double result = square.getPerimeter();

        Assertions.assertEquals(result, 20.0);
    }
}