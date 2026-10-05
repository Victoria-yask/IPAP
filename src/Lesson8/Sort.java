package Lesson8;

import java.util.Arrays;

public class Sort {

    static void main() {
        int[] arr = {17, 14, 17, 15, 21, 31, 16, 22};
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr) {
        boolean isSorted = false;

        for(int i = 0; i < arr.length - 1 && !isSorted; ++i) {
            isSorted = true;

            for(int k = 0; k + 1 < arr.length - i; ++k) {
                if (arr[k] > arr[k + 1]) {
                    int tmp = arr[k];
                    arr[k] = arr[k + 1];
                    arr[k + 1] = tmp;
                    isSorted = false;
                }
            }
        }

    }
}


