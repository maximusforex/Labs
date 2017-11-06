import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchInSortedArray {
    public static void main(String[] args){
     System.out.print("Write the number of elements in the array ");
     Scanner sc = new Scanner(System.in);
     String index1 = sc.nextLine();
     int index = Integer.parseInt(index1);
     System.out.println(index);
     int [] array = new int [index];
     for (int i = 0; i < array.length; i++) {
      array[i] = (int) Math.round((Math.random() * (100+1)));
     }
     Arrays.sort(array);
     System.out.println("The sorted int array is ");
     System.out.println(Arrays.toString(array));
     System.out.print("Write the value that will be found ");
     String searchValue1 = sc.nextLine();
     int searchValue = Integer.parseInt(searchValue1);
     System.out.println(searchValue);
     int resultOfSearch = Arrays.binarySearch(array,searchValue);
     System.out.println("The index of  search element is "+resultOfSearch);
    }
}
