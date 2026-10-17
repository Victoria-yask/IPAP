package Lesson10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static Lesson8.Sort.bubbleSort;

public class QuickSort {
    static int k =0;

    static void main() throws FileNotFoundException {
       // int[] arr = readFromF("file/lesson10/array.txt");

        //int num = Integer.parseInt(IO.readln("Введите размер массива:"));
        //int[] arr = genRandowMassiv(num);

        int[] arr = genRandArray(100);
        //quickSort(arr, 0, arr.length - 1);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(k);
    }

    private static int[] readFromF(String file) throws FileNotFoundException {
        Scanner scan = new Scanner(new File(file));
        int num = scan.nextInt();
        int[] mas = new int[num];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = scan.nextInt();
        }
        return mas;
    }

    public static int[] genRandowMassiv(int num){
        int[] arr = new int [num];
        arr[0] = 0;
        for (int i = 1; i < arr.length; i++) {
                Random rn = new Random();
                arr[i] = rn.nextInt(100);
            }
        return arr;
        }

    public static int[] genRandArray(int size) {
        int[] ar = new int[size];
        Random random = new Random();

        for(int i = 0; i < size; ++i) {
            ar[i] = random.nextInt(100);
        }
        return ar;
    }

    private static void quickSort(int[] mas, int start, int finish) {
        if (start < finish) {
            int p = partition(mas, start, finish);
            quickSort(mas, start, p - 1);
            quickSort(mas, p + 1, finish);
        }
    }

    private static int partition(int[] mas, int start, int finish) {
        int pivot = mas[start + (finish - start) / 2];
        int i = start;
        int j = finish;

        while(true) {
            ++k;

            while(i <= finish && mas[i] < pivot) {
                ++i;
                ++k;
            }

            ++k;

            while(j >= start && mas[j] > pivot) {
                --j;
                ++k;
            }

            if (i >= j) {
                return j;
            }

            if (mas[i] == mas[j]) {
                ++i;
            } else {
                int tmp = mas[i];
                mas[i] = mas[j];
                mas[j] = tmp;
            }
        }
    }

    }