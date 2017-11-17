
public class Matrix {
    private int[][] resultMatrix;

    public int[][] sumOfMatrix(int[][] matrix1,int[][] matrix2){

        int height = matrix1.length;
        int width= matrix1[0].length;
        if (matrix2.length != height || matrix2[0].length != width) {
            System.out.println("Addition is impossible: the dimensions of matrices do not match");
            return null;
        }
        resultMatrix = new int[height][width];
        System.out.println("The sum of matrix is : ");
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
                System.out.format("%6d ",resultMatrix[i][j]);
            }
            System.out.println();
        }
        return resultMatrix;
    }

    public int[][] multiplyOfMatrix(int [][] matrix1,int [][] matrix2){

        int height1= matrix1.length;
        int width1 = matrix1[0].length;
        int height2 = matrix2.length;
        int width2 = matrix2[0].length;
        if (width1 != height2) {
            System.out.println("Multiplication is impossible: the dimensions of matrices ");
            return null;
        }
        resultMatrix = new int[height1][width2];
        System.out.println("The multiply of matrix is : ");
        for (int i = 0; i < height1; i++) {
            for (int j = 0; j < width2; j++) {
                for (int k = 0; k < height2; k++) {
                    resultMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        for (int i = 0; i < resultMatrix.length; i++) {
            for (int j = 0; j < resultMatrix[0].length; j++) {
                System.out.format("%6d ", resultMatrix[i][j]);
            }
            System.out.println();
        }
        return resultMatrix;
    }

}
