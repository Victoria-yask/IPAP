package Task;
//Цветочки
//https://acmp.ru/index.asp?main=task&id_task=504

public class Task504 {

    void main() {

        int day = Integer.parseInt(IO.readln("Введите количество дней: "));
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
