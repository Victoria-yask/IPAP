package Practice2;

public class Area {

        public static void main(String[] args) {
            int side1 = Integer.parseInt(IO.readln("Введите длину первой стороны:"));
            int side2 = Integer.parseInt(IO.readln("Введите длину второй стороны:"));
            int side3 = Integer.parseInt(IO.readln("Введите длину третьей стороны:"));

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

