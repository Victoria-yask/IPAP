package Lesson7;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        int[][] matr = createMatrixOfZeroes();
        printMatr(matr);
        randomize(matr);
        printMatr(matr);
        printLineSums(matr);
        printMax(matr);
        printMaxMatrix(matr);
        int[][] col = sliceColumnFromMatrix(matr, 2);
        printColumn(col);
    }

    //пользователь задает размеры матрицы
    private static int[][] createMatrixOfZeroes() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размеры матрицы");
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[][] matr = new int[n][m];
        return matr;
    }

    public static void printMatr(int[][] matr) {
        //сделать красивый вывод
        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr[i].length; j++) {
                System.out.printf(" %3d", matr[i][j]);
            }
            System.out.println();
        }
    }

    public static void randomize(int[][] matr) {
        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr[i].length; j++) {
                Random rn = new Random();
                int randomNum = rn.nextInt(100);
                matr[i][j] = randomNum;
            }
        }
    }

    public static void printLineSums(int[][] matr) {
        for (int i = 0; i < matr.length; i++) {
            int s = 0;
            for (int j = 0; j < matr[i].length; j++) {
                s += matr[i][j];
            }
            System.out.println("сумма элементов строки " + i + " равна " + s);

        }
    }

    public static void printMax(int[][] matr) {
        for (int i = 0; i < matr.length; i++) {
            int max = matr[i][0];

            for (int j = 1; j < matr[i].length; j++) {
                if (matr[i][j] > max) {
                    max =  matr[i][j];
                }
            }
            System.out.println("Строка " + (i + 1) + ": максимум = " + max);
        }
    }

    public static void printMaxMatrix(int[][] matr) {
        int max = matr[0][0];

        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr[i].length; j++) {
                if (matr[i][j] > max) {
                    max =  matr[i][j];
                }
            }
        }
        System.out.println("Максимальное число в матрице " + max);
    }

    public static int[][] sliceColumnFromMatrix(int[][] matr, int col) {
        int[][] column = new int[matr.length][1];

        for(int i = 0; i < matr.length; ++i) {
            column[i][0] = matr[i][col];
        }
        return column;
    }

    public static void printColumn(int[][] col) {
        for (int i = 0; i < col.length; i++) {
            System.out.println(col[i][0]);
        }
    }

}
