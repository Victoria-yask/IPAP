package Lesson11.Animal;

public class Penguin extends Bird {

    int leg;

    public Penguin(String name, String color, int wings) {
        super(name, color, wings);
        this.leg = leg;
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
