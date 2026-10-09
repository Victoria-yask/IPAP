package Lesson14.rectangle;
import java.util.ArrayList;
import java.util.Scanner;

public class Rectangle {
    double width;
    double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double perimeter() {
        return 2 * (width + length);
    }

    public double area() {
        return width * length;
    }

    public static double avgArea(ArrayList<Rectangle> rectangles) {
        double sum = 0;
        for (Rectangle r : rectangles) {
            sum += r.area();
        }
        return (double) sum / rectangles.size();
    }


    public static ArrayList<Rectangle> createListRec() {
        ArrayList<Rectangle> rectangles = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Ввведите ширину и длину прямоугольника (стоп-отрицательное число) ");

        while (true) {
            double x = sc.nextInt();
            double y = sc.nextInt();

            if (x <= 0 || y <= 0) {
                break;
            }
            rectangles.add(new Rectangle(x, y));
        }
        return rectangles;
    }

    @Override
    public String toString() {
        return "Прямоугольник " +
                "ширина =" + width +
                ", длина =" + length;
    }
}


