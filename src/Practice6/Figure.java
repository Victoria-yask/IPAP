package Practice6;

public class Figure {

    private String name;
    private String color;

    public Figure(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {              // ← вот это нужно
        return name + " (" + color + ")";
    }

    //вывод фигур на экран
    public static void printFigures(Figure[] figures) {
        for (int i = 0; i < figures.length; i++) {
            System.out.println(figures[i]);
        }
    }

    //количество по цвету
    public static int countColor(Figure[] figures, String color) {
        int count = 0;
        for (int i = 0; i < figures.length; i++) {
            if (figures[i].getColor().equals(color)) {
                count++;
            }
        }
        return count;
    }


    //процент количества белых и процент количества черных от общего количества.
    public static double percentColor(Figure[] figures, String color) {
        int count = countColor(figures, color);
        return count * 100.0 / figures.length;
    }
    //количество пешек/ коней
    public static int countByName(Figure[] figures, String name) {
        int count = 0;
        for (int i = 0; i < figures.length; i++) {
            if (figures[i].getName().equals(name)) {
                count++;
            }
        }
        return count;
    }
}
