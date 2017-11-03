import java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] args){
        System.out.print("Enter the number : ");
        Scanner scan = new Scanner(System.in);
        String n1 = scan.nextLine();
        int n = Integer.parseInt(n1);
        System.out.println(n);
        int evenNumber=n%2;
        if(evenNumber==0){
            System.out.println("Even number .Perhaps perfect");

        }
    }
}
