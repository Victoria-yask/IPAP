package Practice7.Task4;

public class Main {
    static void main() {
        Nut[] nuts = Tree.growNut(15);
        Squirrel squirrel = new Squirrel();
        squirrel.pickNuts(nuts);
    }
}
