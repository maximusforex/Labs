package MyShapes;

public abstract class Shape implements Drawable {
    private String color;

    Shape(String color) {
        this.color = color;
    }

    String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Shape " +
                "color is = '" + color + '\'' +
                '}';
    }

    public abstract double calculateArea();

    @Override
    public void draw() {
        System.out.println(toString());
    }

}
