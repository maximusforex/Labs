import java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] args) {
        System.out.print("Enter the number : ");
        Scanner scan = new Scanner(System.in);
        String n1 = scan.nextLine();
        int n = Integer.parseInt(n1);
        System.out.println(n);
        int a = 0;

        for (int j = n; j >= 1; j--) {
            if ((!(j == n) && (n % j == 0))) {
                a += j;
            }
        }
        if (a == n) {
            System.out.println("Perfect number found " + a);
        } else {
            System.out.println("Not perfect number.");
        }
    }
}
