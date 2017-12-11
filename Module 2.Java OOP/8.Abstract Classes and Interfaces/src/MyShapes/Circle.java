package MyShapes;

public class Circle extends Shape implements Comparable{
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

    @Override
    public void draw() {
        System.out.println(toString() + ", area is " + calculateArea());
    }

    @Override
    public int compareTo(Object o) {
        Circle circle = (Circle) o;
        if (this.calculateArea() < circle.calculateArea()) return -1; {
            if (this.calculateArea() > circle.calculateArea()) return 1;
            return 0;
        }
    }
}
