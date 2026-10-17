package Lesson17.trycatch1;

public class B {
    public B() {
    }

    public static int mult(int a, int b) throws UnluckyNumException {
        if (a != 13 && b != 13) {
            return a * b;
        } else {
            throw new UnluckyNumException("ужас!", 13);
        }
    }
}