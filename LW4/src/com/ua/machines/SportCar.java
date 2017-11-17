package com.ua.machines;

public class SportCar extends Car {
    @Override
    public void show(){
        System.out.println("**********");
        System.out.println("Sport car");
       // super.show();
    }

    public void run(){
        System.out.println("Run");
    }
}
