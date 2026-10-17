package Lesson17.trycatch1;
import java.util.Scanner;

public class TryCatch1 {
    static void main() {
       example1();
    }

    private static void example1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("введите 2 числа");
        int x = sc.nextInt();
        int y = sc.nextInt();
        try {
            A.printNum(x);
            A.printNum(y);
            A.printNum(x + y);
        }
        catch (Exception e) {
            System.out.println("внутри класса А что-то не так " + e.getMessage());
        }
        System.out.println("всем спасибо");
    }
}
