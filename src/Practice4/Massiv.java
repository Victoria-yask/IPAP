package Practice4;

public class Massiv {

    // Не запуская код определить, что выведет программа
    void main(){
        int[] arr = {3, 4, 5, 5};
        double x = 0;
        for(int i=0; i<arr.length; i++){
            x += arr[i]*arr[i];
        }
        double y = x / arr.length;
        IO.println(y);
    }
}
