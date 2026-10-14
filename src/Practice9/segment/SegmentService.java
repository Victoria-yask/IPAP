package Practice9.segment;
import java.util.ArrayList;
import java.util.Comparator;

public class SegmentService {

    //средняя длина отрезков в списке
    public static double avgLengthSegment(ArrayList<Segment> segments){
        double avgLength = 0;
        double sumLength = 0;
        for (int i = 0; i < segments.size(); i++) {
            sumLength += segments.get(i).lengthSegment();
        }
        avgLength = sumLength/segments.size();
        return avgLength;
    }

    //сортировка отрезков по длине
    public static ArrayList<Segment> sortedSegments(ArrayList<Segment> segments) {
        ArrayList<Segment> copy = new ArrayList<>(segments);
        copy.sort(Comparator.comparingDouble(Segment::lengthSegment));
        return copy;
    }

    //медианная длина отрезков в списке
    public static double medLengthSegment(ArrayList<Segment> segments){
        ArrayList<Segment> sorted = sortedSegments(segments);
        int n = sorted.size();

        if (n % 2 == 1) {
            return sorted.get(n / 2).lengthSegment();
        } else {
            return (sorted.get(n / 2 - 1).lengthSegment()
                    + sorted.get(n / 2).lengthSegment()) / 2.0;
        }
    }

    //модная длина отрезков в списке

}
