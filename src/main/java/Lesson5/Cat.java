package Lesson5;

public class Cat {

    private String name = "Кот без имени";
    private String color;

    void meow() {
        System.out.println(this.name + ": мяу!");
    }

    public void rename(String newName) {
        if (newName.contains("1")) {
            System.out.println("имя кота не может содержать 1");
        } else {
            name = newName;
        }
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public Cat() {
        color = "серый";
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Cat(String name) {
        rename(name);
    }

    public static void main(String[] args) {

        Cat cat1 = new Cat();
        cat1.meow();
        cat1.rename("Барсик");
        cat1.meow();
        cat1.rename("котэ 123");
        cat1.meow();
        System.out.println("кота зовут " + cat1.getName());

        Cat cat2 = new Cat("Рыжик");
        cat2.setColor("рыжий");
        cat2.meow();
        cat1.meow();
        Cat cat3 = new Cat("кот 1111");
        cat3.meow();

    }
}