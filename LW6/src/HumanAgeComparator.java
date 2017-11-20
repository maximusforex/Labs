import java.util.Comparator;

public class HumanAgeComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
       Human h1 = (Human)o1;
       Human h2 = (Human) o2;

       if(h1.getAge() > h2.getAge()){return 1;}
       if(h1.getAge() < h2.getAge()){return -1;}
        return 0;
    }
}
