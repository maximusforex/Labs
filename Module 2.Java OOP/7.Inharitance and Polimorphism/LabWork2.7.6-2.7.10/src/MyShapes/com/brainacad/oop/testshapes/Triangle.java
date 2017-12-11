package MyShapes.com.brainacad.oop.testshapes;

public class Triangle extends Shape {
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
}
