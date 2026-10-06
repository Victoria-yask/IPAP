package Lesson10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

import static Lesson8.Sort.bubbleSort;

public class QuickSort {

    static void main() throws FileNotFoundException {
        int[] arr = readFromF("file/lesson10/array.txt");
        System.out.println(Arrays.toString(arr));
    }

    private static int[] readFromF(String file) throws FileNotFoundException {
        Scanner scan = new Scanner(new File(file));
        int num = scan.nextInt();
        int[] mas = new int [num];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = scan.nextInt();
        }
        return mas;
    }


}
