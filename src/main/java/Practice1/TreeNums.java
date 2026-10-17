package Practice1;
import java.util.Scanner;

public class TreeNums {

    public static void main(String[] args) {
        example1();
    }

    private static void example1() {
        int a = 75;
        int b = 60;
        int c = 10;
            int sum = a+b+c;
            double avg = (double) sum/3;
            int differences1 = (a-b);
            int differences2 = (b-a);
            int differences3 = (a-c);
            int differences4 = (c-a);
            int differences5 = (b-c);
            int differences6 = (c-b);
            System.out.println("Сумма " + sum);
            System.out.printf("Среднее арифметическое %.2f%n", avg);
            System.out.println("Разность a-b " + differences1);
            System.out.println("Разность b-a " + differences2);
            System.out.println("Разность a-c " + differences3);
            System.out.println("Разность с-a " + differences4);
            System.out.println("Разность b-c " + differences5);
            System.out.println("Разность c-b " + differences6);
        }
}
