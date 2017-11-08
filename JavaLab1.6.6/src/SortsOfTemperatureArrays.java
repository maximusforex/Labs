import java.util.Arrays;

public class SortsOfTemperatureArrays {
    public static void main(String[] args){

        int[] initialArray = new int[]{12,-12,1,-4,12,27,-23,0,18,2,-1,3};
        System.out.println("Initial array is : " + Arrays.toString(initialArray));

        int numberOfNegatives = 0;
        int numberOfZeros = 0;

        for(int element: initialArray){
            if (element<0){
                numberOfNegatives++;
            }else if(element==0){
                numberOfZeros++;
            }
        }

        int numberOfPositives = initialArray.length - numberOfNegatives - numberOfZeros;

        int[] negativeArray = new int[numberOfNegatives];
        int[] zeroArray = new int[numberOfZeros];
        int[] positiveArray = new int[numberOfPositives];

        int indexNegative = 0;
        int indexZero = 0;
        int indexPositive = 0;

        for(int element: initialArray){
            if(element<0){
                negativeArray[indexNegative] = element;
                indexNegative++;
            }else if(element==0){
                zeroArray[indexZero] = element;
                indexZero++;
            }else{
                positiveArray[indexPositive] = element;
                indexPositive++;
            }
        }

        System.out.println("Negative array : " + Arrays.toString(negativeArray));
        System.out.println("Zeros array : " + Arrays.toString(zeroArray));
        System.out.println("Positive array : " + Arrays.toString(positiveArray));

        System.arraycopy(negativeArray,0,initialArray,0,numberOfNegatives);
        System.arraycopy(zeroArray,0,initialArray,initialArray.length - numberOfPositives- numberOfNegatives,numberOfZeros);
        System.arraycopy(positiveArray,0,initialArray,0,numberOfPositives);

        System.out.println("Final array is : " + Arrays.toString(initialArray));
    }
}
