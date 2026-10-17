package Task;
import java.util.Scanner;
//Светофорчики
//https://acmp.ru/index.asp?main=task&id_task=124
//M тоннелей
//N перекрестков, каждый тоннель соединяет какие-то два перекрестка
// поставить по светофору в каждом тоннеле перед каждым перекрестком
//посчитать сколько светофоров должно быть установлено на каждом из перекрестков.

import java.util.Arrays;
public class Task124 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Читаем N и M
        System.out.print("Введите N и M через пробел: ");
        int n = scan.nextInt();
        int m = scan.nextInt();

        int[] countN = new int[n];

        // Читаем M тоннелей
        for (int i = 0; i < m; i++) {
            System.out.print("Тоннель " + (i + 1) + ": ");
            int x = scan.nextInt();
            int y = scan.nextInt();
            countN[x - 1]++;
            countN[y - 1]++;
        }

        System.out.println(Arrays.toString(countN));
    }
    }


