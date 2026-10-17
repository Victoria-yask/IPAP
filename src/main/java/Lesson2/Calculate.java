package Lesson2;
import java.util.Scanner;

public class Calculate {
    void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввведите длину 3 сторон треугольника");
        double length1 = scanner.nextDouble();
        double length2 = scanner.nextDouble();
        double length3 = scanner.nextDouble();
        if (length1>=0 &&  length2>=0 && length3>=0) {
            double p = (length1 + length2 + length3) / 2;
            double s = Math.sqrt(p * (p - length1) * (p - length2) * (p - length3));
            System.out.printf("Площадь треугольника %.2f см²", s);
        }
        else
            System.out.println("нельзя вводить отрицательные числа");
    }
}
