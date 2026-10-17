package Lesson14.Generic;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Massiv<Nut> mas1 = new Massiv<>(Nut.class, 4);
        mas1.arr[0] = new Nut(3);
        mas1.arr[1] = new Nut(5);
        mas1.arr[2] = new Nut(4);
        mas1.arr[3] = new Nut(6);

        mas1.print();
        System.out.println(mas1.getLast());


        //список на основе массива
        ArrayList<String> strings = new ArrayList<>();
        strings.add("1 строка");
        System.out.println(strings);

        ArrayList<Nut> nuts = new ArrayList<>();
        nuts.add(new Nut(2));
        nuts.add(new Nut(1));
        nuts.add(new Nut(3));
        System.out.println(nuts);



    }
}

