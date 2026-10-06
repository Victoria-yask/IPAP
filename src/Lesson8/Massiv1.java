package Lesson8;
import java.util.Arrays;
//Пользователь вводит сперва число n - размер будущего массива
//Программа сделает массив длиной n, а затем прочитает n вещественных чисел и запомнит их в массив
//Вычислить сумму элементов, среднее арифметическое и МЕДИАНУ.


public class Massiv1 {

    static void main() {
        int num = Integer.parseInt(IO.readln("Введите число: "));
        double[] mas = creareMassiv(num);
        fillMassiv(mas);
        System.out.println(Arrays.toString(mas));
        System.out.println("Сумма: " + sum(mas));
        System.out.println("Среднее арифметическое: " + avg(mas));
        System.out.println("Медиана: " + findMedian(mas));
    }

    //создать массив
    public static double[] creareMassiv(int num) {
        double[] mas = new double[num];
        return mas;
    }

    //заполнить массив
    public static double[] fillMassiv(double[] mas) {
        for (int i = 0; i < mas.length; i++) {
            mas[i] = Double.parseDouble(IO.readln("Введите число " + (i + 1) + ": "));
        }
        return mas;
    }

    //сумма
    public static double sum(double[] mas) {
        double sum = 0;
        for(int i = 0; i < mas.length; ++i) {
            sum += mas[i];
        }
        return sum;
    }

    //среднее арифметическое
    public static double avg(double[] mas) {
        return (double)sum(mas) / (double)mas.length;
    }

    //сортировка пузырьком
    public static void bubbleSort(double[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    double temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    //медиана
    public static double findMedian(double[] mas) {
        bubbleSort(mas);

        int n = mas.length;
        if (n % 2 == 1) {
            return mas[n / 2];
        } else {
            return (mas[n / 2 - 1] + mas[n / 2]) / 2.0;
        }
    }

}

