package Extract;

import java.util.Scanner;

public class For {

    static void main() {

    }
    public static void f4(){
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
