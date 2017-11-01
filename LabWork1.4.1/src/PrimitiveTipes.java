public class PrimitiveTipes {
    public static void main(String[] args){
        byte bin = 0b0101_0010;
        short oct = 0256;
        int hex = 0xFE_DB_AC;
        long dec = 999999999999999999L;
        float pi= 3.14F;
        double exp = 0.001E3;
        char question = '\uFFFD';
        boolean torf = true;
        System.out.println(bin+"\n"+oct+"\n"+hex+"\n"+dec+"\n"+pi+"\n"+exp+"\n"+question+"\n"+torf);
    }
}
