import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String... args) {

 /*       // Laboratory work 2_13_1
        for(MyDayOfWeek element : MyDayOfWeek.values()){
            System.out.println("Name = "+element.name()+", ordinal = "+element.ordinal());
        }
*/
 /*       // Laboratory work 2_13_2
        for(MyDayOfWeek element : MyDayOfWeek.values()){
            switch (element){
                case MONDAY:
                case TUESDAY:
                case FRIDAY: System.out.println("My Java day:"+element);
            }
        }
*/

        // Laboratory work 2_13_3
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter the day of the week");
//        MyDayOfWeek nextDay = MyDayOfWeek.valueOf(scan.nextLine());
//        nextDay.nextDay();


        Deck deck = new Deck();
        deck.shuffle();
        deck.printAll();
        deck.sort();
        deck.printAll();


    }
}
