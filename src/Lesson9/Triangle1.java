package Lesson9;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Scanner;

public class Triangle1 {
    static void main() throws IOException {
        String inputName = "file/tr.txt";
        Scanner scan = new Scanner(new File(inputName));
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        int perim = a+b+c;

        String outputF = "file/perim.txt";
        String s = String.valueOf(perim);
        Files.writeString(Path.of(outputF), s);
    }
}
