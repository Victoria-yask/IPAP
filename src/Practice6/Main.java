package Practice6;

public class Main {

    public static void main(String[] args) {
        Figure[] figures = {
                new Figure("Король", "белый"),
                new Figure("Ферзь", "белый"),
                new Figure("Ладья", "белый"),
                new Figure("Слон", "чёрный"),
                new Figure("Конь", "чёрный"),
                new Figure("Пешка", "чёрный")
        };
        printFigures(figures);

        int countWhite = countColor(figures, "белый");
        int countBlack = countColor(figures, "чёрный");

        System.out.println("Количество белых:  " + countWhite);
        System.out.println("Количество чёрных: " + countBlack);
        System.out.println("Процент белых:  " + percentColor(figures, "белый") + "%");
        System.out.println("Процент чёрных: " + percentColor(figures, "чёрный") + "%");
        System.out.println("Количество пешек: " + countName(figures, "Пешка"));
        System.out.println("Количество коней: " + countName(figures, "Конь"));
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

    //процент количества белых/черных от общего количества
    public static double percentColor(Figure[] figures, String color) {
        int count = countColor(figures, color);
        return count * 100.0 / figures.length;
    }

    //количество пешек/ коней
    public static int countName(Figure[] figures, String name) {
        int count = 0;
        for (int i = 0; i < figures.length; i++) {
            if (figures[i].getName().equals(name)) {
                count++;
            }
        }
        return count;
    }
}


