package MyShapes;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape("RED") {
            @Override
            public double calculateArea() {
                System.out.print("Shape area is ");
                return 0.0;
            }
        };
        shape.draw();
        System.out.println(shape.calculateArea());

        Circle circle = new Circle("GREEN",4.4);
        circle.draw();
        System.out.println(circle.calculateArea());

        Rectangle rectangle = new Rectangle("BLUE",4.5,6.5);
        rectangle.draw();
        System.out.println(rectangle.calculateArea());

        Triangle triangle = new Triangle("WHITE",3,4.5,2.5);
        triangle.draw();
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
           elements.draw();
        }
        Rectangle firstRectangle = new Rectangle("BLUE",5,7);
        Rectangle secondRectangle = new Rectangle("BLACK",8,4);
        firstRectangle.draw();
        secondRectangle.draw();
        System.out.println(firstRectangle.compareTo(secondRectangle));

        Rectangle [] arr2 = new Rectangle[6];
        arr2[0] = new Rectangle("GREEN",5,8);
        arr2[1] = new Rectangle("GREEN",9,3);
        arr2[2] = new Rectangle("RED",1,5);
        arr2[3] = new Rectangle("RED",7,7);
        arr2[4] = new Rectangle("PINK",9,3);
        arr2[5] = new Rectangle("PINK",3,4);
        System.out.println("Sort");

        Arrays.sort(arr2,new ShapeColorComporator());
        for(Rectangle rectangle1:arr2){
            rectangle1.draw();
        }

        System.out.println("Sort2");
        Shape[] differentShapes = new Shape[10];
        differentShapes[0] = new Circle("BLACK",23);
        differentShapes[1] = new Circle("WHITE",5);
        differentShapes[2] = new Circle("PINK",7);
        differentShapes[3] = new Rectangle("BLACK", 3,7);
        differentShapes[4] = new Rectangle("WHITE", 13,8);
        differentShapes[5] = new Rectangle("RED", 4,9);
        differentShapes[6] = new Triangle("BROWN",5,7,8);
        differentShapes[7] = new Triangle("RED",1,4,9);
        differentShapes[8] = new Triangle("RED",12,16,4);
        differentShapes[9] = new Triangle("PINK ",5,7,3);

        Arrays.sort(differentShapes, new Comparator<Shape>() {
            @Override
            public int compare(Shape o1, Shape o2) {
                Shape shape1 = o1;
                Shape shape2 = o2;
                return shape1.getColor().compareTo(shape2.getColor());
            }
        });
        for (Shape shape1 : differentShapes) {
            shape1.draw();
        }
    }
}
