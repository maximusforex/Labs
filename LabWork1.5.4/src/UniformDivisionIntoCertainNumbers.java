public class UniformDivisionIntoCertainNumbers {
    public static void main(String[] args){
        int counterNumber=1;
        for(int i=1;i<300;i++) {
            if (i % 3 == 0 || i % 4 == 0) {
                System.out.println(i);
                counterNumber++;
                if(counterNumber==11){
                    break;
                }
            }
        }

    }
}
