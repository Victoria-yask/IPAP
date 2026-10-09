package Lesson14.Generic;

import java.lang.reflect.Array;

public class Massiv<Type> {

    Type[] arr;

    //конструктор принимает число и создает массив
    public Massiv(Class<Type> c, int size) {
        arr = (Type[]) Array.newInstance(c, size);
    }

    //вывести массив
    public void print(){
        System.out.println("-------------");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("++++++++++++++");
    }

    //вернуть последний элемент
    public Type getLast(){
        return arr[arr.length-1];
    }

}
