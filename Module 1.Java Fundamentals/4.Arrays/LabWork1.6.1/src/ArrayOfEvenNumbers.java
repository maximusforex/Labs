public class ArrayOfEvenNumbers {
    public static void main(String [] args){
        int arraySize = 0;//The variable will store the array size value
        for (int i = 2;i<=30;i++){
            if(i%2==0){
                arraySize++;
            }
        }
        int[] evenArray = new int[arraySize];//Create an array, and using a loop, fill its cells
        for(int i=2,index=0;i<=30;i++){
            if(i%2==0){
                evenArray[index]=i;
                System.out.print(evenArray[index]+" ");
                index++;
            }
        }

    }
}
