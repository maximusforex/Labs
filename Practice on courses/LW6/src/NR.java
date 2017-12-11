public class NR {
    Movable movable = new Movable() {
        @Override
        public void move() {
            System.out.println("Non move");
        }
    };
}
