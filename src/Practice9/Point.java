package Practice9;
import java.util.ArrayList;
import java.util.Scanner;

public class Point {
    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    //ввод списка точек
    public static ArrayList<Point> inputPointsList(int n) {
        ArrayList<Point> points = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < n; i++) {
            System.out.println("Введите точку " + (i+1)  + " x y: ");
            int x = sc.nextInt();
            int y = sc.nextInt();
            points.add(new Point(x, y));
        }
        return points;
    }

    //кратчайшее расстояние
    public static double  minDistance(ArrayList<Point> points,  IDistanceCalc calc) {
        double  min = calc.distance(points.get(0), points.get(1));
        for (int i = 0; i < points.size(); i++) {
            for (int j = i + 1; j < points.size(); j++) {
                double d = calc.distance(points.get(i), points.get(j));
                if (d < min) {
                    min = d;
                }
            }
        }
        return min;
 }


    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
