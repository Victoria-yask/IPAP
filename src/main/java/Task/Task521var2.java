package Task;

import java.util.Scanner;

public class Task521var2 {
    //пока в колоде нет 2 карты
    //если четное количество, то x = x/2
    //иначе x = x * 3 + 1
    //увеличить счетчик


    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Самая маленькая колода:  ");
        int smallest = scanner.nextInt();

        System.out.print("Самая большая колода:  ");
        int biggest = scanner.nextInt();

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
