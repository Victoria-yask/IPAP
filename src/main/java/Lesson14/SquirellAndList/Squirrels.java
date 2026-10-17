package Lesson14.SquirellAndList;

import java.util.ArrayList;

public class Squirrels {

    public void pickNuts(ArrayList<Nuts> nuts){
        double total = 0;
        for (int i = 0; i < nuts.size(); i++) {
            System.out.println("ура, еще орех!");
            total += nuts.get(i).weight;
        }
        System.out.println("Собрала " + total);
    }
}
