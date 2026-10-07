package Lesson11.Animal;

public class Penguin extends Bird {

    int leg;

    public Penguin(String name, int leg, String color, int wings, int leg1) {
        super(name, leg, color, wings);
        this.leg = leg1;
    }

    @Override
    public String toString() {
        return "Penguin{" +
                "leg=" + leg +
                ", wings=" + wings +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
