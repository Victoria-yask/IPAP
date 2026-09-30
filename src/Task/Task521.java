package Task;
//Пасьянс старухи Шапокляк
//https://acmp.ru/index.asp?main=task&id_task=521

public class Task521 {
    void main() {

        int p = Integer.parseInt(IO.readln("Введите число 1: "));
        int k = Integer.parseInt(IO.readln("Введите число 2: "));

        int counter = 0; //счетчик кол-во ходов

        while (p <= k) { // брать след колоду от числа 1 до числа 2
            int cards = p;//колоды

            while (cards > 2) { //пока в колоде > 2 карт
                if (cards % 2 == 0) { //если четное кол-во, то убрать половину
                    cards = cards / 2;
                } else {
                    cards = cards * 3 + 1; //если нечетное кол-во, то *3 и +1
                }
                counter++;//подсчет кол-ва ходов
            }
            p++; // увеличиить число 1 на 1
        }
        System.out.println("Количество ходов: " + counter);
    }
}