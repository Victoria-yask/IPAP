package Lesson11.Animal;

public class Woodpecker extends Bird {
    String colorBeak;

    public Woodpecker(String name, int leg, String color, int wings, String colorBeak) {
        super(name, leg, color, wings);
        this.colorBeak = colorBeak;
    }

    @Override
    public String toString() {
        return "Woodpecker{" +
                "colorBeak='" + colorBeak + '\'' +
                ", wings=" + wings +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
