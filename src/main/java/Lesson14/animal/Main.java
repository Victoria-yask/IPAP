package Lesson14.animal;

import java.util.Arrays;

public class Main {

    static void main() {
        Mosquito[] mosquitos = new Mosquito[12];
        for (int i = 0; i < mosquitos.length; i++) {
            mosquitos[i] = new Mosquito();
        }
        System.out.println("Всего комаров " + Mosquito.countMosquitoes(mosquitos));
        Mosquito.makeSound(mosquitos);
        Frog.catchMosquitoes(mosquitos);
        System.out.println("Всего комаров " + Mosquito.countMosquitoes(mosquitos));

    }
}
