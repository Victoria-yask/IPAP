package Lesson11.Animal;

public class Bird extends Animal {

    int wings;

    public Bird(String name, int leg, String color, int wings) {
        super(name, leg, color);
        this.wings = wings;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "wings=" + wings +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
