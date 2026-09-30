package Lesson6;

import java.util.Arrays;

public class Arrays2 {

    public static void main(String[] args) {
        int[] mas = new int[]{55, 77, -12, 11, 18, 39};
        int[] mas2 = filterPositive(mas);
        System.out.println(Arrays.toString(mas2));
        System.out.println("среднее значение: " + avg(mas));
        int[] closest = findClosestPair(mas);
        System.out.println(Arrays.toString(closest));
        System.out.println(avg1(mas));
    }

    //фильтрация полож чисел
    public static int[] filterPositive(int[] mas) {
        //подсчет полож чисел
        int kpos = 0;
        for(int i = 0; i < mas.length; ++i) {
            if (mas[i] > 0) {
                ++kpos;
            }
        }
        //массив для полож чисел
        int[] mas2 = new int[kpos];
        for(int i = 0, j = 0; i < mas.length; ++i) {
            if (mas[i] > 0) {
                mas2[j] = mas[i];
                ++j;
            }
        }
        return mas2;
    }

    public static double avg1(int[] mas) {
        double sum = 0;
        double avg1 = 0;
        for (int i = 0; i < mas.length; i++) {
            sum += mas[i];
            avg1 = sum/mas.length;
        }
        return avg1;
    }

    public static int sum(int[] mas) {
        int sum = 0;
        for(int i = 0; i < mas.length; ++i) {
            sum += mas[i];
        }
        return sum;
    }

    public static double avg(int[] mas) {
        double d = (double)sum(mas);
        return d / (double)mas.length;
    }

    public static int[] findClosestPair(int[] mas) {
        int[] pair = new int[2];
        int minDelta = 99999;

        for(int i = 0; i < mas.length; ++i) {
            for(int j = 1 + i; j < mas.length; ++j) {
                int delta = Math.abs(mas[i] - mas[j]);
                if (delta < minDelta) {
                    minDelta = delta;
                    pair[0] = mas[i];
                    pair[1] = mas[j];
                }
            }
        }

        return pair;
    }
}
