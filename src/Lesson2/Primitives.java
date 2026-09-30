package Lesson2;
import java.util.Scanner;

public class Primitives {

    public static void main(String[] args) {
        example2();
    }

    private static void example2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввведите 2 числа");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = a/b;
        System.out.println("с = " + c);
    }

    private static void example1() {
        short x = 9500;
        // x = 60 000; ошибка - int в short
        int y = 2 * x;
        short z = (short) (y - 1);//явное преобразование типов
        double d = x+z; // неявное преобразование типов
        d = d/10;
        y = (int) d;// явное преобразование с потерей дробной части

        System.out.println("y = " + y);
    }
}
