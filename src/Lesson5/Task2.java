package Lesson5;

public class Task2 {
    void main(){
        int x = 12;
        double y = x/5;
        int z = x-4;
        int i = 0;

        while (z < 10){
            i = z/2;
            while (i >= y){
                System.out.println("x равно " + i);
                i = i -1;
                y = y +1.5;
            }
        }
    }
}
