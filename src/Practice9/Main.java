package Practice9;
import java.util.ArrayList;
import static Practice9.Point.minDistance;


public class Main {

    public static void main(String[] args){
        ArrayList<Point> points = Point.inputPointsList(2);
        System.out.println(points);

        DistanceCalc euclid  = new DistanceCalcEuclidean();
        System.out.println("Кратчайшеее расстояние по Евклиду " + minDistance(points, euclid));
    }

}
