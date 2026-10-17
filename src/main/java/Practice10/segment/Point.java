package Practice10.segment;

import java.util.Objects;

public class Point implements Comparable<Point>{
    double x, y;

    static final Point ZERO = new Point(0, 0);
    
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return Double.compare(x, point.x) == 0 && Double.compare(y, point.y) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    double distanceTo(Point other){
        return Math.hypot(x-other.x, y - other.y);
    }


    @Override
    public int compareTo(Point other) {
        if (Double.compare(x, other.x) != 0) {
            return Double.compare(x, other.x);
        }
        return Double.compare(y, other.y);
    }


}

