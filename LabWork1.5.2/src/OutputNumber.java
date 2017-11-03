import java.util.Scanner;

public class OutputNumber {
    public static void main(String[] args){
        System.out.print("Enter number x : ");

        Scanner scan = new Scanner(System.in);
        String x1 = scan.nextLine();
        int x = Integer.parseInt(x1);
        System.out.println(x);

        String nameOfNumber;
        switch (x) {
            case 1:  nameOfNumber ="One";
                break;
            case 2:  nameOfNumber = "Two";
                break;
            case 3:  nameOfNumber = "Three";
                break;
            case 4:  nameOfNumber = "Four";
                break;
            case 5:  nameOfNumber = "Five";
                break;
            case 6:  nameOfNumber = "Six";
                break;
            case 7:  nameOfNumber = "Seven";
                break;
            case 8:  nameOfNumber = "Eight";
                break;
            case 9:  nameOfNumber = "Nine";
                break;
            default: nameOfNumber = "Other";
                break;
        }
        System.out.println(nameOfNumber);

        /*if(x==1){
            System.out.println("One");
        } else if(x==2){
            System.out.println("Two");
        } else if(x==3){
            System.out.println("Three");
        } else if(x==4){
            System.out.println("Four");
        } else if(x==5){
            System.out.println("Five");
        } else if(x==6){
            System.out.println("Six");
        } else if(x==7){
            System.out.println("Seven");
        } else if(x==8){
            System.out.println("Eight");
        } else if(x==9){
            System.out.println("Nine");
        } else if(x>9){
            System.out.println("Other");
        }*/

    }
}
