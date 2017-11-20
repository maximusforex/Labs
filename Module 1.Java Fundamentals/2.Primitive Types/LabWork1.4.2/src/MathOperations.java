public class MathOperations {
    public static void main(String[] args){
        double result;
        byte x1 = 127;
        byte x2 = -128;
        result = x1+x2;
        System.out.println(x1+"+"+"("+x2+")"+"="+result);
        short x3 = 0b1111_1100;
        short x4 = 0b0101_0011;
        result = x3-x4;
        System.out.println(x3+"-"+x4+"="+result);
        int x5 = 021;
        int x6 = 012;
        result = x5*x6;
        System.out.println(x5+"*"+x6+"="+result);
        long x7 = 0x4E_3DL;
        long x8 = 0x2C_1BL;
        result = x7/x8;
        System.out.println(x7+"/"+x8+"="+result);/*Although the output of the result is shown
                                                  in real form, the result of dividing is considered
                                                  anyway in the integer type*/
        float x9 = 23.0F;
        float x10 = 15.0F;
        result = x9%x10;
        System.out.println(x9+"%"+x10+"="+result);

    }
}
