package Lesson5;
//1)напишите функцию, которая вычисляет расстояние, между двумя точками
//на плоскости, заданными парами координат
//x1, y1, x2, y2
//
//*написать класс Точка, и передавать в функуцию не 4 отдельные координаты, а 2 точки
//
//
//2)сделать функцию, которая спрашивает у пользователя координаты 2 точек,
//и выводит на экран расстояние между ними
//
//3)сделать функцию, которая спрашивает у пользователя координаты 3 точек,
//после чего считает и выводит площадь треугольника, образованного ими.
//
//4)сделать функцию, которая получает в качестве аргументов координаты 3
//точек, и выводит длину максимального из отрезков

public class Point {

    private double x;
    private double y;

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

    public static Point inputPoint() {
        double x = Double.parseDouble(IO.readln("Введите кординаты точки x: "));
        double y = Double.parseDouble(IO.readln("Введите кординаты точки y:  "));
                return new Point(x, y);
    }

    public static double distanceBetweenPoints(Point p1, Point p2) {
        double distance = Math.sqrt((p2.x - p1.x) * (p2.x - p1.x) + (p2.y - p1.y) * (p2.y - p1.y));
        return distance;
    }

    public static double areaTriangle(Point p1, Point p2, Point p3) {
        double determinant = p1.x * (p2.y - p3.y) + p2.x * (p3.y - p1.y) + p3.x * (p1.y - p2.y);
        double area = Math.abs(determinant) / 2;
        return area;
    }

    public static double maxDistanceBetweenPoints(Point p1, Point p2, Point p3) {
        double max = Math.max(distanceBetweenPoints(p1, p2), Math.max(distanceBetweenPoints(p2, p3), distanceBetweenPoints(p3, p1)));
        return max;
    }

    public static void main(String[] args) {

        Point point1 = inputPoint();
        Point point2 = inputPoint();
        Point point3 = inputPoint();

        System.out.println("Расстояние между двумя точками на плоскости : " + distanceBetweenPoints(point1, point2));
        System.out.println("Площадь треугольника : " + areaTriangle(point1, point2, point3));
        System.out.println("Максимальная длина отрезка : " + maxDistanceBetweenPoints(point1, point2, point3));

    }
}
