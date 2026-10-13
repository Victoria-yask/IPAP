package Practice9;

public class DistanceCalcNeumann implements IDistanceCalc {
    @Override
    public double distance(Point a, Point b) {
        double dx = Math.abs(a.getX() - b.getX());
        double dy = Math.abs(a.getY() - b.getY());
        return dx + dy;
    }
}
