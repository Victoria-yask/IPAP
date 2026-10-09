package Lesson14.animal;

public class Frog {

    public static void catchMosquitoes(Mosquito[] mos) {
        for (int i = 0; i < mos.length; i++) {
            if (mos[i].isAlive()) {
                mos[i].setAlive(false);
                System.out.println("ква");
                System.out.println("убит 1 комар");
                return;
            }
        }
    }
}
