package Practice4;

public class Matrix {

    static int [] [] convertArrayToMatrix(int[] array, int rows, int cols){
        int[][] matrix = new int[rows][cols];
        int k = 0;   // индекс в исходном массиве array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (k < array.length)
                    matrix[i][j] = array[k];
                else
                    break;
                k++;
            }
        }
        return matrix;
    }
private static void printMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%-6d", matrix[i][j]);
            }
            System.out.println();
        }
    }

    static void main() {
        int[] array = {100, 20, 56, 4, 500, 60, 7990, 800, 90};
        int [] [] matrix = convertArrayToMatrix(array, 4, 4 );
        printMatrix(matrix);
    }
}
