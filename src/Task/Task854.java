package Task;
//https://acmp.ru/index.asp?main=task&id_task=854
import Lesson5.Rectangle;
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
    public static int inputTroom() {
        while (true) {
            int troom = Integer.parseInt(IO.readln("Введите температуру в комнате: "));
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
            int tcond = Integer.parseInt(IO.readln("Введите температуру на кондиционере: "));
            if (tcond >= MIN_TEMP && tcond <= MAX_TEMP) {
                return tcond;
            } else {
                System.out.println("Температура кондиционера должна быть от " + MIN_TEMP + " до " + MAX_TEMP);
            }
        }
    }

    //ввод режима
    public static String inputMode() {
        return IO.readln("Выберите режим (freeze / heat / auto / fan): ");
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




