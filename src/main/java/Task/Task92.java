package Task;

import java.util.Scanner; // Добавили стандартный класс для ввода

//Журавлики
//https://acmp.ru/index.asp?main=task&id_task=92

public class Task92 {
    public static void main(String[] args) { // Изменили для запуска программы
        Scanner scanner = new Scanner(System.in); // Создали объект для ввода

        System.out.print("Сколько сделали журавликов: ");
        int s = scanner.nextInt(); // Заменили IO.readln на scanner.nextInt()

        int petya = s / 6;
        int sergey = s / 6;
        int katya = petya * 4;

        System.out.println("Петя " + petya);
        System.out.println("Сергей " + sergey);
        System.out.println("Катя " + katya);
    }
}