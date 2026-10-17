package Lesson12.Calculator;

public class Divider implements Calculator {

    @Override
    public int calculator(int x, int y) {
        if (y == 0)
            System.out.println("на ноль делить нельзя");
        return x/y;
    }
}
