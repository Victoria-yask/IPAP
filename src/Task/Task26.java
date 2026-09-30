package Task;
//2 окружности
//https://acmp.ru/index.asp?main=task&id_task=26

public class Task26 {

    void main() {
        int x1 = Integer.parseInt(IO.readln("Введите x: "));
        int y1 = Integer.parseInt(IO.readln("Введите y: "));
        int r1 = Integer.parseInt(IO.readln("Введите r: "));

        int x2 = Integer.parseInt(IO.readln("Введите x2: "));
        int y2 = Integer.parseInt(IO.readln("Введите y2: "));
        int r2 = Integer.parseInt(IO.readln("Введите r2: "));

        long d = (x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1);

        if (d < (r2 - r1) * (r2 - r1) || d < (r1 + r2) * (r1 + r2)) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}
