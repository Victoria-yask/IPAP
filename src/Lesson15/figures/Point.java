package Lesson15.figures;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Point {
    double x;
    double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    //ввод 1 точки
    public static Point inputPoint(int i) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите координаты " + i + " точки");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        Point p1 = new Point(x, y);
        return p1;
    }

    //растояние между точками
    public double distanceBetweenPoints(Point other) {
        double dx = other.x - this.x;
        double dy = other.y - this.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    @Override
    public String toString() {
        return
                " x " + x +
                " y " + y;
    }
}
