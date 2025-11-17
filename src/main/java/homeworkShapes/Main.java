package homeworkShapes;

import homeworkShapes.shapes.Circle;
import homeworkShapes.shapes.Rectangle;
import homeworkShapes.shapes.Square;

public class Main {
    static void main() {
        Circle circle = new Circle("Circle", 5);
        circle.displayInfo();

        System.out.println();

        Rectangle rectangle = new Rectangle("Rectangle", 5, 8);
        rectangle.displayInfo();

        System.out.println();

        Square square = new Square(5);
        square.displayInfo();

    }
}
