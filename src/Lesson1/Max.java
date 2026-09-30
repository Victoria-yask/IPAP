package Lesson1;

public class Max {

    void main() {
        int a = 10;
        int b = 20;
        int c = 15;

        int max = a;
        if (b > max)
            max = b;
        if (c > max)
            max = c;
        System.out.println("максимум равен " + max);
        }
    }
