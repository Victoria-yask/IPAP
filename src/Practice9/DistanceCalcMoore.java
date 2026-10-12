package Practice9;

public class DistanceCalcMoore implements DistanceCalc{
    @Override
    public double distance(Point a, Point b) {
        double dx = Math.abs(a.getX() - b.getX());
        double dy = Math.abs(a.getY() - b.getY());
        return Math.max(dx, dy);
    }
}
