public class GravityCalculator {
    private static final double ACCELERATION = -9.81;
    private static double velocity;
    public static double startPosition;
    public static double calculateDistance(double time){
        double result = 0.5*ACCELERATION*time*time + velocity *time + startPosition;
        return  result;
    }
}
