import java.util.Scanner;
public class InputName {
    public static void main(String[] arg){
        System.out.printf("Enter the name of the student: ");
        Scanner scan=new Scanner(System.in);
        String inname=scan.nextLine();
        System.out.println(inname);
    }
}
