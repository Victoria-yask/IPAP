package Practice9.point;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args){
        ArrayList<Point> points = inputPointsList(2);
        System.out.print(points);

        IDistanceCalc euclid  = new DistanceCalcEuclidean();
        IDistanceCalc neumann = new DistanceCalcNeumann();
        IDistanceCalc moore   = new DistanceCalcMoore();

        System.out.println("Кратчайшеее расстояние по Евклиду " + PointService.minDistance(points, euclid));
        System.out.println("Кратчайшеее расстояние по Нейману: " + PointService.minDistance(points, neumann));
        System.out.println("Кратчайшеее расстояние по Муру:    " + PointService.minDistance(points, moore));

        // Расстояния до точки(0,0)
        ArrayList<Double> distto00euclid = PointService.distanceTo00(points, euclid);
        ArrayList<Double> distto00neumann = PointService.distanceTo00(points, neumann);
        ArrayList<Double> distto00moore = PointService.distanceTo00(points, moore);


        System.out.println("Расстояния точек до Точки(0, 0) по Евклиду " + distto00euclid);
        System.out.println("Расстояния точек до Точки(0, 0) по Нейману " + distto00neumann);
        System.out.println("Расстояния точек до Точки(0, 0) по Муру " + distto00moore);

        //сортировка
        distto00euclid.sort(null);
        distto00neumann.sort(null);
        distto00moore.sort(null);

        System.out.println("Сортировка расстояний до Точки(0, 0) по Евклиду " + distto00euclid);
        System.out.println("Сортировка расстояний до Точки(0, 0) по Нейману " + distto00neumann);
        System.out.println("Сортировка расстояний до Точки(0, 0) по Муру " + distto00moore);

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

}
