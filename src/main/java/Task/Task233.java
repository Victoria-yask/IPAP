package Task;
//Автобусная экскурсия
//https://acmp.ru/index.asp?main=task&id_task=233

import java.util.Scanner;

public class Task233 {
    void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество мостов: ");
        int count = scanner.nextInt();

        int height; //высота моста
        int counter = 0; // кол-во мостов
        boolean crashed = false; //аварии
        while (counter < count && !crashed) {
            counter++;
            System.out.print("Введите высоту моста №" + counter + ": ");
            height = scanner.nextInt();
            if (height <= 437) {
                System.out.println("Авария на мосте №: " + counter);
                crashed = true;
            }
        }
        if(!crashed) {
            System.out.println("Аварий не было");
        }
    }
}

