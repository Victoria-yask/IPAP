package Lesson5;

public class Rectangle {
    private double length, width;

    public Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
    }


    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double perimeter(){
        return 2*(length + width);
    }

    public double area(){
        return length * width;
    }

    public static Rectangle inputRectangle() {
        while (true){
        double length = Double.parseDouble(IO.readln("Введите длину: "));
        double width = Double.parseDouble(IO.readln("Введите ширину: "));
        if (length > 0 && width > 0) {
            return new Rectangle(length, width);
        } else
            System.out.println("Отрицательные числа вводить нельзя");
        }
    }

    public static void main(String[] args) {

        Rectangle rectangle1 = inputRectangle();
        System.out.println("Прямоугольник " + rectangle1.length + " x " + rectangle1.width);
        System.out.println("Периметр: " + rectangle1.perimeter());
        System.out.println("Площадь: " + rectangle1.area());

    }
}
