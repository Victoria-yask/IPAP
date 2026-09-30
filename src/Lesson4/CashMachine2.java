package Lesson4;

public class CashMachine2 {
    public static void main(String[] args) {

        // номиналы купюр
        int[] noms = {5000, 1000, 500, 100};

        // количество каждой купюры
        int[] kolvo = {3, 10, 7, 2};

        //Запрос суммы у пользователя
        int sum = inputSum();

        //Проверка наличия
        if (sum > totalMoney(noms, kolvo)) {
            System.out.println("В банкомате нет запрошенной суммы.");
            return;
        }

        //подбор купюр
        int[] res = new int[noms.length];//массив номинала купюр
        int remains = sum;//остаток к выдаче

        for(int i = 0; i < noms.length; ++i) {//пройтись по массиву
            res[i] = remains / noms[i];//кол-во купюр(запрос/купюру)
            if (res[i] > kolvo[i]) {// если кол-во купюр >количества
                res[i] = kolvo[i];//запись - кол-во
            }
            remains -= res[i] * noms[i];//уменьшить - кол-во*купюру
        }

        //проверка удалось ли собрать всю сумму
        if (remains != 0) {
            System.out.println("Не удается выдать такую сумму ");
            return;
        }

        //вывод
        System.out.println("Выдано " + sum + " руб.");
        //System.out.println(Arrays.toString(res));массив
        for (int i = 0; i < noms.length; i++) {
            if (res[i] > 0) {
                System.out.println("  " + noms[i] + " руб. " + res[i] + " купюр");
            }
        }
    }

    //Запрос суммы у пользователя
    static int inputSum() {
        int s = Integer.parseInt(IO.readln("Введите сумму не менее 100 руб.: "));
        return s;
    }

    //сумма денег в банкомате
    static int totalMoney(int[] noms, int[] kolvo) {
        int sum = 0;
        for(int i = 0; i < noms.length; ++i) {
            sum += noms[i] * kolvo[i];
        }
        return sum;
    }
}

