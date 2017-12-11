import java.util.Arrays;

public class MyInit {
    private int[] array = new int[10];
    {
        for (int i = 0; i < array.length; i++) {
            array[i]=(int)(100*Math.random());
        }
    }
    public void printArray(){
        System.out.println(Arrays.toString(array));
    }
}
