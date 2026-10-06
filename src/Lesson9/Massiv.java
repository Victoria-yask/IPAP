package Lesson9;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Massiv {

    public static void main() {
        int[] mas = {2, 5, 1};
        System.out.println(Arrays.toString(mas));
        int countD = countDistinct(mas);
        System.out.println("Количество уникальных значений: " + countD);
        countD = countDistinctWithSet(mas);
        System.out.println("Количество уникальных = " + countD);
    }

    public static int countDistinct(int[] mas) {
        int count = 0;
        for (int i = 0; i < mas.length; i++) {
            int y = mas[i];
            if (!isPresent(y, mas, 0, i - 1))
                count++;
            }
            return count;
    }

    public static boolean isPresent(int x, int[] mas, int from, int to ){
        for (int i = from; i <= to ; i++) {
            if(mas[i] == x)
                return true;
        }
       return false;
    }

    public static int countDistinctWithSet(int[] mas) {
        Set<Integer> set1 = new TreeSet(); //<Integer> - множество
        for(int i = 0; i < mas.length; ++i) {
            set1.add(mas[i]);
        }
        return set1.size();
    }

    public static int countDistinctWithStream(int[] mas) {
        return (int)Arrays.stream(mas).distinct().count();
    }
}




