package MyShapes.com.brainacad.oop.testshapes;

public class Rectangle extends Shape{
    private double width;
    private double heigth;

    Rectangle(String color, double width, double heigth) {
        super(color);
        this.width = width;
        this.heigth = heigth;
    }

    @Override
    public double calculateArea() {
        return width*heigth;
    }

    @Override
    public String toString() {
        return "This is Rectangle : " +
                "color is = " + super.getColor() +
                "; width is = " + width +
                "; height is = " + heigth;
    }
}
