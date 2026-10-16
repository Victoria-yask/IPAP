package Practice10.segment;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main2 {
    static void main() {
      //  exempleStr();
      //  exempleSegmentComp();
        exempleStrUnNatural();
    }

    private static void exempleStr() {
        //сортировка без указания критерия
        List<String> stringList = new ArrayList<>(List.of("Костя", "Аня", "Маша"));
        System.out.println("stringList " + stringList);
        stringList.sort(null);
        System.out.println("stringList " + stringList);
        stringList.sort(Comparator.reverseOrder());
        System.out.println("stringList " + stringList);
    }

    private static void exempleSegmentComp() {
        List<SegmentComp> segmentList = new ArrayList<>(List.of(new SegmentComp(new Point(-4, 0), new Point(3,4)),
                new SegmentComp(0, 3, 4, 0),
                new SegmentComp(10, 10, 2, 5)));
        //вынужденно используем stream().map() для превращения списка объектов класса-наследника в список объектов родит класса
        Main.printSegments(segmentList.stream().map(sc->(Segment)sc).toList());
        segmentList.sort(null);
        Main.printSegments(segmentList.stream().map(sc->(Segment)sc).toList());
        segmentList.sort(Comparator.reverseOrder());
        Main.printSegments(segmentList.stream().map(sc->(Segment)sc).toList());
    }

    private static void exempleStrUnNatural() {
        //сортируем строки по кол-ву букв
        List<String> stringList = new ArrayList<>(List.of("Костя", "Аня", "Маша"));
        System.out.println("stringList " + stringList);
        //кол-во букв в качестве критерия
        stringList.sort(Comparator.comparingInt(s->s.length()));
        System.out.println("stringList " + stringList);
        stringList.sort(Comparator.comparingInt(s->-s.length()));
        System.out.println("stringList " + stringList);
        stringList.sort(Comparator.comparingInt(s->((String)s).length()).reversed());
        System.out.println("stringList " + stringList);
        //два уровня сортировки
        stringList.sort(Comparator.comparingInt(s->((String)s).length()).thenComparing(s->(String)s));
        System.out.println("stringList " + stringList);


    }
}
