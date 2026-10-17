package Lesson4;

import java.util.Scanner;

//польз вводит целое число и вывод такое число раз
public class Input {
    void main() {
        //int x = inputX();
        //printStars(x);
        printStars(inputX());
    }

    static int inputX()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int x = scanner.nextInt();
        return x;
    }

    static void printStars(int n){
        for (int i=0; i<n; i++) {
            System.out.println("***");
        }
    }
}