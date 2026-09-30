package Practice3;

public class Operations {
    static void main() {
        exemple3();
    }

    private static void exemple1() {
        double x = 25;
        double y = 16;
        double z = 15;
        x = 42;//присваивание
        --y;//уменьшить на 1
        z *= 10;//умножение
        IO.println(x + " " + y + " " + z);
        IO.println(x == y);
        IO.println(z/10 == y);
    }

    public static void exemple2() {
        double x = 25;
        double y = 16;
        double z = 15;
        double a = x + y / z;
        IO.println(a);
        double b = (x + y) / z;
        IO.println(b);
    }

    public static double sum(double x, double y) {
        return x + y;
    }

    private static void exemple3() {
        double x = 25;
        double y = 16;
        double z = 15;
        double c = z * sum(x, y);
        IO.println(c);
    }
}
