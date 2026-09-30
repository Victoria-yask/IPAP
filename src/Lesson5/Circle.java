package Lesson5;
import java.util.Scanner;

public class Circle {
    int x, y, r;

    static Circle inputCircle() {
        Scanner input = new Scanner(System.in);
        Circle c = new Circle();
        c.x = input.nextInt();
        c.y = input.nextInt();
        c.r = input.nextInt();
        return c;
    }

    static boolean checkIntersection(Circle c1, Circle c2) {
        long d = (long)((c2.x - c1.x) * (c2.x - c1.x) + (c2.y - c1.y) * (c2.y - c1.y));
        return d >= (long)((c2.r - c1.r) * (c2.r - c1.r)) && d <= (long)((c1.r + c2.r) * (c1.r + c2.r));
    }

    public static void main(String[] args) {

        Circle c1 = inputCircle();
        Circle c2 = inputCircle();
        if (Circle.checkIntersection(c1, c2)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");

        }
    }
}
