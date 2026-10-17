package Practice9.elephant;

public class Elephant {
    String name;
    int age;
    double trunkLenght;
    double weight;

    public Elephant(String name, int age, double trunkLenght, double weight) {
        this.name = name;
        this.age = age;
        this.trunkLenght = trunkLenght;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Elephant{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", trunkLenght=" + trunkLenght +
                ", weight=" + weight +
                '}';
    }

    public int getAge() {
        return age;
    }
}
