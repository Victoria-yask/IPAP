package Lesson14.Generic;

public class Nut {

    final double weight;

    public Nut(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Орех " +
                "вес = " + weight;
    }
}
