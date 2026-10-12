package Task;
//N дней
//C стоимость 1 сантиметра волос за каждый i-й день
//вывести максимальную денежную сумму, которую может заработать неформал за N дней.

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Task39 {
    static int days;

    static void main() throws FileNotFoundException {
        int[] mas = readFromF("file/task39/task39.txt");
        System.out.println(Arrays.toString(mas));
        System.out.println("сумма " + maxAmount(mas));

    }

    //прочитать из файла
    public static int[] readFromF(String file) throws FileNotFoundException {
        Scanner scan = new Scanner(new File(file));
        days = scan.nextInt();
        int[] price = new int[days];
        for (int i = 0; i < price.length; i++) {
            price[i] = scan.nextInt();
        }
        return price;
    }

    public static int maxAmount(int price[]) {
        int maxPrice = 0;
        int maxAmount = price[0] * 1; //

        for (int i = 0; i < price.length; i++) {
            int hairlenght = i + 1;
            int amount = price[i] * hairlenght;

            if (amount > maxAmount) {
                maxAmount = amount;
                maxPrice = i;
            }
        }
        return maxAmount;
    }
}