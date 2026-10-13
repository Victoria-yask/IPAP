package Practice9;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args){
        ArrayList<Point> points = Point.inputPointsList(2);
        System.out.println(points);

        DistanceCalc euclid  = new DistanceCalcEuclidean();
        DistanceCalc neumann = new DistanceCalcNeumann();
        DistanceCalc moore   = new DistanceCalcMoore();

        System.out.println("Кратчайшеее расстояние по Евклиду " + Point.minDistance(points, euclid));
        System.out.println("Кратчайшеее расстояние по Нейману: " + Point.minDistance(points, neumann));
        System.out.println("Кратчайшеее расстояние по Муру:    " + Point.minDistance(points, moore));


    }

}
