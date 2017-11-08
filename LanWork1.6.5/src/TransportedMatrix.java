import java.util.Arrays;
import java.util.Scanner;
public class TransportedMatrix {
    public static void main(String[] args) {
        System.out.print("Enter number of row : ");
        Scanner scanner = new Scanner(System.in);
        String row1 = scanner.nextLine();
        int row = Integer.parseInt(row1);
        System.out.println(row);

        System.out.print("Enter number of column : ");
        String column1 = scanner.nextLine();
        int column = Integer.parseInt(column1);
        System.out.println(column);

        int[][] basicMatrix = new int[row][column];
        int[][] transportedMatrix = new int[column][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                basicMatrix[i][j] = (int)((Math.random() * 20)-10);
            }
        }

        System.out.println("The basic matrix is:");
        for (int i = 0; i < row ; i++) {
            System.out.println(Arrays.toString(basicMatrix[i]));
        }
        System.out.println();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                transportedMatrix[j][i] = basicMatrix[i][j];
            }
        }

        System.out.println("The transported matrix is:");
        for (int i = 0; i < column; i++) {
            System.out.println(Arrays.toString(transportedMatrix[i]));
        }
    }
}
