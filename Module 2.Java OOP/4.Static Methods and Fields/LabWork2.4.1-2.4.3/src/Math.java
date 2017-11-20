public class Math {

    final static double PI = 3.14;

    public static int findMin(int a, int b){
        if(a <= b){
            return a;
        } else {
            return b;
        }
    }

    public static int findMax(int a,int b){
        if(a >= b){
            return a;
        }else{
            return b;
        }
    }

    public static int findMin(int[] a){
        int minValue = a[0];
        for(int element : a){
            if(element <= minValue){
                minValue = element;
            }
        }
        return minValue;
    }

    public static int findMax(int[] a){
        int maxValue = a[0];
        for(int element : a){
            if(element >= maxValue){
                maxValue = element;
            }
        }
        return maxValue;
    }

    public static double areaOfCircle(double radius) {
        return PI * radius * radius;
    }
}
