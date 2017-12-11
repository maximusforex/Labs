import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();

        for(int i = 0; i<230; i++){
            integers.add(i);
        }

        System.out.println(integers.size());
        System.out.println(integers.get(3));
        integers.remove(54);
        System.out.println(integers.get(54));
        integers.add(54,54);
        System.out.println(integers.get(54));
        integers.set(54,0);
        System.out.println(integers.get(54));
        System.out.println(integers.size());
        System.out.println(integers.indexOf(54));

        //print(integers);

        Collection<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        print(linkedList);
    }
    private static void print(Collection<Integer> list){
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());

//            for (Integer aList : list) {
//                System.out.println(aList);
//            }

//        for(Integer integer:list){
//            System.out.println(integer);
        }
    }
}
