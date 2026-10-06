package Lesson9;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.io.File;


public class Massiv1 {

    static void main() throws FileNotFoundException {
       // int[] mas = createMassiv();
        int[] mas = readMassivFromF("file/array.txt");
        System.out.println(Arrays.toString(mas));
        int countD = countDistinctSet(mas);
        System.out.println("Количество уникальных значений: " + countD);
        countD = countDistincStream(mas);
        System.out.println("Количество уникальных значений: " + countD);

    }

    public static int[] readMassivFromF(String filename) throws FileNotFoundException {
        Scanner scan = new Scanner(new File(filename));
        int num = scan.nextInt();
        int[] mas = new int [num];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = scan.nextInt();
        }
        return mas;
    }


        public static int[] createMassiv(){
        int num = Integer.parseInt(IO.readln("Введите размер массива:"));
        int[] mas = new int [num];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = Integer.parseInt(IO.readln("Введите число "));
        }
        return mas;
    }

    public static int countDistinctSet(int[] mas) {
        Set<Integer> set1 = new TreeSet(); //<Integer> - множество
        for(int i = 0; i < mas.length; ++i) {
            set1.add(mas[i]);
        }
        return set1.size();
    }

    public static int countDistincStream(int[] mas) {
        return (int)Arrays.stream(mas).distinct().count();
    }

}
