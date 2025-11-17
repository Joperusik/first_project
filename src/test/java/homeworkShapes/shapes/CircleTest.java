package homeworkShapes.shapes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void testAreaCircle() {
        //give
        Shape circle = new Circle("Circle", 5);
        //when
        double result = circle.calculateArea();
        //then
        Assertions.assertEquals(result, 78.53981633974483);
    }

    @Test
    void testPerimeterCircle() {
        Shape circle = new Circle("Circle", 5);

        double result = circle.getPerimeter();

        Assertions.assertEquals(result, 31.41592653589793);
    }

}