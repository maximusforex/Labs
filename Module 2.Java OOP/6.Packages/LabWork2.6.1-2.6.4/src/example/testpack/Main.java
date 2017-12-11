package example.testpack;
import com.brainacad.carpack.Car;
import example.applepack.Apple;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.setMass(2500.5);
        System.out.println(car.getMass());
        Apple apple = new Apple();
        apple.setMass(2.3);
        System.out.println(apple.getMass());
    }
}
