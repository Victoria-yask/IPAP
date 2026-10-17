package Lesson12.Calculator;

import java.util.Scanner;

public class Main {

    static void main() {
        System.out.println("Ввведите 2 числа");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        Summer calc = new Summer();
        int z = calc.calculator(x, y);
        System.out.println("Сумма: " + z);

        System.out.println("Разность: " + new Subtractor().calculator(x, y));
        System.out.println("Произведение: " + new Multiplier().calculator(x, y));
        System.out.println("Деление: " + new Divider().calculator(x, y));

    }
}
