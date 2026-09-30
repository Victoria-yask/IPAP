package Lesson4;
//ввести 7 чисел, если число полож, то вывод квадрат числа, если отриц, то половину модуля числа

public class Input3 {
    void main() {

        //проверка функции
        printResult(6);
        printResult(-11);

        //запуск функции
        double x;
        for (int i = 0; i<7; i++){
            x = inputX();
            printResult(x);
        }
    }

    static double inputX()
    {
        double x = Double.parseDouble(IO.readln("Введите число: "));
        return x;
    }

    static void printResult(double x) {
        if (x > 0) {
            double result = Math.pow(x,x);
            System.out.println("Квадрат положительного числа " + x + " равен " + result);
        } else if (x < 0) {
            double result = Math.abs(x)/2;
            System.out.println("Половина модуля отрицательного числа " + x + " равен " +  result);
        }
    }

}
