package Lesson12.Zoo.Bird;

import Lesson12.Zoo.Flyer;

public class Crow extends Bird implements Flyer {

    public Crow(String featherColor) {
        super(featherColor);
    }

    public Crow(String name, double weight, String featherColor) {
        super(name, weight, featherColor);
    }

    @Override
    public String scream() {
        return "кар-кар";
    }

    @Override
    public void move() {
        System.out.println("ворона умеет летать, ходить и прыгать");
    }


    @Override
    public void takeOff(String from) {

    }

    @Override
    public void land(String to) {

    }

    @Override
    public void flyStraight(String from, String to) {

    }
}
