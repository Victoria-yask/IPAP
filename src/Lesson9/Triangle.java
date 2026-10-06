package Lesson9;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Triangle {

    static void main() throws FileNotFoundException {
        int[] mas = readFromF("file/triangle.txt");
        System.out.println(Arrays.toString(mas));
        int perimeter = perimeterTriangle(mas);
        System.out.println("Периметр треугольника: " + perimeter);

    }

    private static int perimeterTriangle(int[] mas) {
        int perimeter = 0;
        for (int i = 0; i < mas.length; i++) {
            perimeter += mas[i];
        }
            return perimeter;
    }

    private static int[] readFromF(String file) throws FileNotFoundException {
        Scanner scan = new Scanner(new File(file));
        int num = scan.nextInt();
        int[] mas = new int [num];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = scan.nextInt();
        }
        return mas;
    }

}
