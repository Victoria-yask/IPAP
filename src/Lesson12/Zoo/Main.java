package Lesson12.Zoo;

import Lesson12.Zoo.Bird.Bird;
import Lesson12.Zoo.Bird.Crow;
import Lesson12.Zoo.Bird.Ostrich;
import Lesson12.Zoo.Bird.Penguin;

import java.util.Arrays;

public class Main {
    static void main() {
        //birds();
        //birds2();
        birds3();
    }

    private static void birds3() {
        Ostrich os = new Ostrich("Олег ", 20, "черный");
        os.moveByAir("Москва", "США");
        //вызовем метод, передав конкретный объект
        sendMessage(os, "Москва", "США", "привет");
        //вызовем метод, передав новый объект
        sendMessage((Flyer) new Crow("зеленый"), "", "", "");
        //вызовем метод, передав объект анонимного вложенного класса
       
    }

    private static void sendMessage(Flyer f, String from, String to, String msg){
        System.out.println("пишем "+ msg + " на бумаге");
        System.out.println("прикрепляем бумагу к  "+ f);
        f.moveByAir(from, to);
        System.out.println("читаем сообщение " + msg);

    }

    private static void birds2() {
        Bird[] birds = new Bird[]{
                new Ostrich("белый"),
                new Crow("черная"),
                new Penguin()
        };
        System.out.println(Arrays.toString(birds));

    }

    private static void birds() {
        Bird cr = new Crow("белая");
        System.out.println(cr.getClass());
        System.out.println(cr.getClass().getSuperclass());

        Bird[] birds = new Bird[4];
        birds[0] = cr;
        birds[1] = new Penguin();
        birds[2] = new Crow("зеленая");
        birds[3] = new Ostrich("белый");


        for (int i = 0; i < birds.length; i++) {
            birds[i].makeSound();

        }
    }
}
