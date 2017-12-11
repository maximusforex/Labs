package MyShapes.com.brainacad.oop.testshapes;

public class Circle extends Shape {
    private double radius;

    Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        double PI = 3.14;
        return PI *(radius*2);
    }

    @Override
    public String toString() {
        return "This is Circle : " +
                "color is = " + super.getColor() +
                "; radius is = " + radius;
    }
}
