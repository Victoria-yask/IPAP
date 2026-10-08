package Lesson12.Zoo.Bird;
import Lesson12.Zoo.Flyer;
import Lesson12.Zoo.Jumper;

public class Ostrich extends Bird implements Jumper, Flyer {

    public Ostrich(String featherColor) {
        super(featherColor);
    }

    public Ostrich(String name, double weight, String featherColor) {
        super(name, weight, featherColor);
    }

    @Override
    public String scream() {
        return "страус кричит";
    }

    @Override
    public void move() {
        System.out.println("страус умеет бегать, ходить и прыгать");
    }

    @Override
    public void jump() {
        System.out.println("страус прыгает");
    }

    @Override
    public void takeOff(String from) {
        System.out.println(getName()+"взлетает из" + from);
    }

    @Override
    public void land(String to) {
        System.out.println(getName()+"приземляется в " + to);
    }

    @Override
    public void flyStraight(String from, String to) {
        System.out.println(getName()+"летит из " + from + " в " + to);
    }
}

