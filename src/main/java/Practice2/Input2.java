package Practice2;

import java.util.Scanner;

//Много раз Попросить пользователя вводить целые числа
//Остановиться, когда сумма введенных чисел достигнет 42
//Рассказать, сколько всего он ввел чисел
//+ Каков процент количества положительных чисел?
//+ Чему равна сумма отрицательных чисел?
public class Input2 {
    public static void main(String[] args) {

        int sum = 0;
        int counter = 0;
        int positive = 0;
        int negative = 0;

        while (sum < 42) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите целое число: ");
            int number = scanner.nextInt();

            sum += number;
            counter++;

            if (number > 0) {
                positive ++;
            } else if (number < 0) {
                negative += number;
            }
        }

        System.out.println("Вы ввели " + counter + " чисел");
        double percent = (double) positive / counter * 100;
        System.out.println("Процент положительных чисел: " + percent + "%");
        System.out.println("Сумма отрицательных чисел: " + negative);
    }
}


