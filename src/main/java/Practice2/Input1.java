package Practice2;
//Спросить пользователя, сколько стоит чашка кофе
//
//Если  больше 300, то вывести "Дороговато"
//Если от 150 до 300, то вывести "Норм"
//Если от 80 до 150, то "Дешево"
//Если меньше 80, то вывести "А это в рублях? А это вообще кофе?"

import java.util.Scanner;

public class Input1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Сколько стоит чашка кофе?: ");
        double price = scanner.nextInt();
        final int BIG_PRICE_LEVEL = 300;
        final int MEDIUM_PRICE_LEVEL = 150;
        final int SMALL_PRICE_LEVEL = 80;

        String message = "мнение о цене кофе";
        if (price >= BIG_PRICE_LEVEL) {
            message = "Дороговато";
        } else if (price >= MEDIUM_PRICE_LEVEL) {
            message = "Норм";
        } else if (price >= SMALL_PRICE_LEVEL) {
            message = "Дешево";
        } else {
            message = "А это в рублях? А это вообще кофе?";
        }
        System.out.println(message);
    }
}
