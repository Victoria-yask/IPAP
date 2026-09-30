package Lesson4;

public class Task_fun {

    public static void main(String[] args) {
        int y = 10;
        int x = fun1(y, y);
        int z = fun2(y, x);
        System.out.println("x = " + x + " y = " + y + " z = " + z);
        z = fun3(x, z);
        System.out.println("x = " + x + " y = " + y + " z = " + z);
    }

    static int fun2(int a, int b) {
        a += b;
        return a * b;
    }

    static int fun1(int a, int b) {
        return 2 * a - b;
    }

    static int fun3(int a, int b) {
        int x = fun2(a, b);
        return fun1(x, b);
    }
}
