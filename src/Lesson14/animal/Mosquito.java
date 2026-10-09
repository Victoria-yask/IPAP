package Lesson14.animal;

public class Mosquito {
    private boolean alive = true;

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public static void makeSound(Mosquito[] mos) {
        for (int i = 0; i < mos.length; i++) {
            if (mos[i].isAlive()) {
                System.out.println("комар жжжжж");
            }
        }
    }

    public static int countMosquitoes(Mosquito[] mos) {
        int countMos = 0;
        for (int i = 0; i < mos.length; i++) {
            if (mos[i].isAlive())
                countMos++;
        }
        return countMos;
    }
}
