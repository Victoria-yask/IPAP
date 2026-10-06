package Lesson9;

import java.util.Arrays;

public class Massiv {

    public static void main() {
        int num = Integer.parseInt(IO.readln("Введите размер массива: "));
        int[] mas = creareMassiv(num);
        System.out.println(Arrays.toString(mas));
        System.out.println("Количество одинаковых значений: " + findSameValue(mas));
    }

    //создать массив
    public static int[] creareMassiv(int num) {
        int[] mas = new int[num];
        for(int i = 0; i < mas.length; ++i) {
            mas[i] = Integer.parseInt(IO.readln("Введите число: "));
        }
        return mas;
    }

    public static int findSameValue(int[] mas) {
        int count = 0;
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length; j++) {
                if (i != j && mas[i] == mas[j]) {
                    count ++;
                    break;
                }
            }
        }
        return count;
    }

}


