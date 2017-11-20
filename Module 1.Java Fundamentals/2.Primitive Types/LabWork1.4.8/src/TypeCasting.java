public class TypeCasting {
    public static void main(String[] args){
        double x=666666.666666;
        float x1 = (float) x;
        long x2 = (long) x;
        int x3 = (int) x;
        short x4 = (short) x;//The number is greater than its container, the result is unpredictable.
        byte x5 = (byte) x; //The number is greater than its container, the result is unpredictable.
        char x6 = (char) x;
        System.out.println(x1+"\n"+x2+"\n"+x3+"\n"+x4+"\n"+x5+"\n"+x6);

    }
}
