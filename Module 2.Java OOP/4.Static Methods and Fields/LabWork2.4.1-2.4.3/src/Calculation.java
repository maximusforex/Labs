import java.lang.Math;

public class Calculation {
    public static int[] createArray (final int SIZE) {
        int[] newArray = new int[SIZE];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = (int) (Math.random() * 100);
        }
        return newArray;
    }
}
