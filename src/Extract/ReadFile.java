package Extract;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadFile {

    static void main() throws FileNotFoundException {
        showNamesFromFile("file/extract/names1.txt");
        showNamesFromFile("file/extract/names2.txt");
        showNamesfromFileWithN("file/extract/names1.txt");
        showNamesfromFileWithN("file/extract/names2.txt");
        showNamesfromFileWithN("file/extract/names3.txt");
        showNamesfromFileWithN("file/extract/names4.txt");
    }

    public static void showNamesFromFile(String fname) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(fname));
        System.out.println("чтение файла " + fname);
        while (sc.hasNext()){
            String s = sc.next();
            System.out.println(s);
        }
        System.out.println("-----------end");
    }

    public static void showNamesfromFileWithN(String fname) {
        try {
            Scanner sc = new Scanner(new File(fname));
            System.out.println("чтение файла " + fname);
            int n = sc.nextInt();
            for (int i = 0; i < n && sc.hasNext(); i++) {
                String s = sc.next();
                System.out.println(s);
            }
            System.out.println("-----------end");
        }
        catch (IOException e){
            e.printStackTrace();
        }
        catch (InputMismatchException e){
            System.out.println("неправильная структура файла " +fname);
        }
    }
}
