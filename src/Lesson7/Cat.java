package Lesson7;

public class Cat {

    private String name;
    private int age;
    private int weight;

    public Cat(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public void run(){
        System.out.println("бегает");
    }

    public void jump(){
        System.out.println("прыгает");
    }

    public void eat(){
        System.out.println("кушает");
    }

    public void sleep(){
        System.out.println("спит");
    }

    static void main() {
        Cat cat1 = new Cat("Шип", 15, 6);
        System.out.println("Кот " + cat1.name + "возраст " + cat1.age + " вес " + cat1.weight);
        cat1.run();
    }
}
