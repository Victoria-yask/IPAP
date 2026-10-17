package Lesson15.animals;

import java.util.ArrayList;

public class Lion extends Mammal {

    public Lion(String name, String color) {
        super(name, color);
    }

    public static void huntingGiraffe(ArrayList<Giraffe> giraffes) {
        System.out.println("Лев охотится на жирафа");

        for (int i = 0; i < giraffes.size(); i++) {
            System.out.println("пойман жираф " + giraffes.get(i));
            giraffes.remove(i);
            return;
            }
        }
    }



