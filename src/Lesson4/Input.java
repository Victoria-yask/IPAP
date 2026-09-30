package Lesson4;
//польз вводит целое число и вывод такое число раз
public class Input {
    void main() {
        //int x = inputX();
        //printStars(x);
        printStars(inputX());
    }

    static int inputX()
    {
        int x = Integer.parseInt(IO.readln("Введите число: "));
        return x;
    }

    static void printStars(int n){
        for (int i=0; i<n; i++) {
            System.out.println("***");
        }
    }
}