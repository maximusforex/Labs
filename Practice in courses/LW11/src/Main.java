import java.lang.Number;

public class Main {
    public static void main(String[] args) {
        GenerClass<Integer> generClass = new GenerClass<>();
        generClass.setT(new Integer(3));
        System.out.println(generClass.getT());

        Pair<Integer,Double> pair = new Pair<>();
        pair.setFirstValue(4);
        pair.setSecondValue(6.4);
        System.out.println(pair.getFirstValue());
        System.out.println(pair.getSecondValue());

        NumberWork<Integer> integ = new NumberWork<>();
        NumberWork<Double> doubleg = new NumberWork<>();
        integ.setNumber(4);
        doubleg.setNumber(3.4);
        System.out.println(integ.getNumber()+ " " + doubleg.getNumber());

        NewGeneric<Number1,Number2> ext = new NewGeneric<>();
        ext.setTest(new Number1());
        ext.getTest().setB(5.9);
        ext.setTest1(new Number2());
        ext.getTest1().setA(9);
        System.out.println(ext.getTest().getB()+ " " + ext.getTest1().getA());

        Integer[] i = new Integer[2];
        i[0] = 4;
        i[1] = 5;
        show(i);

    }
    private static <T extends Number> void show(T[] a){
        for (T anA : a) {
            System.out.println(anA);
        }
    }
}
