import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] matrix1;
        int[][] matrix2;

        System.out.print("Enter the size of the first matrix rows : ");
        Scanner scanner = new Scanner(System.in);
        String row1 = scanner.nextLine();
        int row = Integer.parseInt(row1);
        System.out.print("Enter size of the first matrix columns : ");
        String column1 = scanner.nextLine();
        int column = Integer.parseInt(column1);

        matrix1 = new int[row][column];

        for (int i=0;i < matrix1.length;i++){
            for (int j=0;j < matrix1[i].length;j++){
                matrix1[i][j] = ((int)(Math.random()*20)-10);
            }
        }
        System.out.print("The first matrix is : " + "\n");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <column; j++) {
                System.out.format("%6d ",matrix1[i][j]);
            }
            System.out.println();
        }

        System.out.print("Enter the size of the second matrix rows : ");
        row1 = scanner.nextLine();
        int row2 = Integer.parseInt(row1);
        System.out.print("Enter size of the second matrix columns : ");
        column1 = scanner.nextLine();
        int column2 = Integer.parseInt(column1);

        matrix2 = new int[row2][column2];

        for (int i=0;i < matrix2.length;i++){
            for (int j=0;j < matrix2[i].length;j++){
                matrix2[i][j] = ((int)(Math.random()*20)-10);
            }
        }
        System.out.print("The second matrix is : " + "\n");
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j <column2; j++) {
                System.out.format("%6d ",matrix2[i][j]);
            }
            System.out.println();
        }

        Matrix matrix = new Matrix();
        matrix.sumOfMatrix(matrix1,matrix2);
        matrix.multiplyOfMatrix(matrix1,matrix2);

    }
}
