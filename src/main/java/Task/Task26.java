package Task;
//2 окружности
//https://acmp.ru/index.asp?main=task&id_task=26

import java.util.Scanner;

public class Task26 {

    void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите x: ");
        int x1 = scanner.nextInt();

        System.out.print("Введите y: ");
        int y1 = scanner.nextInt();

        System.out.print("Введите r: ");
        int r1 = scanner.nextInt();

        System.out.print("Введите x2: ");
        int x2 = scanner.nextInt();

        System.out.print("Введите y2: ");
        int y2 = scanner.nextInt();

        System.out.print("Введите r2: ");
        int r2 = scanner.nextInt();

        long d = (x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1);

        if (d < (r2 - r1) * (r2 - r1) || d < (r1 + r2) * (r1 + r2)) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}
