package Lesson14;

import static Lesson14.StaticAndNonStatic.B.say1;

public class StaticAndNonStatic {

    static void main() {
        System.out.println("поле x в классе А доступно без создания объекта " + A.x);
        A.x++;
        System.out.println(A.x);
        A a1 = new A();
        System.out.println(a1.y);
        B.say1(1);
        //B.say2(1);// ошибка, обращение к нестатическому методу без указани объекта
        B b1 = new B();
        b1.say2(23);

    }

    static class A {
        static int x = 15;
        int y = 26;
    }

    static class B {
        int z;
        public static void say1(int q){
            System.out.println("Это статический метод. Он видит свой параметр.");
            System.out.println("q = " + q);
            System.out.println("но не видит нестатического поля z");
            //System.out.println("z = " + z);
        }

        public void say2(int p){
            System.out.println("Это нестатический метод. Он видит свой параметр.");
            System.out.println("p = " + p);
            System.out.println("видит нестатического поля z");
            //System.out.println("z = " + z);
        }
    }

}
