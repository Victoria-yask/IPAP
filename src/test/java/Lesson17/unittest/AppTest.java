package Lesson17.unittest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    public void testCalSum() {
        Assertions.assertEquals(8, Calc.sum(5, 3));
        Assertions.assertEquals(8, Calc.sum(3, 5));
        Assertions.assertEquals(0, Calc.sum(0, 0));
        Assertions.assertEquals(0, Calc.sum(-8, 8));
        Assertions.assertEquals(-7, Calc.sum(0, -7));
        Assertions.assertEquals(-9, Calc.sum(-5, -4));
    }

    @Test
    public void testCalSubstract() {
        Assertions.assertEquals(1, Calc.substract(4, 3));
        Assertions.assertEquals(1, Calc.substract(5, 4));
        Assertions.assertEquals(-1, Calc.substract(3, 4));
        Assertions.assertEquals(0, Calc.substract(-7, -7));
        Assertions.assertEquals(7, Calc.substract(0, -7));
        Assertions.assertEquals(0, Calc.substract(0, 0));
    }

    @Test
    public void testCalcMult() {
        Assertions.assertEquals(0, Calc.mult(15, 0));
        Assertions.assertEquals(1, Calc.mult(1, 1));
        Assertions.assertEquals(8, Calc.mult(2, 4));
        Assertions.assertEquals(8, Calc.mult(8, 1));
        Assertions.assertEquals(8, Calc.mult(4, 2));
        Assertions.assertEquals(8, Calc.mult(-2, -4));
        Assertions.assertEquals(-8, Calc.mult(-2, 4));
    }

    @Test
    void testDistribution() {
        //(a+b)*c == a*c + b*c
        Random random=new Random();
        int a = random.nextInt(-1000, 1000);
        int b = random.nextInt(-1000, 1000);
        int c = random.nextInt(-1000, 1000);
        int x = Calc.sum(a, b);
        int y = Calc.mult(x, c);
        Assertions.assertEquals(y, Calc.sum(Calc.mult(a, c), Calc.mult(b, c)));
    }

}