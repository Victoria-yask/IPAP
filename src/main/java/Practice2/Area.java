package Practice2;

import java.util.Scanner;

public class Area {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in); // Создаем один раз
            System.out.print("Введите длину первой стороны: ");
            int side1 = scanner.nextInt(); // Читаем сразу число
            System.out.print("Введите длину второй стороны: ");
            int side2 = scanner.nextInt();
            System.out.print("Введите длину третьей стороны: ");
            int side3 = scanner.nextInt();


            if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
                System.out.println("отрицательная или нулевая длина стороны это плохо");
            } else {
                if ((side1>=side2+side3) || (side2>=side1+side3) || (side3>=side1+side2) )
                    System.out.println("Нарушено неравенство треугольника");
                else {
                    int perimetre = side1 + side2 + side3;
                    double p = perimetre / 2.0;
                    double Square = Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
                    System.out.println("Площадь треугольника = " + Square);
                }
            }
        }
    }

