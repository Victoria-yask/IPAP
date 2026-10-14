package Practice9.segment;
import Practice9.point.Point;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {

    static void main() {
        ArrayList<Segment> segments = new ArrayList<>();
        segments.add(new Segment(new Point(0, 0), new Point(3, 4)));
        segments.add(new Segment(new Point(0, 0), new Point(5, 12)));
        segments.add(new Segment(new Point(0, 0), new Point(6, 8)));
        segments.forEach(System.out::println);

        for (int i = 0; i < segments.size(); i++) {
            System.out.println("Отрезок " + (i + 1) + " длина " + segments.get(i).lengthSegment());
        }

        ArrayList<Segment> sorted = SegmentService.sortedSegments(segments);
        for (Segment s : sorted) {
            System.out.println(s.lengthSegment());
        }

        System.out.println("Cредняя длина отрезков " + SegmentService.avgLengthSegment(segments));
        System.out.println("Медианная длина отрезков " + SegmentService.medLengthSegment(segments));
    }
}
