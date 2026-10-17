package Task;

import java.util.Scanner;

//https://acmp.ru/index.asp?main=task&id_task=854
// troom -  заданная температура в комнате
// tcond - установленная на кондиционере желаемая температура
// режим «freeze» — охлаждение. только уменьшает темп. Если не больше желаемой, то он выключается.
//«heat» — нагрев. только увеличиватет темп. Если не меньше желаемой, то он выключается.
//«auto» — автоматический режим. как увеличивать, так и уменьшать температуру в комнате до желаемой.
// «fan» — вентиляция.только вентиляция воздуха и не изменяет температуру в комнате.
public class Task854 {

    private static final int MIN_TEMP = -50;
    private static final int MAX_TEMP = 50;

    //ввод температуры в комнате
    private static Scanner scanner = new Scanner(System.in);

    public static int inputTroom() {
        while (true) {
            System.out.print("Введите температуру в комнате: ");
            int troom = scanner.nextInt();

            if (troom >= MIN_TEMP && troom <= MAX_TEMP) {
                return troom;
            } else {
                System.out.println("Температура комнаты должна быть от " + MIN_TEMP + " до " + MAX_TEMP);
            }
        }
    }


    //ввод температуры на окндиционере
    public static int inputTcond() {
        while (true) {
            System.out.print("Введите температуру на кондиционере: ");
            int tcond = scanner.nextInt();
            if (tcond >= MIN_TEMP && tcond <= MAX_TEMP) {
                return tcond;
            } else {
                System.out.println("Температура кондиционера должна быть от " + MIN_TEMP + " до " + MAX_TEMP);
            }
        }
    }

    //ввод режима

    public static String inputMode() {
        System.out.print("Выберите режим (freeze / heat / auto / fan): ");
        return scanner.nextLine(); // Читаем введенную строку
    }



    //применение режима
    public static int applyMode(String mode, int troom, int tcond) {
        if (mode.equals("freeze")) {
            if (troom > tcond) {
                return tcond;
            } else
                return troom;

        } else if (mode.equals("heat")) {
            if (troom < tcond) {
                return tcond;
            } else
                return troom;

        } else if (mode.equals("auto")) {
            return tcond;

        } else //fan
            return troom;
        }

    public static void main(String[] args) {
        int troom = inputTroom();
        int tcond = inputTcond();
        String mode = inputMode();
        int result = applyMode(mode, troom, tcond);
        System.out.println("Температура через час: " + result);
    }
}




