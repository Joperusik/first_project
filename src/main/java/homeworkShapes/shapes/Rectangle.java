package homeworkShapes.shapes;

import lombok.Getter;

@Getter
public class Rectangle extends Shape {
    private String shapeName;
    private double width;
    private double height;


    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }


    public Rectangle(String shapeName, double width, double height) {
        this.shapeName = shapeName;
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public void displayInfo() {
        System.out.println(shapeName);
        System.out.println("width: " + width + ", height: " + height);
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + getPerimeter());
    }

}
