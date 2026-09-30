package Task;
//Журавлики
//https://acmp.ru/index.asp?main=task&id_task=92

public class Task92 {
    void main() {
        int s = Integer.parseInt(IO.readln("Сколько сделали журавликов: "));

        int petya = s / 6;
        int sergey = s / 6;
        int katya = petya * 4;

        System.out.println("Петя " + petya);
        System.out.println("Сергей " + sergey);
        System.out.println("Катя " + katya);
    }
}
