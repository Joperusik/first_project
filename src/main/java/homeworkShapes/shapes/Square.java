package homeworkShapes.shapes;

public class Square extends Rectangle {

    public Square(double side) {
        super("Square", side, side);
    }

    @Override
    public void displayInfo() {
        System.out.println(getShapeName());
        System.out.println(getWidth());
        System.out.println(calculateArea());
        System.out.println(getPerimeter());
    }

}
