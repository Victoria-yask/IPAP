package Extract;
import java.util.Scanner;
//сделать повторении ввода до тех пор
// пока польз не введет отриц число
//посчитать и вывести сумму и кол-во введеных чисел

public class While {
    static void main() {
       f3();
    }

    public static void f1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("введите положительное число");
        int x = sc.nextInt();
        int count =1;
        int sum = x;
        while (x >= 0) {
            System.out.println("введите положительное число");
            x = sc.nextInt();
            count++;
            sum +=x;
        }
        System.out.println("сумма " + sum);
        System.out.println("количество " + count);
    }

    public static void f2(){
        Scanner sc = new Scanner(System.in);
        int x;
        int count = 0;
        int sum = 0;
        do {
            System.out.println("введите положительное число");
            x = sc.nextInt();
            count++;
            sum +=x;
        }while (x >= 0);
        System.out.println("сумма " + sum);
        System.out.println("количество " + count);
    }

    public static void f3(){
        Scanner sc = new Scanner(System.in);
        int x =0;
        int count =0;
        int sum = 0;
        while (x >= 0) {
            System.out.println("введите положительное число");
            x = sc.nextInt();
            count++;
            sum +=x;
        }
        System.out.println("сумма " + sum);
        System.out.println("количество " + count);
    }
}
