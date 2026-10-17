package Extract;
import java.util.Scanner;
public class For {

    static void main() {
        f6();
    }
    public static void f4(){
        Scanner sc = new Scanner(System.in);
        int n = 7;
        int x =0;
        int count =0;
        int sum = 0;
        while (count <n) {
            System.out.println("введите положительное число");
            x = sc.nextInt();
            count++;
            sum +=x;
        }
        System.out.println("сумма " + sum);
        System.out.println("количество " + count);
    }

    public static void f5(){
        Scanner sc = new Scanner(System.in);
        int n = 7;
        int x;
        int sum = 0;
        while (n > 0) {
            System.out.println("введите положительное число");
            x = sc.nextInt();
            n--;
            sum +=x;
        }
        System.out.println("сумма " + sum);
    }

    public static void f6(){
        Scanner sc = new Scanner(System.in);
        int n = 7;
        int x;

        int sum = 0;
        for (int count =0; count <n; count++) {
            System.out.println("введите положительное число");
            x = sc.nextInt();
            sum +=x;
        }
        System.out.println("сумма " + sum);
    }

}
