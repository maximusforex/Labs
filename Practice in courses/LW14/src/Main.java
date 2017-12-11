import java.util.*;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(2);
        hashSet.add(5);
        hashSet.add(9);
        hashSet.add(-77);
        hashSet.add(-77);
        hashSet.remove(-77);
        System.out.println(hashSet);
        System.out.println(hashSet.contains(2));
        System.out.println(hashSet.contains(21));

        Set<Integer> linked = new LinkedHashSet<>();
        linked.add(2);
        linked.add(3);
        linked.add(0);
        linked.add(5);
        System.out.println(linked);

        Set<Integer> tree = new TreeSet<>();
        tree.add(4);
        tree.add(0);
        tree.add(1);
        tree.add(-99);
        System.out.println(tree);

        Set<Integer> newSet = new HashSet<>();
        hSet(newSet,5);
        printSet(newSet);
        System.out.println("*********");

        Set<Person> people = new TreeSet<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        people.add(new Person(1, "Maxim"));
        people.add(new Person(1,"Alex"));
        people.add(new Person(3,"Maxim"));
        people.add(new Person(4,"Vlad"));
        System.out.println(people);
        System.out.println(people.size());
        System.out.println("*********");

        Set<Auto> autos = new HashSet<>();
        autos.add(new Auto(4,"Audi",10000, Auto.Color.BLACK));
        autos.add(new Auto(4,"Audi",20000,Auto.Color.BLUE));
        System.out.println(autos);
        System.out.println(autos.size());
        Set<Auto> autos1 = new TreeSet<>(new NumberOfWheelsComparator());
        autos1.add(new Auto(4,"Audi",10000, Auto.Color.BLACK));
        autos1.add(new Auto(4,"Audi",20000,Auto.Color.BLUE));
        System.out.println(autos1);
        System.out.println(autos1.size());
    }

    private static void hSet(Set<Integer> hashSet,int size) {
        Random random = new Random();
        for(int i = 0;i<size;i++){
            hashSet.add((random.nextInt(100)));
        }
    }

    private  static  void printSet(Set<Integer> hashSet){
        Iterator<Integer> iterator = hashSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next()+ " ");
        }
    }
}
