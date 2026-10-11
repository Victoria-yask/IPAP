package Lesson15.figures;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;

import static Lesson15.figures.Triangle.*;

public class Main {
    static void main() throws FileNotFoundException {
        //ArrayList<Triangle> triangles = inputTriangleList(2);
        //System.out.println(triangles);
        //System.out.println("Средний периметр треугольников " + avgPerTriangle(triangles));

        ArrayList<Triangle> triangles2 = readFromF("file/lesson15/triangles.txt");
        //System.out.println(triangles2);
        printTriangle(triangles2);

        //сортировка списка по значениям перимтера
        triangles2.sort(Comparator.comparingDouble(Triangle::perTriangle));
        //System.out.println(triangles2);
        printTriangle(triangles2);
        
    }
}





