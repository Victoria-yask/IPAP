package Lesson4;
import java.util.Arrays;

public class Arrays1 {

    void main() {
        int[] massiv = inputArray();
        printArray(massiv);
        printRorArray(massiv);
    }

    //ввод n-раз
    static int[] inputArray(){
        int[] massiv = new int[7];
        for (int i = 0; i<massiv.length; i++) {
            massiv[i] = inputX();
        }
        return massiv;
    }

    //Вывод массива
    static void printArray(int[] mas){
        System.out.println("Массив ");
        for (int i = 0; i<mas.length; i++){
            System.out.println(mas);;
        }
        System.out.println(Arrays.toString(mas));
    }

    //Применить функцию к каждому элементу массива
    static void printRorArray(int[] mass){
        for (int i = 0; i<mass.length; i++){
            printResult(mass[i]);;
        }
        //краткая запись
        Arrays.stream(mass).forEach(x->printResult(x));
    }

    //Ввод пользователем
    static int inputX()
    {
        int x = Integer.parseInt(IO.readln("Введите число: "));
        return x;
    }

    static void printResult(int x) {
        if (x > 0) {
            double result = Math.pow(x,x);
            System.out.println("Квадрат положительного числа " + x + " равен " + result);
        } else if (x < 0) {
            double result = Math.abs(x)/2.0;
            System.out.println("Половина модуля отрицательного числа " + x + " равен " +  result);
        }
    }
}

