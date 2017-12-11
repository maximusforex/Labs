package com.brainacad.shapes;
import static java.lang.Math.sqrt;

public class Triangle {
    private double a = 1.0;
    private double b = 1.0;
    private double c = 1.0;
    boolean trueTriangle =true;

    public Triangle(double a,double b,double c){
        if(c >= a+b || b >= a+c || a >= b+c){
            trueTriangle = false;
        }

        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getArea(){
        if (trueTriangle) {
            double s = (a + b + c) / 2;
            return sqrt(s * (s - a) * (s - b) * (s - c));
        } else {
            System.out.println("Wrong Triangle");
            return -1;
        }
    }
}
