public class A {
    private final double pi = 3.14;
    private double squareOfSquare;
    private double squreOfRectangle;
    private double squareOfCircle;

    public void calculateSquare(double radius){
        squareOfCircle = pi*radius*radius;
        System.out.println(squareOfCircle);
    }
    public void calculateSqure(double side){
        squareOfSquare = side*side;
        System.out.println(squareOfSquare);
    }
    public void calculateSquare(double sideA,double sideB){
        squreOfRectangle = sideA*sideB;
        System.out.println(squreOfRectangle);
    }
}
