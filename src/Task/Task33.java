package Task;
//2 бандита
//https://acmp.ru/index.asp?main=task&id_task=33

public class Task33 {
    void main() {
        int shotByHarry = Integer.parseInt(IO.readln("сколько прострелил Гарри: "));
        int shotByLarry = Integer.parseInt(IO.readln("сколько прострелил Ларри: "));
        int total = shotByHarry + shotByLarry - 1;
        System.out.println("Всего простреленных банок " + total);
        IO.println("Гарри не прострелили " + (total-shotByHarry));
        IO.println("Ларри не прострелили " + (total-shotByLarry));
    }
}
