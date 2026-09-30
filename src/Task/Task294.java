package Task;
//https://acmp.ru/index.asp?main=task&id_task=294
//k1 - начальное число болтов (100 ≤ k1 ≤ 30000, k1 кратно 100)
//l1 -  процент потерянных деталей (0 ≤ l1 ≤ 100)
//m1 - стоимость одного болта (1 ≤ m1 ≤ 100)
//k2 - начальное число гаек (100 ≤ k2 ≤ 30000, k2 кратно 100),
//l2 - процент потерянных деталей (0 ≤ l2 ≤ 100)
//m2  - стоимость одной гайки (1 ≤ m2 ≤ 100)
//найти - размер ущерба

public class Task294 {

    public static int getSumLost(int k1, int l1, int m1, int k2, int l2, int m2){
        //кол-во потери
        int countlostBolt  = k1 * l1 / 100;
        int countlostScrew = k2 * l2 / 100;

        //кол-во оставшихся
        int remainBolt = k1 - countlostBolt;
        int remainScrew = k2 - countlostScrew;

        //сколько можно составить пар
        int matched = Math.min(remainBolt, remainScrew);

        // кол-во из оставшихся
        int excessBolt  = remainBolt  - matched;
        int excessScrew = remainScrew - matched;

        //сумма ущерба
        int sumLost = (((countlostBolt + excessBolt) * m1) + ((countlostScrew + excessScrew) * m2));
        return sumLost;
    }


    public static void main(String[] args) {

        int k1 = Integer.parseInt(IO.readln("Сколько было болтов: "));
        int l1= Integer.parseInt(IO.readln("Процент потери болтов: "));
        int m1 = Integer.parseInt(IO.readln("Стоимость болтов: "));

        int k2 = Integer.parseInt(IO.readln("Сколько было гаек: "));
        int l2= Integer.parseInt(IO.readln("Процент потери гаек: "));
        int m2 = Integer.parseInt(IO.readln("Стоимость гаек: "));

        int damage = getSumLost(k1, l1, m1, k2, l2, m2);
        System.out.println("Ущерб: " + damage);
    }
}
