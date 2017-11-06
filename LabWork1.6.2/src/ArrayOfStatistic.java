import java.util.Arrays;

public class ArrayOfStatistic {
    public static void main(String[] args){
        int [] m = new int [] {10, 21, 5, 22, 9, 29, 25, 22, 11, 14, 8, 14};
        int max = m[0], min = m[0];
        double av = 0;
        double sum =0;
            for (int i = 0; i < m.length; i++) {
                if (max < m[i])
                    max = m[i];
                if (min > m[i])
                    min = m[i];

                    sum+=m[i];
                    av=sum/m.length;
        }
        System.out.println("Maximum is : "+max);
        System.out.println("Minimum is : "+min);
        System.out.println("Average is : "+av);

    }
}

