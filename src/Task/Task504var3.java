package Task;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Task504var3 {
    public static void main(String[] args) throws IOException {
        String inputFName = "INPUT.TXT";
        Scanner scanner = new Scanner(new File(inputFName));
        int k = scanner.nextInt();
        String pos;
        String pos1 = "VGC";
        String pos2 = "CVG";
        String pos3 = "GCV";

        if (k % 3 == 0) {
            pos = pos3;
        } else {
            if (k % 3 == 2) {
                pos = pos2;
            }
            else
                pos = pos1;
        }

        String outputFName = "OUTPUT.TXT";
        Files.writeString(Path.of(outputFName), pos);
        System.out.println("Успешно записано в файл : " + pos);
    }
}
