package Task.task235;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

import static Task.task235.Robot.getMove;

public class Main {
    static void main() throws FileNotFoundException {
        char[] commands = readFromF("file/task235/task235.txt");
        System.out.println(Arrays.toString(commands));
        System.out.println(getMove(commands));

    }
    
    //прочитать из файла
    public static char[] readFromF(String file) throws FileNotFoundException {
        Scanner scan = new Scanner(new File(file));
        String line = scan.nextLine();
        char[] commands = new char[line.length()];
        for (int i = 0; i < commands.length; i++) {
            commands[i] = line.charAt(i);
        }
        return commands;
    }


}
