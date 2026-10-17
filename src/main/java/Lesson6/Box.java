package Lesson6;

public class Box {
    int a;

    public Box(int a) {
        this.a = a;
    }

    public void add(int b) {
        this.a += b;
    }

    public void whatIsInside() {
        System.out.println(this.a);
    }

    static void main()
    {
        Box box1 = new Box(10);
        Box box2 = new Box(20);

        int v = 1;
        for(int i = 0; i < 5; ++i) {
            v *= 2;
            box1.add(v);
            box2.add(2 * i);
        }

        box1.whatIsInside();
        box2.whatIsInside();
        System.out.println(box1.a);
        System.out.println(box2.a);
    }
}

