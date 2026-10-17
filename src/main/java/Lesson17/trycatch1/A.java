package Lesson17.trycatch1;

public class A {
public static void printNum(int num) throws Exception {
    if (num == 13)
        throw new Exception("ужас");
    System.out.println(num);
}
}
