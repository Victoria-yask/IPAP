package Lesson10;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Str {
    static void main() throws FileNotFoundException {
        //example0();
        // example1();
        //example2();
        example3();
    }

    private static void example3() throws FileNotFoundException {
        String x = "мыла";
        String fname = "file/lesson10/words.txt";
        Scanner scanner = new Scanner(new File(fname));
        int n = scanner.nextInt();
        String[] mas = new String[n];

        for (int i = 0; i < mas.length; ++i) {
            mas[i] = scanner.next();
        }
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] == x)
                System.out.println("нашел");
        }
        for (int i = 0; i < mas.length; ++i) {
            if (mas[i].equals(x)) {
                System.out.println("Эврика!");
            }
        }
    }

        private static void example2() throws FileNotFoundException {
            String fname = "file/lesson10/words.txt";
            Scanner scanner = new Scanner(new File(fname));
            int n = scanner.nextInt();
            String[] mas = new String[n];
            for (int i = 0; i < n; i++) {
                mas[i] = scanner.next();
            }
            System.out.println(Arrays.toString(mas));
            Arrays.sort(mas);
            System.out.println(Arrays.toString(mas));
        }

        private static void example1 () {
            System.out.println("Введите два слова");
            Scanner scanner = new Scanner(System.in);
            String s1 = scanner.next();
            String s2 = scanner.next();
            if (s1.compareTo(s2) > 0) {
                System.out.println(s1 + " больше");
            } else {
                System.out.println(s2 + " больше");
            }
        }

        private static void example0 () {
            String s1 = "Патя";
            String s2 = "Петя";
            System.out.println(s1 + s2);
            if (s1.compareTo(s2) > 0) {
                System.out.println(s1 + " больше");
            } else {
                System.out.println(s2 + " больше");
            }
        }
    }

