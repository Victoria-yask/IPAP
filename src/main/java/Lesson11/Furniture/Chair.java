package Lesson11.Furniture;

public class Chair {
    private String color;
    private String material;
    protected double height;
    protected int x;
    protected int y;

    public Chair(String color, String material, double height, int x, int y) {
        this.color = color;
        this.material = material;
        this.height = height;
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public String getColor() {
        return this.color;
    }

    public String getMaterial() {
        return this.material;
    }

    public double getHeight() {
        return this.height;
    }

    public void moveTo(int newX, int newY) {
        System.out.println("тащим стул из (" + this.x + ", " + this.y + ") в (" + newX + ", " + newY + ")");
        this.x = newX;
        this.y = newY;
    }

    public String toString() {
        String var10000 = this.getClass().getSimpleName();
        return var10000 + "{color='" + this.color + "', material='" + this.material + "', height=" + this.height + ", x=" + this.x + ", y=" + this.y + "}";
    }
}
