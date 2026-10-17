package Task;
//2 бандита
//https://acmp.ru/index.asp?main=task&id_task=33

import java.util.Scanner;

public class Task33 {
    void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("сколько прострелил Гарри: ");
        int shotByHarry = scanner.nextInt();
        System.out.print("сколько прострелил Ларри: ");
        int shotByLarry = scanner.nextInt();
        int total = shotByHarry + shotByLarry - 1;
        System.out.println("Всего простреленных банок " + total);
        System.out.println("Гарри не прострелили " + (total-shotByHarry));
        System.out.println("Ларри не прострелили " + (total-shotByLarry));

    }
}
