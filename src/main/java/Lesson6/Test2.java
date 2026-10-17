package Lesson6;

public class Test2 {

    public static int add(int a, int b) {
        a += b;
        return a;
    }

    public static void main(String[] args) {
        int a = 10;
        int v = 2;
        a = add(a, v);
        System.out.println(a);
    }
}
