import java.util.Scanner;

public class SumOfSquares {
    public static void main(String[] args){
        System.out.print("Enter number: ");
        Scanner scan = new Scanner(System.in);
        String number1 = scan.nextLine();
        int number = Integer.parseInt(number1);
        int sum;
        int firstNumeral;
        int secondNumeral;
        if(number>0&&number<9){
            System.out.println("Square of a number = "+number*number); //The sum of squares will not be fulfilled since among the 1 digit
        }else {
            firstNumeral = number / 10;
            secondNumeral = number % 10;
            System.out.println("First numeral = : " + firstNumeral);
            System.out.println("Second numeral = :" + secondNumeral);
            int squre1 = firstNumeral * firstNumeral;
            System.out.println("First squre = : " + squre1);
            int squre2 = secondNumeral * secondNumeral;
            System.out.println("Second squre = : " + squre2);
            sum = squre1 + squre2;
            System.out.println("Sum of squares = " + sum);
        }

        /*System.out.print("Enter number 1: ");
        Scanner scan = new Scanner(System.in);
        String x1 = scan.nextLine();
        int x = Integer.parseInt(x1);
        System.out.print("Enter number 2: ");
        String y1 = scan.nextLine();
        int y = Integer.parseInt(y1);
        int squre1 =x*x;
        System.out.println("x*x = "+squre1);
        int squre2=y*y;
        System.out.println("y*y = "+squre2);
        int sum = squre1+squre2;
        System.out.println("Sum of squarex = "+sum);*/
    }
}
