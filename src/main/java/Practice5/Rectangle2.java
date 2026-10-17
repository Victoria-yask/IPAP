package Practice5;
import java.util.Scanner;

public class Rectangle2 {

    int width, height;

    public Rectangle2(int width, int height) {
        this.width = width;
        this.height = height;
    }

    int area() {
        return width * height;
    }

    int perimeter() {
        return 2 * (width + height);
    }

    public static Rectangle2 inputRectangle (int n){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите длину и ширину " + n + " прямоугольника");
        int width  = scan.nextInt();
        int height = scan.nextInt();
        return new Rectangle2(width, height);
    }

    public static double sumAreaRectangle(Rectangle2[] rects) {
        double sumarea = 0;
        for (int i = 0; i < rects.length; i++) {
            sumarea += rects[i].area();
        }
        return sumarea;
    }

    private static void task2() {
        Rectangle2 r1 = inputRectangle(1);
        Rectangle2 r2 = inputRectangle(2);
        Rectangle2 r3 = inputRectangle(3);

        if (r1.perimeter() == r2.perimeter() && r1.perimeter() == r3.perimeter()) {
            System.out.println("все периметры равны");
        } else if (r1.perimeter() == r2.perimeter() || r1.perimeter() == r3.perimeter() || r2.perimeter() == r3.perimeter()) {
            System.out.println("два периметра равны");
        } else
            System.out.println("периметры разные");
    }


    private static void task3() {
        Rectangle2[] rectangles = new Rectangle2[5];
        for (int i = 0; i < rectangles.length; i++) {
            rectangles[i] = inputRectangle(i);
        }

        double summArea = 0;
        for (int i = 0; i < rectangles.length; i++) {
            summArea += rectangles[i].area();
        }
        double avgArea = summArea / rectangles.length;
        System.out.println("avgArea = " + avgArea);
    }



/*    private static void task1() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ввведите длину и ширину 1 прямоугольника");
        int width1 = scan.nextInt();
        int height1 = scan.nextInt();

        System.out.println("Введите длину и ширину 2 прямоугольника");
        int width2 = scan.nextInt();
        int height2 = scan.nextInt();

        int area1 = width1 * height1;
        int area2 = width2 * height2;
        int sumArea = area1 + area2;
        Rectangle rect1 = inputRectangle(1);
        Rectangle rect2 = inputRectangle(2);
        int sumArea = rect1.area() + rect2.area();
        System.out.println("sumArea = " + sumArea);
    }*/

    public static void main(String[] args) {
/*        Rectangle2 r1 = inputRectangle(1);
        Rectangle2 r2 = inputRectangle(2);

        Rectangle2[] rects = {r1, r2};
        System.out.println("Сумма площадей: " + sumAreaRectangle(rects));*/
        //task2();
        task3();
    }
}