package Task;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Scanner;

public class Task504var2 {
    public static void main(String[] args) throws IOException {
        String inputFName = "INPUT.txt";
        Scanner scan = new Scanner(new File(inputFName));
        int p = scan.nextInt();
        String[] Flower = new String[]{"G", "C", "V"};

        for(int i = 1; i <= p; ++i) {
            String empty = Flower[1];
            Flower[1] = Flower[2];
            Flower[2] = empty;
            empty = Flower[0];
            Flower[0] = Flower[1];
            Flower[1] = empty;
            System.out.println(Arrays.toString(Flower));
        }

        String outputFName = "OUTPUT.TXT";
        String s = Arrays.toString(Flower);
        Files.writeString(Path.of(outputFName), s);
    }
}
