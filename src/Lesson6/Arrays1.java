package Lesson6;
import java.util.Arrays;
import java.util.Scanner;

public class Arrays1 {
    public static void main(String[] args) {
        int[] massiv = inputArray();
        printArray(massiv);
        printYForArray(massiv);
    }

    static void printArray(int[] mas) {
        System.out.println("Массив:");
        System.out.println(Arrays.toString(mas));
    }

    static int[] inputArray() {
        int[] massiv = new int[7];

        for(int i = 0; i < massiv.length; ++i) {
            massiv[i] = inputX();
        }

        return massiv;
    }

    static int inputX() {
        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    static void printY(int n) {
        if (n > 0) {
            System.out.println("Квадрат полож.числа " + n + " равен " + n * n);
        } else if (n < 0) {
            System.out.println("Половина модуля отриц.числа " + n + " равен " + -((double)n) / (double)2.0F);
        }

    }

    static void printYForArray(int[] mass) {
        for(int i = 0; i < mass.length; ++i) {
            int x = mass[i];
            printY(x);
        }
    }

}
