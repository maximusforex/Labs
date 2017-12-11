
import com.sun.org.apache.xpath.internal.SourceTree;

import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
//        Movable[] movables = new Movable[2];
//
//        movables [0] = new Bike();
//        movables [1] = new Human();
//
//        for (int i = 0; i < movables.length; i++) {
//            movables[i].move();
//        }
//
//        new NR().movable.move();
//
//        new Movable() {
//            @Override
//            public void move() {
//                System.out.println("am");
//            }
//        }.move();

        Human[] humans = new Human[3];

        humans[0] = new Human(34,2.3,"Max","Malikov");
        humans[1] = new Human(13,3.4,"Vlad","Vladov");
        humans[2] = new Human(76,5.6,"Dima","Dimov");

        Arrays.sort(humans,new HumanAgeComparator());
        for (Human human : humans) {
            System.out.println(human);
        }

        Arrays.sort(humans, new Comparator<Human>() {
            @Override
            public int compare(Human o1, Human o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });



//        Arrays.sort(humans1);
//        for (Human human : humans1) {
//            System.out.println(human);
//        }

//        Arrays.sort(humans2);
//        for (Human human : humans2) {
//            System.out.println(human);
//        }
    }
}
