package MyShapes;

public class Triangle extends Shape implements Comparable{
    private  double sideA;
    private  double sideB;
    private  double sideC;

    Triangle(String color,double sideA,double sideB,double sideC) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double calculateArea() {
        double s = (sideA+sideB+sideC)/2;
        return Math.sqrt(s*(s-sideA)*(s-sideB)*(s-sideC));
    }

    @Override
    public String toString() {
        return "This is Triangle : " +
                "color is = " + super.getColor() +
                "; side A is = " + sideA +
                "; side B is = " + sideB +
                "; side C is = " +sideC;
    }

    @Override
    public void draw() {
        System.out.println(toString() + ", area is " + calculateArea());
    }

    @Override
    public int compareTo(Object o) {
        Triangle triangle = (Triangle) o;
        if (this.calculateArea() < triangle.calculateArea()) return -1; {
            if (this.calculateArea() > triangle.calculateArea()) return 1;
            return 0;
        }
    }
}
