package Practice9.point;

public class DistanceCalcEuclidean implements IDistanceCalc {

    @Override
    public double distance(Point a, Point b) {
        double dx = a.getX() - b.getX();
        double dy = a.getY() - b.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }


}
