package Lesson17.trycatch1;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        example2();
    }

    private static void example2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите 2 числа");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = 0;

        try {
            z = B.mult(x, y);
            System.out.println("z = " + z);
        } catch (Lesson17.trycatch1.UnluckyNumException e) {
            PrintStream var10000 = System.out;
            String var10001 = e.toString();
            var10000.println("сработало исключение " + var10001 + " с сообщением " + e.getMessage());
            System.out.println("кстати, там внутри число " + e.num);
        }

    }

    private static void example1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите 2 числа");
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        try {
            A.printNum(x);
            A.printNum(y);
            A.printNum(x + y);
        } catch (Exception ex) {
            System.out.println("внутри класса A что-то пошло не так " + ex.getMessage());
        }

        System.out.println("всем спасибо");
    }
}