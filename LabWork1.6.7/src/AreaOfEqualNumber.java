import java.util.Scanner;

public class AreaOfEqualNumber {
    public static void main(String[] args) {

        final int[][] MATRIX = {{1, 1, 1, 3, 4},
                {2, 1, 3, 1, 2},
                {2, 2, 3, 4, 1},
                {3, 3, 3, 1, 4}};

        final int HEIGHT = MATRIX.length;
        final int WIDTH = MATRIX[0].length;

        System.out.println("Matrix:");
        for (int[] row : MATRIX) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.print("Enter a number to search for: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        for (int i = 0; i < HEIGHT; i++) {

            System.out.print("Line " + (i + 1) + ": [");
            int numberOfRepeats = 0;
            for (int cell : MATRIX[i]) {
                if (cell == number) {
                    numberOfRepeats++;
                }
            }

            for (int j = 0; j < WIDTH; j++) {
                boolean middleNumber = true;
                if (MATRIX[i][j] == number) {
                    numberOfRepeats--;
                    if (j == 0
                            || numberOfRepeats == 0
                            || MATRIX[i][j] != MATRIX[i][j - 1]
                            || MATRIX[i][j] != MATRIX[i][j + 1]) {
                        System.out.print(j);
                        middleNumber = false;
                    }

                    if (numberOfRepeats != 0 && !middleNumber) {
                        if (MATRIX[i][j] == MATRIX[i][j + 1]) {
                            System.out.print("-");
                        } else {
                            System.out.print(",");
                        }
                    }
                }
            }
            System.out.println("]");
        }

    }
}
