package com.ua.machines;

public class Main {
    public static void main(String[] args) {
       // Car car = new Car();
       // car.show();

       // SportCar sportCar = new SportCar();
       // sportCar.show();

       // Car sportCar = new SportCar();//Polimorfizm
       // sportCar.show();

        Car sportCar = new SportCar();//Polimorfizm
        Car truck = new Truck();

        Car[] cars = new Car[2];
        cars[0]=sportCar;
        cars[1]=truck;

        for(int i = 0;i <cars.length;i++){
            cars[i].show();
        }
        SportCar sportCarAlone = new SportCar();
        sportCarAlone.run();
    }
}
