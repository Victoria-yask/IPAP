package Lesson14.SquirellAndList;

import java.util.ArrayList;

public class Main {
    static void main() {
        ArrayList<Nuts> nuts = Trees.growNut(5);
        Squirrels squirrel = new Squirrels();
        squirrel.pickNuts(nuts);
    }
}