package Extract;

public class TypeDate {

    static void main() {
        int x = 10;
        int y = x+10;
        int z = 15;

        y = z-x;
        System.out.println("y= "+y);
        x = x*2;
        System.out.println("x= "+x + " y= "+y);
        y += 6;
        x-=4;
        System.out.println("x= "+x + " y= "+y);
        System.out.println("остато от деления x на 5 = " + x%5);
        System.out.println("остато от деления y на 5 = " + y%5);
        System.out.println("остато от деления z на 5 = " + z%5);

        String s1 = "Гриша", s2 = "Маша";
        String s3 = s1 + s2;
        System.out.println(s3);

        System.out.println(x>y);
        System.out.println(z<=y);
        System.out.println(z%2 != 0);
        System.out.println(s1 + " > " + s2 + " результат " + (s1.compareTo(s2)));//сравнение строк больше/меньше
        System.out.println(s3.equals("ГришаМаша"));//сравнение строк

    }
}
