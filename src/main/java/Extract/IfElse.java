package Extract;
import java.util.Scanner;
public class IfElse {

    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("введите положительное число");
        int x = sc.nextInt();
        System.out.println("x положительное " + (x>0));
        if(x>0)
            System.out.println("x положительное ");
        else {
            System.out.println("x отрицательное ");
            if (x==0) {
                System.out.println("ноль");
            }
            else
                System.out.println("отрицательное");
        }
        System.out.println("введите y, z");
        int y = sc.nextInt();
        int z = sc.nextInt();
        if(y>0 && z>0)
            System.out.println("оба положительные");
        if(y<0 && z<0)
            System.out.println("оба отрицательные");
        if((y<0 && z>0)|| (y>0 && z<0))
            System.out.println("разные");
        if (y==0 || z==0)
            System.out.println("y или z ноль");
    }
}
