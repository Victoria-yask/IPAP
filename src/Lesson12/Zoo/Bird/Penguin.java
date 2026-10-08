package Lesson12.Zoo.Bird;

import Lesson12.Zoo.Jumper;

public class Penguin extends Bird implements Jumper {

    public Penguin() {
        super("черно-белый");
    }

    public Penguin(String name, double weight, String featherColor) {
        super(name, weight, featherColor);
    }

    @Override
    public String scream() {
        return "кричит пингвин";
    }

    @Override
    public void move() {
        System.out.println("пингвины отлично плавают и ныряют");
    }

    @Override
    public void jump() {
        System.out.println("пингвин прыгает");
    }
}
