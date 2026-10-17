package Lesson17.unittest;

public class Calc {
    public static int sum(int a, int b)
    {
        return a+b;
    }

    public static int substract(int a, int b)
    {
        return a-b;
    }

    public static int mult(int a, int b){
        int r=0;
        if(b<0)
        {
            a = -a; b = - b;
        }
        for (int i = 0; i < b; i++) {
            r+=a;
        }

        return r;
    }
}
