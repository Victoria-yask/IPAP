package Lesson6;
import java.util.Arrays;

//польз вводит число, найти сколько раз встречается число
//если числа нет, вывести ближайшее число
public class Arrays3 {

    public static int countRepetitions(int[] mas, int num) {
        int count = 0;
        for (int i = 0; i < mas.length; ++i) {
            if (mas[i] == num) {
                count++;
            }
        }
        return count;
    }

    public static int findClosest(int[] mas, int num) {
        int closest = mas[0];
        int minDelta = Math.abs(mas[0] - num);

        for (int i = 1; i < mas.length; i++) {
            int delta = Math.abs(mas[i] - num);
            if (delta < minDelta) {
                minDelta = delta;
                closest = mas[i];
            }
        }
        return closest;
    }

        public static void printResult(int[] mas, int num) {
            int count = countRepetitions(mas, num);
            if (count > 0) {
                System.out.println("Число " + num + " встречается " + count + " раз");
            } else {
                int closest = findClosest(mas, num);
                System.out.println("Числа " + num + " нет в массиве. Ближайшее: " + closest);
            }
        }

    public static void main(String[] args) {
        int num = Integer.parseInt(IO.readln("Введите число:"));
        int[] mas = new int[]{1, 5, 7, 6, 4, 5, 1, 7, 6, 5, 3, 0, 7};
        printResult(mas, num);
    }
}
