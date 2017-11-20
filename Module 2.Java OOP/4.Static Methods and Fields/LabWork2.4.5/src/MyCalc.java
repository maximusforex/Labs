public class MyCalc {
    public static final double PI = 3.14;

    public static double calcPI(int n){
        double pi=4.0;
        if(n==0){
            System.out.println("Nothing to calculate");
            return 0;
        }else if(n==1){
            System.out.println(PI);
            return 0;
        }else if(n==2){
            System.out.println("Wrong calculation");
            return 0;
        }
        for(int i=1;i<n;i++){
            double res = 4.0/(i*2+1);
            if (i % 2 != 0) res *= -1;
            pi+=res;
        }
        return pi;
    }
}
