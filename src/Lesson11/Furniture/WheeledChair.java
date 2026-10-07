package Lesson11.Furniture;

import java.io.PrintStream;

public class WheeledChair extends Chair {
    public WheeledChair(String color, String material, double height, int x, int y) {
        super(color, material, height, x, y);
    }

    public void moveTo(int newX, int newY) {
        PrintStream var10000 = System.out;
        int var10001 = this.getX();
        var10000.println("плавно катим стул из " + var10001 + ", " + this.getY() + " в " + newX + ", " + newY);
        this.x = newX;
        this.y = newY;
    }

    public void adjustHeight(double h) {
        this.height = h;
    }
}
