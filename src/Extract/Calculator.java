package Extract;

import java.util.Scanner;

public class Calculator {

    static void main() {
        System.out.println("калькулятор");
        Scanner sc = new Scanner(System.in);
        System.out.println("Ввведите a и b ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        printDiv(b, a);
        System.out.println("Сумма " + sum(a, b));
        System.out.println(sum("валя", " кот"));

    }

    static void printDiv(double x, double y) {
        System.out.println("Деление b/a " + x / y);
    }

    static double sum(double x, double y){
        return x+y;
    }

    static double sum(double x, double y, double z){
        return x+y+z;
    }

    static String sum(String name1, String name2){
        return name1+name2;
    }
}