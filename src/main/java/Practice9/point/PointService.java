package Practice9.point;

import java.util.ArrayList;

public class PointService {
    //кратчайшее расстояние
    public static double minDistance(ArrayList<Point> points, IDistanceCalc calc) {
        double min = calc.distance(points.get(0), points.get(1));
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

    //расстояние от точек до Точки(0, 0)
    public static ArrayList<Double> distanceTo00(ArrayList<Point> points, IDistanceCalc calc) {
        Point origin = new Point(0, 0);
        ArrayList<Double> distanceTo00 = new ArrayList<>();

        for (Point p : points) {
            distanceTo00.add(calc.distance(p, origin));
        }
        return distanceTo00;
    }

}
