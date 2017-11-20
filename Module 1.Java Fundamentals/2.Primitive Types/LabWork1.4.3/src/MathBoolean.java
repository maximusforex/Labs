public class MathBoolean {
    public static void main(String[] args){
        boolean b1 = true;
        boolean b2 = false;
        boolean res = b1&b2;
        System.out.println(res);
        res = b1|b2;
        System.out.println(res);
        res = b1^b2;
        System.out.println(res);
        res = b1!=b2;
        System.out.println(res);
        res = (b1||b2)&(b2!=b1);
        System.out.println(res);
        res = b2&&b1^b1!=b2;
        System.out.println(res);
    }
}
