import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Math m1 = new Math();
        Math m2 = new Math();
        Math m3 = new Math();
        Math m4 = new Math();
        Math m5 = new Math();

        System.out.println(m1.findMin(5,6));
        System.out.println(m2.findMax(10,15));
        System.out.println(m3.findMin(new int[]{1,2,3}));
        System.out.println(m4.findMax(new int[]{10,20,30}));
        System.out.println(m5.areaOfCircle(2.5));

        int[] array1 = Calculation.createArray(3);
        int[] array2 = Calculation.createArray(5);

        System.out.println(Arrays.toString(array1));
        System.out.println("max = " + Math.findMax(array1));
        System.out.println("min = " + Math.findMin(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println("max = " + Math.findMax(array2));
        System.out.println("min = " + Math.findMin(array2));

    }
}
