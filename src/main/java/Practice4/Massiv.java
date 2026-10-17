package Practice4;

public class Massiv {

    // Не запуская код определить, что выведет программа
    public static void main(String[] args) { // изменил на public static для запуска
        int[] arr = {3, 4, 5, 5};
        double x = 0;
        for(int i=0; i<arr.length; i++){
            x += arr[i]*arr[i];
        }
        double y = x / arr.length;
        System.out.println(y); // заменил IO.println на стандартный вывод
    }
}