package homeworkShapes.shapes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void RectangleTest() {
        //give
        Shape rectangle = new Rectangle("Rectangle", 5, 8);
        //when
        double result = rectangle.calculateArea();
        //then
        Assertions.assertEquals(result, 40.0);
    }

    @Test
    void RectangleTest2() {
        Shape rectangle = new Rectangle("Rectangle", 5, 8);

        double result = rectangle.getPerimeter();

        Assertions.assertEquals(result, 26.0);
    }

}