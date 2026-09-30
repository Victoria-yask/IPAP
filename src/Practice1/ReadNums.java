package Practice1;
import java.util.Scanner;

public class ReadNums {

    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение переменной а:");
        int a = scanner.nextInt();

        int b = Integer.parseInt(IO.readln("Введите значение переменной b:"));
        double sum = a+b;
        double avg = sum/2;
        System.out.println("Сумма " + sum);
        System.out.println("Среднее " + avg);
    }
}
