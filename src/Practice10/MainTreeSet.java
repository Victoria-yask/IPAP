package Practice10;
import Practice10.segment.Main;
import Practice10.segment.Point;
import Practice10.segment.Segment;
import Practice10.segment.SegmentComp;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MainTreeSet {

    static void main() {
        List<SegmentComp> segmentList = new ArrayList<>(List.of(new SegmentComp(new Point(-4, 0), new Point(3,4)),
                new SegmentComp(0, 3, 4, 0),
                new SegmentComp(10, 10, 2, 5),
                new SegmentComp(4, 0, 0,3),
                new SegmentComp(-10, -10, -2, -5)));
        List<String> stringList = new ArrayList<>(List.of("Костя", "Аня", "Маша", "Вася", "Аня", "Вася"));

        Set<String> uniqueStrings = new TreeSet<>(stringList);
        System.out.println("uniqueStrings " + uniqueStrings);

        Set<SegmentComp> uniqueSegment = new TreeSet<>(segmentList);
        System.out.println("исходеый список сегментов");
        Main.printSegments(segmentList.stream().map(sc->(Segment)sc).toList()); //работате потомучто Comparable
        System.out.println("уникальные сегменты");
        Main.printSegments(uniqueSegment.stream().map(sc->(Segment)sc).toList());

        List<Point> points = List.of(new Point(0, 3), new Point(4, 0), new Point(4, 0), new Point(3, 0));
        System.out.println("points" + points);
        Set<Point> uniquePoints = new TreeSet<>(points); // нельзя, нет метода compareTo у точки
        //System.out.println("uniquePoints" + uniquePoints);


    }
}
