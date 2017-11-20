public class BitShift {
    public static void main (String[] args){
        int x =24;
        int res = x>>2;
        System.out.println(res);
        res = x>>3;
        System.out.println(res);
        res = x<<1;
        System.out.println(res);
        res = x<<3;
        System.out.println(res);
        res = x>>>1;
        System.out.println(res);
        res = x>>>2;
        System.out.println(res);
        int y = 0b1100_0000;
        res = y>>2;
        System.out.println(res);
        res = y<<1;
        System.out.println(res);
        res = y>>>2;
        System.out.println(res);
    }
}
