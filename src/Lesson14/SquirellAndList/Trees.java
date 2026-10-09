package Lesson14.SquirellAndList;

import java.util.ArrayList;

public class Trees {

    public static ArrayList<Nuts> growNut(int countNut){
        ArrayList<Nuts> nuts = new ArrayList<>();

        for (int i = 0; i < countNut; i++) {
            nuts.add(new Nuts());
        }
        return nuts;
    }
}