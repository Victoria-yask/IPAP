package Task;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Scanner;

public class Task869var2 {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("file/task869/input.txt"));
        int n = scanner.nextInt();
        final int D = scanner.nextInt();
        int[] weights = new int[n];

        for(int i = 0; i < weights.length; ++i) {
            weights[i] = scanner.nextInt();
        }

        int counter = 0;
        Arrays.sort(weights);
        int light = 0;
        int heavy = weights.length - 1;
        
        String s = String.valueOf(counter);
        Files.writeString(Path.of("output.txt"), s);



    }
}
