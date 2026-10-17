package Task;
//https://acmp.ru/index.asp?main=task&id_task=869
//Байдарочный поход
//в файле N - человек , D  - грузоподъемность байдарки, M - вес человека
//найти наименьшее количество необходимых байдарок

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Scanner;

public class Task869 {
    static int d;

    static void main() throws IOException {
        int[] mas = readFromF("file/task869/input.txt");
        int countK = countKayak(mas);
        System.out.println(countK);

        String s = String.valueOf(countK);
        Files.writeString(Path.of("file/task869/output.txt"), s);
    }

    //прочитать из файла
    public static int[] readFromF(String file) throws FileNotFoundException {
        Scanner scan = new Scanner(new File(file));
        int n = scan.nextInt();
        d = scan.nextInt();
        int[] mas = new int[n];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = scan.nextInt();
        }
        return mas;

    }

    //количество необходимых байдарок
    public static int countKayak(int[] mas) {
        Arrays.sort(mas);//сортировка
        int countK = 0;//счетчик байдарок

        int left = 0;               // индекс самый лёгкий
        int right = mas.length - 1; // индекс самый тяжёлый

        while (left <= right) {
            if (left < right && mas[left] + mas[right] <= d) {// лёгкий + тяжёлый
                left++;
            }
            right--;
            countK++;
        }
        return countK;
    }

}
