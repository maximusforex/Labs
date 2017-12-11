package com.brainacad.calc;
import com.brainacad.shapes.Triangle;

public class Main {
    public static void main(String[] args) {
        Triangle test = new Triangle(5,5,6);
        System.out.println(test.getArea());
    }
}
