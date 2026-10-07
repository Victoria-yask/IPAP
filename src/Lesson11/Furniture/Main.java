package Lesson11.Furniture;

public class Main {
    public static void main(String[] args) {
        Chair ch1 = new Chair("черный", "бархат", (double)45.0F, 2, 14);
        System.out.println(ch1);
        ch1.moveTo(2, 1);
        System.out.println(ch1);
        Chair[] massiv = new Chair[]{new Chair("красный", "бархат", (double)40.0F, 0, 1), new Chair("белый", "гобелен", (double)55.0F, 0, 9), new Chair("белый", "пластик", (double)45.0F, 0, 0)};
        printArray(massiv);
        rearrange(massiv, 5, 5, 10);
        printArray(massiv);
        WheeledChair[] massiv2 = new WheeledChair[]{new WheeledChair("черный", "велюр", (double)60.0F, 0, 0), new WheeledChair("синий", "велюр", (double)40.0F, 0, 0), new WheeledChair("черный", "пластик", (double)50.0F, 10, 0)};
        printArray(massiv2);
        rearrange(massiv2, 5, 50, 10);
        printArray(massiv2);
        Chair[] massiv3 = new Chair[]{new Chair("красный", "бархат", (double)45.0F, 0, 1), new WheeledChair("зеленый", "велюр", (double)55.0F, 0, 9), new Chair("белый", "пластик", (double)45.0F, 0, 0)};
        printArray(massiv3);
        rearrange(massiv3, 5, 50, 10);
        printArray(massiv3);
    }

    private static void printArray(Chair[] massiv) {
        System.out.println("====================================");

        for(int i = 0; i < massiv.length; ++i) {
            System.out.println(massiv[i]);
        }

        System.out.println("------------------------------------");
    }

    private static void rearrange(Chair[] massiv, int x0, int y0, int dx) {
        int x = x0;
        int y = y0;

        for(int i = 0; i < massiv.length; ++i) {
            massiv[i].moveTo(x, y);
            x += dx;
        }

    }
}
