package Task;
//Цветочки
//https://acmp.ru/index.asp?main=task&id_task=504

import java.util.Scanner;

public class Task504 {

    void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество дней: ");
        int day = scanner.nextInt();
//Начальное состояние GCV
        String left = "G", center = "C", right = "V";

//Повторить k раз
        for (int i = 0; i < day; i++) {
            // Маша делает перестановку
            String taburet = right;
            right = center;
            center = taburet;
            //Таня делает перестановку
            taburet = left;
            left = center;
            center = taburet;

        }
        System.out.println(left+ center + right);
    }
}
