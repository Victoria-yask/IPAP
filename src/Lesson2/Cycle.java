package Lesson2;
import java.util.Scanner;

public class Cycle {

    public static void main() {
        exampleFor();
    }

    public static void exampleFor() {
        for (int i=1; i <=7; i++) {
            System.out.println("Привет");
        }
    }

    public static void exampledowhile() {
        //водить полож числа, стоп - отрицат или 0, вывести кол чисел
        System.out.println("Вводите положительные числа. Отрицательное или 0 для завершения");
        Scanner sc = new Scanner(System.in);
        int n;
        int counter = 0;
        do {
            n = sc.nextInt();
            counter++;
        }
        while (n>0);
        System.out.println("Вы ввели " + counter + " чисел");
    }

    public static void exampleWhile2() {
        //водить полож числа, стоп - отрицат или 0, вывести кол чисел
        System.out.println("Вводите положительные числа. Отрицательное или 0 для завершения");
        Scanner sc = new Scanner(System.in);
        int n = 1; //условие для ввода
        int counter = 0; // счетчик
        while (n>0) {
            n = sc.nextInt();
            counter++;
        }
        System.out.println("Вы ввели " + counter + " чисел");
    }

    public static void exampleWhile () {
    //вывести слово Привет 7 раз
    int counter = 1;
    while (counter <= 7) {
        System.out.println("Привет");
       counter += 1;
     }
    }
}
