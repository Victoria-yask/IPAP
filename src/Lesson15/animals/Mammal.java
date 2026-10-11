package Lesson15.animals;

public class Mammal extends Animal {
    public Mammal(String name, String color) {
        super(name, color);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " " + name+ " " + color;
    }
}
