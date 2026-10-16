package Practice10.segment;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    static void main() {
        List<Point> points = readPoints("file/Practice10/points.txt");
        System.out.println("points" + points);

        //сортировка точек по расстоянию до точки00
        //points.sort(Comparator.comparingDouble(p->p.distanceTo(Point.ZERO)));
        List<Point> sortedPoints = points.stream()//превращаем список в поток
                                        .sorted(Comparator.comparingDouble(p->p.distanceTo(Point.ZERO)))
                                        .toList();//собиреаем неизменяемый список точек из потока
        System.out.println("Исходный points " + points);
        System.out.println("sorted points " + sortedPoints);

        List<Segment> segments = makeSegments(points);
        printSegments(segments);
        //System.out.println("segments.size()) " + segments.size());
        //.out.println("segments " + segments);

        //segments.forEach(new Consumer<Segment>() {
        //    @Override
        //    public void accept(Segment segment) {
        //        System.out.println(segment);
        //    }
        //});

        //краткая лямбда
        //segments.forEach(segment -> System.out.println(segment));

        //краткая после лямбда
       // segments.forEach(System.out::println);
        var sortedSegments =  segments.stream().sorted(Comparator.comparingDouble(Segment::lenght)).toList();
        printSegments(sortedSegments);

        //List<Double> listSegmentLen = new ArrayList<>();
        //for (Segment s: segments)
        //    listSegmentLen.add(s.lenght());
        //краткая стрим
        //List<Double> listSegmentLen = segments.stream().map(segment -> segment.lenght()).toList();
        List<Double> listSegmentLen = segments.stream().map(Segment::lenght).toList();
        double avg = listSegmentLen.stream().mapToDouble(Double::doubleValue).sum() / listSegmentLen.size();
        double average = average(listSegmentLen);
        System.out.println("average " + average);

        //segments.sort(null); //не работает, поскольку Segment не есть  Comporable
        printSegments(segments);

    }

    static double average(List<Double> values) {
        double s = 0;
        for (Double x: values)
            s+= x;
        return  s/values.size();
    }

    public static void printSegments(List<Segment> segments){
        System.out.println("список сегментов в количестве " + segments.size());
        segments.forEach(s->IO.println("длина " + s.lenght()));
        System.out.println("----------- ");
    }

    private static List<Segment> makeSegments(List<Point> points) {
        if (points == null)
            return null;
        List<Segment> res = new ArrayList<>();//можно заранее посчитать кол-во сегментов и передать конструктору
        for (int i = 0; i < points.size()-1; i++) {
            for (int j = i+1; j < points.size(); j++) {
                res.add(new Segment(points.get(i), points.get(j)));
            }
        }
        return res;
    }

    private static List<Point> readPoints(String filename) {
        List<Point> points = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(new File(filename));
            while (scanner.hasNextDouble()) {
                double x = scanner.nextDouble();
                double y = scanner.nextDouble();
                points.add(new Point(x, y));             }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return points;
    }
}
