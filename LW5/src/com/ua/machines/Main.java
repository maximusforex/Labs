package com.ua.machines;

import com.ua.machines.air.Plane;
import com.ua.machines.grass.car.Car;
import com.ua.machines.grass.rail.Train;
import com.ua.machines.water.Ship;

public class Main {
    public static void main(String[] args) {
        Transport[] transports = new Transport[4];
        transports[0] = new Car();
        transports[1] = new Plane();
        transports[2] = new Ship();
        transports[3] = new Train();

        for(int i =0;i<transports.length;i++){
            transports[i].show();
        }
    }
}
