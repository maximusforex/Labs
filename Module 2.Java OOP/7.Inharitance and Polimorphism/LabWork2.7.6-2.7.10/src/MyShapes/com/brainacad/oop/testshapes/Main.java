package MyShapes.com.brainacad.oop.testshapes;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape("RED");
        System.out.println(shape);
        System.out.println(shape.calculateArea());

        Circle circle = new Circle("GREEN",4.4);
        System.out.println(circle);
        System.out.println(circle.calculateArea());

        Rectangle rectangle = new Rectangle("BLUE",4.5,6.5);
        System.out.println(rectangle);
        System.out.println(rectangle.calculateArea());

        Triangle triangle = new Triangle("WHITE",3,4.5,2.5);
        System.out.println(triangle);
        System.out.println(triangle.calculateArea());

        Shape [] arr = new Shape[9];
        arr[0] = new Rectangle("BROWN",4,4);
        arr[1] = new Rectangle("BLACK",6.6,3.3);
        arr[2] = new Rectangle("ORANGE",2.7,4.1);
        arr[3] = new Rectangle("PURPLE",9.2,1.8);
        arr[4] = new Rectangle("RED",7,5.2);
        arr[5] = new Circle("GREEN",4.5);
        arr[6] = new Circle("BLUE",8.2);
        arr[7] = new Triangle("WHITE",2,3,4);
        arr[8] = new Triangle("PINK",3.4,4.6,7.9);

        for(Shape elements:arr){
            System.out.println(elements + ", area is: " + elements.calculateArea());
        }

        double sumArea = 0;
        for (Shape elements : arr) {
            sumArea += elements.calculateArea();
        }
        System.out.println("Shapes total area:" + sumArea);

        double sumCircleArea = 0;
        double sumRectangleArea = 0;
        double sumTriangleArea = 0;
        for (Shape shape1 : arr) {
            if (shape1 instanceof Circle) {
                sumCircleArea += shape1.calculateArea();
            }
            if (shape1 instanceof Rectangle) {
                sumRectangleArea += shape1.calculateArea();
            }
            if (shape1 instanceof Triangle) {
                sumTriangleArea += shape1.calculateArea();
            }
        }
        System.out.println("Rectangles total area:" + sumRectangleArea);
        System.out.println("Circles total area:" + sumCircleArea);
        System.out.println("Triangles total area:" + sumTriangleArea);



    }
}
