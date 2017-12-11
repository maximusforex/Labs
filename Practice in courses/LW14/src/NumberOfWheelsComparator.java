public class NumberOfWheelsComparator implements java.util.Comparator<Auto> {

    @Override
    public int compare(Auto o1, Auto o2) {
        if(o1.getNumberOfWheels()<o2.getNumberOfWheels()){
            return -1;
        }
        if(o1.getNumberOfWheels()>o2.getNumberOfWheels()){
            return 1;
        }
        return 0;
    }
}
