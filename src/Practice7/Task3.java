package Practice7;

import java.util.Scanner;

//Спросить пользователя "как тебя зовут?"
//прочитать его имя
//Если имя заканчивается на а, я или и, вывести "Приветик!", иначе вывести "Здарова!"
public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Как тебя зовут? ");
        String name = scan.nextLine();

        //endsWith
        if (name.endsWith("а") || name.endsWith("я") || name.endsWith("и")) {
            System.out.println("Приветик!");
        } else {
            System.out.println("Здарова!");
        }

        //substring
        String last = name.substring(name.length() - 1);

        if (last.equals("а") || last.equals("я") || last.equals("и")) {
            System.out.println("Приветик!");
        } else {
            System.out.println("Здарова!");
        }
    }


}


