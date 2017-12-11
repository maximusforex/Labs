public class Main {
    public static void main(String[] args) {
         Car audi = new Car("red",2000,2);
         Car.Engine engine = audi.new Engine();
         audi.setEngine(engine);

         // Car.PrintWork.printInformation(); //For Static Methods
        Car.PrintWork printWork = new Car.PrintWork();
        printWork.printInformation();

        audi.getEngine().getMaxSpeed();

        System.out.println(audi.toString());
    }
}
