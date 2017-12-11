package MyShapes;

public class Rectangle extends Shape implements Comparable {
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

    @Override
    public void draw() {
        System.out.println(toString() + ", area is " + calculateArea());
    }

    @Override
    public int compareTo(Object o) {
        Rectangle rectangle = (Rectangle) o;
        if (this.calculateArea() < rectangle.calculateArea()) return -1; {
            if (this.calculateArea() > rectangle.calculateArea()) return 1;
            return 0;
        }
    }
}
