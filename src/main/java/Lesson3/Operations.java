package Lesson3;

public class Operations {
    public static void main(String[] args) {
        int x = 16;
        System.out.println(x / 5);
        System.out.println((double)x / (double)5.0F);
        System.out.println((double)x / (double)5.0F);
        System.out.println(x % 5);
        System.out.println((double)x % (double)5.0F);
        System.out.println((double)x % (double)3.5F);
        x += 4;
        System.out.println(x);
        func1();
    }

    private static void func1() {
        System.out.println("это func1");

    }
}
