package Task;
//Автобусная экскурсия
//https://acmp.ru/index.asp?main=task&id_task=233

public class Task233 {
    void main() {
        int count = Integer.parseInt(IO.readln("Ввeдите количество мостов: "));

        int height; //высота моста
        int counter = 0; // кол-во мостов
        boolean crashed = false; //аварии
        while (counter < count && !crashed) {
            counter++;
            height = Integer.parseInt(IO.readln("Введите высоту моста №" + counter + ": "));
            if (height <= 437) {
                System.out.println("Авария на мосте №: " + counter);
                crashed = true;
            }
        }
        if(!crashed) {
            System.out.println("Аварий не было");
        }
    }
}

