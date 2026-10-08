package Lesson12.Zoo.Bird;

import Lesson12.Zoo.Animal;

abstract public class Bird extends Animal {
    String featherColor;

    public Bird(String featherColor) {
        this.featherColor = featherColor;
    }

    public Bird(String name, double weight, String featherColor) {
        super(name, weight);
        this.featherColor = featherColor;
    }

    public abstract String scream();

    @Override
    public void makeSound() {
        System.out.println(scream());
    }
}
