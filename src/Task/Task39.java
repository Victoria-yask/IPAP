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
        int[] price = readFromF("file/task39/task39.txt");
        int[] hair = hairGrowth(days);
        System.out.println("Дней " + days);
        System.out.println("Цены " + Arrays.toString(price));
        System.out.println("Волосы длина " + Arrays.toString(hairGrowth(days)));
        System.out.println("Макс сумма " + maxAmount(price));

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

    //рост волос
    public static int[] hairGrowth(int days) {
        int[] hair = new int[days];
        for (int i = 0; i < hair.length; i++) {
            hair[i] = i + 1;
        }
        return hair;
    }

    //максимальная денежная сумма
    public static int maxAmount(int[] price) {
        int maxAmount = 0;
        int i = 0;

        while (i < price.length) {
            int maxPrice = 0;
            int maxIndex = i;

            for (int j = i; j < price.length; j++) {
                if (price[j] > maxPrice) {
                    maxPrice = price[j];
                    maxIndex = j;
                }
            }
            maxAmount += maxPrice * (maxIndex - i + 1);
            i = maxIndex + 1;
        }
        return maxAmount;
    }
}