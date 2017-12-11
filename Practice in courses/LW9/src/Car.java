public class Car {

    private String color;
    private Engine engine;
    private int weight;
    private int height;

    private static int counter;
    int engineCount;

    public class Engine{
        int maxSpeed;

        public Engine() {
            System.out.println("Engine Class");
            int engineCount = 0;
            this.maxSpeed = (weight*height)/10;
            Car.this.engineCount++;
            //engineCount++;
        }

        public int getMaxSpeed() {
            class SpeedClass{
                SpeedClass(){
                    System.out.println("Speed Class");
                }
                void print(){
                    System.out.println("Local Class");
                }
            }

            new SpeedClass().print();

            return maxSpeed;
        }

        public void setMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
        }

        @Override
        public String toString() {
            return "Engine{" +
                    "maxSpeed=" + maxSpeed +
                    '}';
        }
    }

    public static class PrintWork{
        int counter = 1;

        public PrintWork(){
            System.out.println("Print Class");
        }

        public /*static*/ void printInformation(){
            System.out.println("****************");
            System.out.println("This is Car"+Car.counter);
            System.out.println("****************");
        }
    }

    public Car (String color){
        this.color = color;
    }
    public Car (String color,Engine engine){
        this.color = color;
        this.engine = engine;
    }

    public Car(String color, int weight, int height) {
        System.out.println("Car Class");
        this.color = color;
        this.weight = weight;
        this.height = height;
        counter++;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", engine=" + engine +
                '}';
    }
}
