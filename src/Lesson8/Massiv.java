package Lesson8;
import java.util.Arrays;
//Пользователь вводит положительное целое число x
//Программа сделает массив длиной x и заполнит его квадратами чисел от 1 до x
//Вывести этот массив в прямом и обратном порядке

public class Massiv {

    static void main() {
        int num = Integer.parseInt(IO.readln("Введите число: "));
        int[] mas = createMassiv(num);
        System.out.println(Arrays.toString(mas));
        printForward(mas);
        printBackward(mas);
    }

    //создать массив
    public static int[] createMassiv(int num) {
        int[] mas = new int[num];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (i + 1) * (i + 1);
        }
        return mas;
    }

    // вывод в прямом порядке
    public static void printForward(int[] mas) {
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
        System.out.println();
    }

    // вывод в обратном порядке
    public static void printBackward(int[] mas) {
        for (int i = mas.length - 1; i >= 0; i--) {
            System.out.print(mas[i] + " ");
        }
        System.out.println();
    }

}


