package Practice6;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = {
                new Figure("Король", "белый"),
                new Figure("Ферзь", "белый"),
                new Figure("Ладья", "белый"),
                new Figure("Слон", "чёрный"),
                new Figure("Конь", "чёрный"),
                new Figure("Пешка", "чёрный")     // ← без запятой
        };

        Figure.printFigures(figures);
        System.out.println("Количество белых:  " + Figure.countColor(figures, "белый"));
        System.out.println("Количество чёрных: " + Figure.countColor(figures, "чёрный"));
        System.out.println("Процент белых:  "  + Figure.percentColor(figures, "белый") + "%");
        System.out.println("Процент чёрных: "  + Figure.percentColor(figures, "чёрный") + "%");
        System.out.println("Количество пешек: " + Figure.countByName(figures, "Пешка"));
        System.out.println("Количество коней: " + Figure.countByName(figures, "Конь"));
    }
}

