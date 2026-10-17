package Lesson4;

import java.util.Scanner; // Добавил только это для работы ввода

//Пользователь вводит 12 чисел, а затем
//	1) посчитать сумму чисел в массиве
//	2) посчитать количество четных чисел в массиве
//	3) посчитать среднее арифметическое среди положительных чисел
//	4) посчитать разницу между минимумом и максимумом в массиве
public class Massiv {

    static Scanner scanner = new Scanner(System.in); // Один Scanner на всю программу

    public static void main(String[] args) { // Изменил для запуска в IDEA
        int[] massiv = inputArray();
        amount(massiv);
        countEven(massiv);
        avgPositive(massiv);
        differenceMinMax(massiv);
    }

    //Ввод пользователем
    static int inputNumber() {
        System.out.print("Введите число: "); // Чтоб было видно, что просит программа
        int inputNumber = scanner.nextInt(); // Заменил IO.readln
        return inputNumber;
    }

    //ввод n-раз
    static int[] inputArray() {
        int[] massiv = new int[12]; // Поменял 2 на 12 (как в задании)
        for (int i = 0; i < massiv.length; i++) {
            massiv[i] = inputNumber();
        }
        return massiv;
    }

    //сумма чисел в массиве
    static void amount(int[] mass) {
        int amount = 0;
        for (int i = 0; i < mass.length; i++) {
            amount += mass[i];
        }
        System.out.println("Cумма чисел в массиве " + amount);
    }


    //количество четных чисел в массиве
    static void countEven(int[] mass) {
        int count = 0;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println("Количество четных чисел " + count);
    }

    //среднее арифметическое среди положительных чисел
    static void avgPositive(int[] mass) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] > 0) {
                sum += mass[i];
                count++;
            }
        }

        if (count == 0) {
            System.out.println("Положительных чисел нет");
            return;
        }

        double average = (double) sum / count;
        System.out.println("Cреднее арифметическое среди положительных чисел " + average);
    }

    //разница между минимумом и максимумом в массиве
    static void differenceMinMax(int[] mass) {
        int min = mass[0];
        int max = mass[0];

        for (int i = 1; i < mass.length; i++) {
            if (mass[i] < min) {
                min = mass[i];
            }
            if (mass[i] > max) {
                max = mass[i];
            }
        }
        int differenceMinMax = max- min;
        System.out.println("Разница между минимумом и максимумом в массиве " + differenceMinMax);
    }

}


