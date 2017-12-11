package MyShapes.com.brainacad.oop.testshapes;

public class Shape {
    private String color;

    Shape(String color) {
        this.color = color;
    }

    String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Shape" +
                "color is = '" + color + '\'' +
                '}';
    }

    public double calculateArea(){
        System.out.print("Shape area is ");
        return 0.0;
    }
}
