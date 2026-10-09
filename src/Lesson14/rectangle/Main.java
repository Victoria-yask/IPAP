package Lesson14.rectangle;
import java.util.ArrayList;

public class Main {

    static void main() {
        ArrayList<Rectangle> rectangles = Rectangle.createListRec();
        System.out.println(rectangles);
        System.out.println("Средняя площадь " + Rectangle.avgArea(rectangles));
    }
}
