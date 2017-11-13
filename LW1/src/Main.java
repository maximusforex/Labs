public class Main {
    public static void main(String[] args) {
        Math m1 = new Math();
        Math m2 = new Math();
        Math m3 = new Math();
        Math m4 = new Math();

        System.out.println(m1.findMin(5,6));
        System.out.println(m2.findMax(10,15));
        System.out.println(m3.findMin(new int[]{1,2,3}));
        System.out.println(m4.findMax(new int[]{10,20,30}));

    }
}
