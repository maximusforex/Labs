public class Ternary {
    public static void main(String[] args){
        int u1 = 4;
        int v1 = 7;
        boolean res1 = u1>=v1?true:false;
        System.out.println(res1);
        res1 = u1!=v1?true:false;
        System.out.println(res1);
        boolean u2 = true;
        boolean v2 = false;
        int res2 = u2&&v2?0:1;
        System.out.println(res2);
        res2 = u2||v2?0:1;
        System.out.println(res2);
        int u3 = 15;
        int v3 = 30;
        int res3 = u3>v3?30:15;
        System.out.println(res3);
        res3 = u3<v3?30:15;
        System.out.println(res3);
    }
}
