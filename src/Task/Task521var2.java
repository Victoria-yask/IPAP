package Task;

public class Task521var2 {
    //пока в колоде нет 2 карты
    //если четное количество, то x = x/2
    //иначе x = x * 3 + 1
    //увеличить счетчик


    static void main() {
        int smallest = Integer.parseInt(IO.readln("Самая маленькая колода: "));
        int biggest = Integer.parseInt(IO.readln("Самая большая колода: "));

        int counter = 0; //счетчик кол-во ходов

        for (int koloda = smallest; koloda <= biggest; koloda++) {
            int x = koloda;
            while (x !=2){
                if(x%2 == 0)
                    x = x/2;
                else
                    x = x*3 + 1;
                counter++;

            }
        }
        System.out.println("Итого: " + counter);
    }
}
