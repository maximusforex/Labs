import java.util.Scanner;
public class SumAndAverage {
    public  static void main(String[] args) {
     System.out.print("Enter the quantity : n= ");
     Scanner scan = new Scanner(System.in);
     String n1 = scan.nextLine();
     int n = Integer.parseInt(n1);
     System.out.println(n);
     double sum=0.0;
     double av=0;
     for(int i=1;i<=n;i++){
         sum=sum+i;
         av=sum/n;
     }
        System.out.println("The Sum is: "+sum);
        System.out.println("The Avg is:"+av);
     }
}
