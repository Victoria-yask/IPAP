package Lesson15.figures;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static Lesson15.figures.Point.inputPoint;

public class Triangle {
    Point p1;
    Point p2;
    Point p3;

    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    //ввод треугольника
    public static Triangle inputTriangle() {
        Point p1 = inputPoint(1);
        Point p2 = inputPoint(2);
        Point p3 = inputPoint(3);
        Triangle triangles = new Triangle(p1, p2, p3);
        return triangles;
    }

    //список треугольников из входного файла
    public static ArrayList<Triangle> readFromF(String file) throws FileNotFoundException {
        Scanner scan = new Scanner(new File(file));
        ArrayList<Triangle> triangles = new ArrayList<>();

        while (scan.hasNextLine()) {
            Point p1 = new Point(scan.nextDouble(), scan.nextDouble());
            Point p2 = new Point(scan.nextDouble(), scan.nextDouble());
            Point p3 = new Point(scan.nextDouble(), scan.nextDouble());
            triangles.add(new Triangle(p1, p2, p3));
        }
        scan.close();
        return triangles;
    }

    //ввод 2 треугольников
    public static ArrayList<Triangle> inputTriangleList(int size) {
        System.out.println("Введите " + size + " треугольников ");

        ArrayList<Triangle> triangles = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            Triangle t = inputTriangle();
            triangles.add(t);
        }
        return triangles;
    }

    //Периметр
    public double perTriangle() {
        return p1.distanceBetweenPoints(p2)
                + p2.distanceBetweenPoints(p3)
                + p3.distanceBetweenPoints(p1);
    }

    //средний периметр
    public static double avgPerTriangle(ArrayList<Triangle> triangles){
        double p = 0;
        for (Triangle t : triangles) {
            p += t.perTriangle();
        }
        return p / triangles.size();
    }
    //площадь треугольника
    public double area() {
        double x1 = p1.getX(), y1 = p1.getY();
        double x2 = p2.getX(), y2 = p2.getY();
        double x3 = p3.getX(), y3 = p3.getY();

        double det = x1 * (y2 - y3)
                + x2 * (y3 - y1)
                + x3 * (y1 - y2);

        return Math.abs(det) / 2.0;
    }

    //суммарная площадь треугольников
    public static double sumArea(ArrayList<Triangle> triangles) {
        double sum = 0;
        for (Triangle t : triangles) {
            sum += t.area();
        }
        return sum;
    }

    public static void printTriangle(List<Triangle> triangles){
        for (Triangle t : triangles){
            System.out.println(t + " с периметром " + t.perTriangle());
        }
    }
    
    @Override
    public String toString() {
        return "\nТреугольник: " + p1 + " " + p2 + " " + p3;
    }
}
