package Lesson17;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {
    static void main() throws Exception {
        System.out.println("введите 5 чисел");
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            try {
                int x = sc.nextInt();
                if (x == 13)
                    throw new Exception("ужас");
                list.add(x);
            } catch (InputMismatchException e) {
                System.out.println("вы ввели не число");
                sc.next();
            }
            catch (Exception e) {
                    System.out.println("у нас авария" + e.getMessage());
                   // System.out.println(e.getStackTrace());
                //e.printStackTrace();//имеет смысл вывести в консоль стек функций
                //в глубине которого произошло исключение
                }
            }
        System.out.println(list);
    }

}


