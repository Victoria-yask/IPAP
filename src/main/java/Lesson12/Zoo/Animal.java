package Lesson12.Zoo;

public abstract class Animal {
    private String name;
    private double weight;

    public Animal(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if(weight>0)
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal() {
        this.name = name;
        setWeight(weight);
    }

    public abstract void move();

    public abstract void makeSound();

    @Override
    public String toString() {
        return getClass().getName() +"{" +
                "name='" + name + '\'' +
                '}';
    }
}
